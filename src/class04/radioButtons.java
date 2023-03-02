package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButtons {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        //open site syntax site
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        //maximize window
        driver.manage().window().maximize();
        WebElement maleButton=driver.findElement(By.cssSelector("input[value='Male']"));

        //check if button is enabled or not
      Boolean isEnabledMale=maleButton.isEnabled();
        System.out.println("the radio button male is enabled "+isEnabledMale);
        //check if male button is displayed
        Boolean isDisplayedMale=maleButton.isDisplayed();
        System.out.println(isDisplayedMale);
        //check if button is selected or not
        Boolean isSelectedMale=maleButton.isSelected();
        System.out.println(isSelectedMale);
        //if the button is not selected click it
        if(!isSelectedMale){
            maleButton.click();
        }
       isSelectedMale=maleButton.isSelected();//we are re-assigning the variable to the status of isSeleted
        System.out.println("the status of the selction is "+isSelectedMale);




    }
}
