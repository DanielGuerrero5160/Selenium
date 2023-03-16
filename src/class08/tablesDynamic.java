package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class tablesDynamic {
    public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
            WebDriver driver=new ChromeDriver();
            //open site
            driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            //enter the username in the text box
            WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
            username.sendKeys("Tester");
//        enter the password
            WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
            password.sendKeys("test");

//        click on login button
            WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
            loginButton.click();
//task: Check the checkbox containing the product screensaver
      List<WebElement> column=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[3]"));
      //iterate through each to see if it contains screensaver
        for (int i = 0; i < column.size(); i++) {
            //extract text
           String text=column.get(i).getText();
           if(text.equalsIgnoreCase("ScreenSaver")){
               System.out.println("The screensaver is located at row number: "+(i+2));
               System.out.println("Check the checkbox");
              WebElement checkBox=driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["+(i+2)+"]/td[1]"));//dybnamically accessing the checkbox on each row
               //the above is dynamically finding the checkbox
               checkBox.click();


           }

        }

    }
}
