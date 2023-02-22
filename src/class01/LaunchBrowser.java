package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {

        // tell your project where the web-driver is located.
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        //create an instance of the Driver

        WebDriver driver= new ChromeDriver();

        //open the website google.com

        driver.get("https://www.facebook.com/");

        //get the current url that is there in the browser and store it in a var
        String URL = driver.getCurrentUrl();

        //print the URL
        System.out.println(URL);

        // get the title of the webpage
        String title=driver.getTitle();
        System.out.println("The title of the page is "+title);

        //slow down for 3 secs
        Thread.sleep(3000);

        driver.quit(); //or drive.close();
    }
}
