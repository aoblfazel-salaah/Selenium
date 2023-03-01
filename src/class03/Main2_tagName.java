package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main2_tagName {
    public static void main(String[] args) throws InterruptedException {
//        go to amazon .com and get all the links ;)
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.ca/");

//        get all the links
//        all of them are in <a>

        List<WebElement> tags= driver.findElements(By.tagName("a"));
        for (WebElement tag:tags){
            String link=tag.getAttribute("href");
            System.out.println(link);
        }
        Thread.sleep(1000);
        driver.quit();
    }
}
