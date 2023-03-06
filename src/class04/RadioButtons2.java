package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        //go to age group -- list of all values through a common attribute
        //loop through it and .click on the one you want

        List<WebElement> ageGroups=driver.findElements(By.xpath("//input[@name='ageGroup']"));
        for (WebElement ageGroup:ageGroups){
            String value=ageGroup.getAttribute("value");
            if (value.equals("15 - 50")){
                ageGroup.click();
            }
        }
    }
}
