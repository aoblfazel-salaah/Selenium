package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderTask2 {
    /*
    open the page
    login
    verify title
    log out
     */

    //ctrl f to search in the DOM
    //whenever searched for a tag //is used --> //a  for tag a
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");


            driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
            driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
            driver.findElement(By.className("button")).click();

            String title = driver.getTitle();
            System.out.println(title);

            if (title.equals("Web Orders")) {
                System.out.println("The title is correct");
            } else {
                System.out.println("The title is not correct");
            }

            driver.findElement(By.linkText("Logout")).click();

            driver.quit();

    }
}
