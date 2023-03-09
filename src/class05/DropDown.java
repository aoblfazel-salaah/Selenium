package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
//        Locate the dropdown menu
        WebElement dropDown=driver.findElement(
                By.xpath("//select[@id='select-demo']"));

//        use select class because this drop down has a select tag
        Select select=new Select(dropDown);

//        using select class we have different methods to select the desired options
        //by index
        select.selectByIndex(1);
        Thread.sleep(1000);

        //by value
        select.selectByValue("Tuesday");
        Thread.sleep(1000);

        //by visible Text
        select.selectByVisibleText("Friday");
        Thread.sleep(1000);

    }
}
