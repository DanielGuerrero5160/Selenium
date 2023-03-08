package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        //open site
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();
        WebElement MultiSelectDropDown=driver.findElement(By.xpath("//select[@id='multi-select']"));
Select sel=new Select(MultiSelectDropDown);
//select by value
        sel.selectByValue("New Jersey");
        Thread.sleep(2000);
        //select by index
        sel.selectByIndex(5);
        Thread.sleep(2000);

        //select by visible text
        sel.selectByVisibleText("Ohio");
        Thread.sleep(2000);

        //when it comes to multi-select drop-downs, we can also deselect
        sel.deselectByValue("New Jersey");

        //How to check if a drop-down is single or multi select
        System.out.println("The dropdown is multiple? "+sel.isMultiple());//returns boolean of it is multiple select.

    }
}
