package class02.Homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
    /*
    navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0
       fill out the form
       click on register
       close the browser
     */
    public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

    WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0");

        driver.findElement(By.id("customer.firstName")).sendKeys("Omid");
        driver.findElement(By.id("customer.lastName")).sendKeys("Salaah");
        driver.findElement(By.id("customer.address.street")).sendKeys("20 Danny Cres");
        driver.findElement(By.id("customer.address.city")).sendKeys("Ajax");
        driver.findElement(By.id("customer.address.state")).sendKeys("ON");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("L1T0A0");
        driver.findElement(By.id("customer.ssn")).sendKeys("122333444455555");
        driver.findElement(By.id("customer.username")).sendKeys("omidsalaah");
        driver.findElement(By.id("customer.password")).sendKeys("omidomid4");
        driver.findElement(By.id("repeatedPassword")).sendKeys("omidomid4");
        driver.findElement(By.className("button")).click();

        Thread.sleep(1500);

        driver.close();



    }
}