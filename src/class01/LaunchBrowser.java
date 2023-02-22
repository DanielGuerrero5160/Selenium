package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        //tell your project where the webdriver is located
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");

        //create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
        //open google.com
        driver.get("https://www.facebook.com/");
         String URL=driver.getCurrentUrl();
        System.out.println(URL);
        //get title of webpage
       String title= driver.getTitle();
       //print title
        System.out.println("The title of the page is: "+ title);
        //slow down/pause for 3 seconds before closing the browser
        Thread.sleep(3000);
        driver.quit();
//


    }

}
