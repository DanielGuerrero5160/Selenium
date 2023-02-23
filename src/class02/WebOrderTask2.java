package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderTask2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        //good practice is to maximize the screen-Some elements may not work if not
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //good practice is to maximize the screen-Some elements may not work if not
        driver.manage().window().maximize();
        //enter username
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        //send password
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");

//click login button
        driver.findElement(By.className("button")).click();
        //get title and verify if title is correct
        String title=driver.getTitle();
      if(title.equals("Web Orders")){
          System.out.println("The title is correct");
    }else{
          System.out.println("Title is not correct");
      }
      //logout
        driver.findElement(By.linkText("Logout")).click();

      //close browser
        driver.quit();


    }
}
