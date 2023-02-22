package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(1000);

        //maximize
        driver.manage().window().maximize();

        //full screen
        driver.manage().window().fullscreen();


    }
}
