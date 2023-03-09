package class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    //types of alerts
//    JavaScript alerts -- 1.Simple Alert 2.Confirmation Alert 3.Prompt Alert
//    html based popups
//    window based --> we can't deal with them using selenium

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/javascript-alert-box-demo.php");

        WebElement alertBtn=driver.findElement(By.xpath(
                "//button[@onclick='myAlertFunction()']"));
        alertBtn.click();
        Thread.sleep(1000);

        Alert alert=driver.switchTo().alert(); //switch focus to alert
        alert.accept(); //simple alert - accept

//        --------------------------------------------------

        WebElement alertBtn2=driver.findElement(By.xpath(
                "//button[@onclick='myConfirmFunction()']"));
        alertBtn2.click();
        Thread.sleep(1000);

        alert.dismiss();

//        --------------------------------------------------
        WebElement alertBtn3=driver.findElement(By.xpath(
                "//button[@onclick='myPromptFunction()']"));
        alertBtn3.click();
        Thread.sleep(1000);

        alert.sendKeys("Omid");
        alert.accept();


    }
}
