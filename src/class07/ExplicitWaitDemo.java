package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        //open site
        driver.get("http://practice.syntaxtechs.net/dynamic-elements-loading.php");
        driver.manage().window().maximize();
        WebElement startButton=driver.findElement(By.xpath("//button[@id='startButton']"));
        startButton.click();
        //as the element that contain the text becomes visible after some time,
        //so first we need to implement the Explicit wait and then get the text.
        WebDriverWait wait=new WebDriverWait(driver,20);//20 is the max wait time
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Welcome Syntax Technologies']")));

        //once the element is visible, then egt the text
WebElement text=driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
String welcomeText=text.getText();
        System.out.println(welcomeText);
    }
}
