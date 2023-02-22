package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver=new ChromeDriver();

        String path="https://www.google.com/";
        driver.get(path);

        String URL= driver.getCurrentUrl();
        String title=driver.getTitle();

        if (URL.equalsIgnoreCase(path)){
            System.out.println("Match");
        }else{
            System.out.println("No match");
        }

        if (title.equalsIgnoreCase("Google")){
            System.out.println("Match");
        }else{
            System.out.println("No match");
        }
        driver.close();



    }
}