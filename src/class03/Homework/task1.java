package class03.Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
    /*
    enter the message in the text box
    click on show message
    Enter value of a
    Enter value of B
    click on the button get total
    also please print the value of the attribute type of the button GET TOTAL
    http://practice.syntaxtechs.net/basic-first-form-demo.php
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");

        WebElement textBox=driver.findElement(By.xpath("//input[@id='user-message']"));
        textBox.sendKeys("I like Selenium");

        WebElement showMessageButton=driver.findElement(By.xpath("//button[text()='Show Message']"));
        showMessageButton.click();

        WebElement valueA_Box=driver.findElement(By.xpath("//input[@id='sum1']"));
        valueA_Box.sendKeys("2");
        WebElement valueB_Box=driver.findElement(By.xpath("//input[@id='sum2']"));
        valueB_Box.sendKeys("2");

        WebElement totalButton=driver.findElement(By.xpath("//button[contains(text(),'Total')]"));
        totalButton.click();

        System.out.println(
                driver.findElement(By.xpath("//button[contains(text(),'Total')]"))
                        .getAttribute("type"));

        System.out.println(
                driver.findElement(By.xpath("//label[text()=' Total a + b = ']"))
                        .getText()+" "+driver.findElement(By.xpath("//span[@id='displayvalue']"))
                        .getText());

        Thread.sleep(2500);
        driver.quit();

    }
}
