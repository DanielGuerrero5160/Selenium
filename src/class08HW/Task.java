package class08HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FilterOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task {
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
        List<WebElement> idList=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

        for (int i = 0; i < idList.size(); i++) {
            String str=idList.get(i).getText();
            if(str.equalsIgnoreCase("52306A")){
                System.out.println(str);
                WebElement box=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+(i+1)+"]/td[1]"));
                box.click();
            }

        }
    }
}
