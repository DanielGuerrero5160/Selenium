package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TablesSimple {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        //open site
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //task 1
        //get the whole table accessed and print on the console
        WebElement table=driver.findElement(By.xpath("//table[@id='customers']"));
      String tableData=table.getText();
        //System.out.println(tableData); //this will print the table, but it will be in a string

        //task 2, get the rows of the table and print them-row level access
//print row that contains company google
       List<WebElement> Rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
       for(WebElement row:Rows){
           String rowText=row.getText();
           if(rowText.contains("Google")){
               //System.out.println(rowText);
           }
       }
       //task 3: Column level access
        List<WebElement> columns=driver.findElements(By.xpath("//table[@id='customers']//tbody/tr/td"));
       for(WebElement column:columns){
           System.out.println(column.getText());
       }
       //task 4 -print column of every dow
        List<WebElement> firstColumn=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
       for (WebElement e:firstColumn){
           System.out.println(e.getText());
       }


    }
}
