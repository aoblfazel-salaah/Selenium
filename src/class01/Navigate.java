package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver=new ChromeDriver();

        //get waits until the full page is loaded
        driver.get("https://www.google.com/");
        Thread.sleep(1000);

        //now navigate to facebook
        driver.navigate().to("https://www.facebook.com/");

        Thread.sleep(1000);

        // go back
        driver.navigate().back();

        Thread.sleep(1000);

        // go forward
        driver.navigate().forward();

        Thread.sleep(1000);

        // refresh page
        driver.navigate().refresh();

        Thread.sleep(1000);
        driver.close();//will close the current tab only
        //quit() will close the whole browser


    }
}
