package class01HW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com/");
String url=driver.getCurrentUrl();
String title= driver.getTitle();
        System.out.println(url);
        System.out.println(title);
        driver.close();
    }
}
