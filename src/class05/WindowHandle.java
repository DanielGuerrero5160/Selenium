package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        //open site
        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S655266611%3A1678243122182288&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHdNnHHAqXchkJEvbhvJTjZL7Eei8WwDplFSMeumr21bSAUo1b2TfowVVBFA-eniSukLpkqt");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Help']")).click();
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();
       String parentWindow=driver.getWindowHandle();//returns handle of window where the current focus is
        System.out.println(parentWindow);
        //get window handle of all windows that have been opened
      Set<String> windowHandles=driver.getWindowHandles();
        for(String wh:windowHandles){
          //witch the focus of the driver to help window
            driver.switchTo().window(wh);
            //Check the title of the window to which our focus is right now
            String title=driver.getTitle();
            if(title.equalsIgnoreCase("Privacy Policy – Privacy & Terms – Google")){
                break;
            }
        }
        //to verify we switched to the right window
        System.out.println(driver.getTitle());
        driver.switchTo().window(parentWindow);
    }
}
