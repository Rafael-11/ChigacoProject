package TestNGReview_day10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://mail.google.com/");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("nadira@gmail.com");
        driver.findElement(By.id("identifierNext")).click();

        
    }
}
