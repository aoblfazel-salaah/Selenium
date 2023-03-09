package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        /*
        A window handle stores the unique address of the browser windows.
        It is just a pointer to a window, whose return type is alphanumeric.
         */
//        driver.getWindowHandle() -- returns us the handle of the current window on which the focus is
//        driver.getWindowHandles() -- returns us the handle of all the windows that are opened
//        but in what order is it going to return the handles -- in a set = random order
//        driver.switchTo.window(handle)

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://accounts.google.com/v3/signin/identifier?" +
                "dsh=S1342696965%3A1678243065698072&ifkv=AWnogHfd4w7cCwIgr9rXy5di" +
                "FwxwWbmb6Q3IvFVpEyeh9Pvv-l8_FldqSUykI7wmn1UzjieyFE8hmQ&flowName" +
                "=GlifWebSignIn&flowEntry=ServiceLogin");

//        click on the help button
        driver.findElement(By.xpath("//a[text()='Help']")).click();

//        click on privacy
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();

//        get the window handle of the parent window
        String parentWindowHandle=driver.getWindowHandle();
        System.out.println(parentWindowHandle);

//        get all the handles of the windows open
        Set<String> windowHandles = driver.getWindowHandles();
        for (String wh : windowHandles) {
            driver.switchTo().window(wh);
            String title = driver.getTitle();
            if (title.equalsIgnoreCase("google account help")){
                break;
            }

        }
        System.out.println(driver.getTitle());
    }
}
