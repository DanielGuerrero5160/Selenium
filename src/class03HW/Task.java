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
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        driver.manage().window().maximize();
WebElement EnterMessage=driver.findElement(By.xpath("//input[@placeholder='Please enter your Message']"));
EnterMessage.sendKeys("This is my message");
WebElement showMessage=driver.findElement(By.xpath("//button[text()='Show Message']"));
showMessage.click();
WebElement enterA=driver.findElement(By.xpath("//input[@id='sum1']"));
enterA.sendKeys("25");
        WebElement enterB=driver.findElement(By.xpath("//input[@id='sum2']"));
        enterB.sendKeys("30");
WebElement getTotal= driver.findElement(By.xpath("//button[text()='Get Total']"));
        getTotal.click();
        WebElement total=driver.findElement(By.xpath("//span[@id='displayvalue']"));
        System.out.println(total.getText());

        System.out.println(getTotal.getAttribute("type"));
    }
}
