package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TablesDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        //open site
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
        username.sendKeys("Admin");
        WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement submit=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        submit.click();
        WebElement pimButton=driver.findElement(By.xpath("//b[text()='PIM']"));
        pimButton.click();
        //make a list of column 2

//in order to find the desired ID, we gotta iterate thru it
        boolean idFound=false;
while(!idFound) {//while id is not found, keep running inner loop
    //we need the list in the loop because the dom refreshes when we switch pages, so the element is discarded.
    //with the list in the loop, ti will find the id list again
    //if the list is out of the loop, we get a stale element exception
    List<WebElement> idList=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
    for (int i = 0; i < idList.size(); i++) {
        String id = idList.get(i).getText();
        if (id.equalsIgnoreCase("46266A")) {

            WebElement checkbox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
            checkbox.click();
            idFound=true;
            break;
        }

    }
    if(!idFound) {
        WebElement nextButton = driver.findElement(By.xpath("//a[text()='Next']"));
        nextButton.click();
    }
}
    }
}
