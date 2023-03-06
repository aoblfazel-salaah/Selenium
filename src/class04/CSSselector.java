package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

//            you have shortcut for a few attributes in CSS Selector
//            classname ---> tagname[classname='vlaue']  == "tagname.value"
//            ID ---> tagname[id='vlaue']  == "tagname#value"
//
            //contains method:
//            tagname[attribute *= 'partial attribute vlaue']

            //startsWith method:
//            tagname[attribute ^='starting attribute value']
//            input[id^='abra']

            //endssWith method:
//            tagname[attribute $='ending attribute value']
//            input[id$='cadadabra']

            driver.get("https://www.facebook.com/");

            WebElement createNewAccountButton= driver.findElement(By.cssSelector
                    ("a[data-testid='open-registration-form-button']"));
            createNewAccountButton.click();

            Thread.sleep(1000);
            WebElement firstNameBox=driver.findElement(By.cssSelector("input[name='firstname']"));
            firstNameBox.sendKeys("Ghulam");

            WebElement lastNameBox=driver.findElement(By.cssSelector("input[name*='last']"));
            lastNameBox.sendKeys("Ali");



        }
}
