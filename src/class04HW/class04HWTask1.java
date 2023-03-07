package class04HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class04HWTask1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        //open site
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        driver.manage().window().maximize();
        WebElement singleCheckBoxDemo=driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        Boolean isSelected=singleCheckBoxDemo.isSelected();
        System.out.println(isSelected);
    if(!isSelected){
        singleCheckBoxDemo.click();

    }
        isSelected=singleCheckBoxDemo.isSelected();
        System.out.println("is the checkbox selected? "+isSelected);


    }
}
