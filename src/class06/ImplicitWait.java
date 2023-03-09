package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    //two types of wait -- 1. Implicit wait
//    it is going to wait for the WebElement to be found until the timeout

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
        //we need a wait here cuz new code appears after last step
        driver.findElement(By.name("firstname")).sendKeys("Omid");


        //explicit wait or conditional wait
//        e.g. wait for the element to be visible
//        e.g. wait for the element to be clickable
//        e.g. wait for the element to be Enabled


    }
}
