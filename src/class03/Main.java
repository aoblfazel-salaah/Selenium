package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    //xpath could be used 4 type
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/" +
                "Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");

        WebElement username=driver.findElement(By.xpath("//input[contains(@name,'username')]"));
        username.sendKeys("Tester");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test");

        //clear the username text box using method clear()

        username.clear();

        //print the Username text beside the username input field
        WebElement usernameText=driver.findElement(By.xpath("//label[text()='Username:']"));
        System.out.println(usernameText.getText());

        //also password text
        WebElement passwordText=driver.findElement(By.xpath("//label[text()='Password:']"));
        String passText=passwordText.getText();
        System.out.println(passText);

//        in case we do not find any unique thing to address - we use indexes
//        "//tagName[@attribute='attribute value'][index]" - not 0 based index , two means second

//        absolute xpath is following the html hierarchy to the target
//        /html/head/title
//        /html/body/form/div

    }
}
