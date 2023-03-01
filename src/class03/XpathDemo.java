package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        driver.manage().window().maximize();
     WebElement username= driver.findElement(By.xpath("//input[contains(@name,'username')]"));
username.sendKeys("Tester");
WebElement password= driver.findElement(By.xpath("//input[@type='password']"));
password.sendKeys("test");
WebElement usernameText=driver.findElement(By.xpath("//label[text()='Username:']"));
      //printing text by username box
        System.out.println(usernameText.getText());

        //finding element of text next to password box
        WebElement passwordText=driver.findElement(By.xpath("//label[text()='Password:']"));
        //getting text from the element and saving it in a string
        String pasText=passwordText.getText();
        //printing the string of the text by the password box
        System.out.println(pasText);
        //username.clear();//clearing username
        //password.clear();//clearing password
        //WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
       // login.click();
    }
}
