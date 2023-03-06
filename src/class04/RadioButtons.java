package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

        //1. locate the element in the DOM
        //2. write the appropriate locator to select it
        //3. use driver.findElement to find that in your code
        //4. click on it

        WebElement maleButton= driver.findElement(By.cssSelector("input[value='Male']"));
        //maleButton.click();

        //isEnabled -- to check radio button CAN be selected
        //isDisplayed -- check if webElement is displayed on the page
        //isSelected -- check if the radio button IS selected

        boolean isMaleBtnEnabled=maleButton.isEnabled();
        System.out.println("the radio button male is enabled: "+isMaleBtnEnabled);

        boolean isMaleBtnDisplayed=maleButton.isDisplayed();
        System.out.println("the radio button male is displayed: "+isMaleBtnDisplayed);

        boolean isMaleBtnSelected=maleButton.isSelected();
        System.out.println("The radio button male is selected: "+isMaleBtnSelected);

        if (!isMaleBtnSelected){
            maleButton.click();
        }
        isMaleBtnSelected=maleButton.isSelected();
        System.out.println("The radio button male is selected: "+isMaleBtnSelected);

    }
}
