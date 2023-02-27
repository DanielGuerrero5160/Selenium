package class02HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser
 */

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
driver.manage().window().maximize();
driver.findElement(By.id("customer.firstName")).sendKeys("Daniel");
driver.findElement(By.id("customer.lastName")).sendKeys("Guerrero");
driver.findElement(By.id("customer.address.street")).sendKeys("123 5th Street");
driver.findElement(By.id("customer.address.city")).sendKeys("Fairfax");
driver.findElement(By.id("customer.address.state")).sendKeys("VA");
driver.findElement(By.id("customer.address.zipCode")).sendKeys("22042");
driver.findElement(By.id("customer.phoneNumber")).sendKeys("888-777-6666");
driver.findElement(By.id("customer.ssn")).sendKeys("1233445656");
driver.findElement(By.id("customer.username")).sendKeys("drt32241");
driver.findElement(By.id("customer.username")).sendKeys("drt32241");
driver.findElement(By.id("customer.password")).sendKeys("pass123word");
driver.findElement(By.id("repeatedPassword")).sendKeys("pass123word");
driver.findElement(By.className("button")).click();
driver.close();









    }
}
