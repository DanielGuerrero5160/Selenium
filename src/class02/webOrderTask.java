package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webOrderTask {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //good practice is to maximize the screen-Some elements may not work if not
        driver.manage().window().maximize();
        //enter username
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        //send password
driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");

//click login button
        driver.findElement(By.className("button")).click();
    }
}
