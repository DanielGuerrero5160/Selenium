package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {
       // connect to webdriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        //open google.com
        driver.get("https://www.google.com/");
        //slow down
        Thread.sleep(2000);
        //now navigate to facebook
        driver.navigate().to("https://www.facebook.com/");
        //slow down
        Thread.sleep(2000);
        //go back
        driver.navigate().back();
        //slow down
        Thread.sleep(2000);
        //go back to facebook again-like the forward button
        driver.navigate().forward();
        //refresh
        driver.navigate().refresh();
        //close the browser
        driver.close();
    }
}
