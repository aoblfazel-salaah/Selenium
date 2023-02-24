package class02.Homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {
    /*
    navigate to fb.com
    click on create new account
    fill up all the text-boxes
    click on sign up button
    close the pop up
    close the browser
    TIP for HW2:
    just fill in text boxes or button, no need to deal with other webElements
    also u will need a Thread.sleep after clicking on create new account 🙂
    we will discuss "WHY" in future

     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        //        open up fb.com
        driver.get("https://www.facebook.com");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(1000);

        driver.findElement(By.name("firstname")).sendKeys("Gul");
        driver.findElement(By.name("lastname")).sendKeys("Agha");
        driver.findElement(By.name("reg_email__")).sendKeys("omidsalaah@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("omidomid@4");
        driver.findElement(By.name("websubmit")).click();
        driver.findElement(By.id("u_2_9_Iq")).click();

        driver.close();











    }
}
