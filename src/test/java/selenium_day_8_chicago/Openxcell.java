package selenium_day_8_chicago;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/*
  Tast: 1.go to https://www.openxcell.com
        2.locate 'case studies' link
        3.print out class attribute
         Expected:  mega-menu-link
 */
public class Openxcell {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //1.go to https://www.openxcell.com
        driver.get("https://www.openxcell.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        // 2.locate 'case studies' link
        WebElement cs =driver.findElement(By.linkText("Case Studi"));

        System.out.println(cs.getAttribute("class"));
        //get the link attribute
        System.out.println(cs.getAttribute("href"));
        //3.print out class attribute
        System.out.println(cs.getText());

       List<WebElement> links= driver.findElements(By.xpath("//body//a[@id='whatever']"));//findElemenet(s) does not throw
        //No such elements exception.


        System.out.println(links.size());
//      List<WebElement> div=driver.findElements(By.xpath("//body//div"));
//        System.out.println("Total is: "+div.size());

        for (WebElement link:links) {

            System.out.println(link.getText());

        }



    }
}
