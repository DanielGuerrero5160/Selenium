package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calendar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        //open site
        driver.get("https://www.delta.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement calendar=driver.findElement(By.xpath("//span[text()='Depart']"));
        calendar.click();
        //get the month from the calendar
      WebElement month=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));
      //get the next button
        WebElement next=driver.findElement(By.xpath("//span[text()='Next']"));
        Boolean monthFound=false;
        while(!monthFound){
            String monthStr=month.getText();
            if(monthStr.equalsIgnoreCase("August")){
                //select the day
                List<WebElement> days=driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']/tbody/tr/td"));
                for (WebElement day:days){
                    String datText=day.getText();
                    if(datText.equalsIgnoreCase("20")){
                        day.click();
                        monthFound=true;
                        break;
                    }

                }
            } else{
                next.click();
            }
        }
    }
}
