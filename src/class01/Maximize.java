package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        //go to google
        driver.get("https://www.google.com/");
        //maximize window
        driver.manage().window().maximize();
        //Open full screen of window
        driver.manage().window().fullscreen();
        //close
        driver.close();

    }
}
