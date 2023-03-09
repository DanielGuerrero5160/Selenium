package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        //open site
        driver.get("http://www.uitestpractice.com/Students/Switchto");
        driver.manage().window().maximize();
        //switch to the iframe which contains the input box
        driver.switchTo().frame(0);//iframes start at index 0
WebElement textbox=driver.findElement(By.xpath("//input[@id='name']"));
textbox.sendKeys("Antidisestablishmentarianism");
//return to get the name that was entered
        driver.switchTo().defaultContent();
        WebElement text=driver.findElement(By.xpath("//h3"));
        System.out.println("Test is : "+text.getText());
//switch back to the iframe using name or id
        driver.switchTo().frame("iframe_a");
        //get the label of the thing we want
        WebElement getLabel=driver.findElement(By.xpath("//label"));
        System.out.println("The label is : "+getLabel.getText());

        //switch focus back to the main page
        driver.switchTo().defaultContent();
        //clear whatever is in the text box
        //find the web Element for the frame and save it as a Web element
        //use the switch to method for web element and pass in the web element
      WebElement frame1=driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
      driver.switchTo().frame(frame1);
      textbox.clear();


    }
}
