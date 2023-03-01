package class03HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) {
        /*
        enter the message in the text box
click on show message
Enter value of a
Enter value of B
click on the button get total
also please print the value of the attribute type of the button GET TOTAL

         */

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        //open site
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        driver.manage().window().maximize();
        //enter message
WebElement EnterMessage=driver.findElement(By.xpath("//input[@placeholder='Please enter your Message']"));
EnterMessage.sendKeys("This is my message");
//click show message
WebElement showMessage=driver.findElement(By.xpath("//button[text()='Show Message']"));
showMessage.click();
//enter first number
WebElement enterA=driver.findElement(By.xpath("//input[@id='sum1']"));
enterA.sendKeys("25");
//enter second number
        WebElement enterB=driver.findElement(By.xpath("//input[@id='sum2']"));
        enterB.sendKeys("30");
        //click get total
WebElement getTotal= driver.findElement(By.xpath("//button[text()='Get Total']"));
        getTotal.click();
        //printing the output of the get total button
        WebElement total=driver.findElement(By.xpath("//span[@id='displayvalue']"));
        System.out.println(total.getText());
//printing the value of attribute type
        System.out.println(getTotal.getAttribute("type"));
    }
}
