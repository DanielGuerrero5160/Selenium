package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        //open site
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();
      WebElement dropDown=driver.findElement(By.xpath("//select[@id='select-demo']"));
//passing the webElement into select object
      Select sel=new Select(dropDown);
      //using select class, we have different methods to select the desired option
        //select by indes
        sel.selectByIndex(1);
        Thread.sleep(2000);
        //select by value
        sel.selectByValue("Tuesday");
        Thread.sleep(2000);
        //select by test
        sel.selectByVisibleText("Friday");
        Thread.sleep(2000);
    }
}
