package class04.Homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        WebElement singleCheckboxBtn=driver.findElement
                (By.cssSelector("input[type='checkbox']"));

        boolean sCBBselected=singleCheckboxBtn.isSelected();
        System.out.println(sCBBselected);
        if (!sCBBselected) {
            singleCheckboxBtn.click();
        }
        System.out.println(singleCheckboxBtn.isSelected());

    }
}
