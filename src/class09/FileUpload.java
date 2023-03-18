package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FileUpload {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        //open site
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement chooseFileButton=driver.findElement(By.xpath("//input[@id='file-upload']"));
        chooseFileButton.sendKeys("/Users/danielguerrero/Desktop/SelemiumTest/src/screenshot/iou.png");
        //sometimes the extension like png above will not be in the path and we will need to write proper
        //extensions such as .txt


    }
}
