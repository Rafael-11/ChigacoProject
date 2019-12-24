package selenium_day_8_chicago;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TheEnternetLogInFactionTest {
    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //open the browser
        driver.get("https://the-internet.herokuapp.com/login");
        driver.manage().window().maximize();
       negativeLogin(driver,"Tester","XXXXD" );
        negativeLogin(driver,"","XXXXD" );
        negativeLogin(driver,"Tester","" );
        negativeLogin(driver,"","" );
        //locate the 'usernaame' elements
//        WebElement username = driver.findElement(By.id("username"));
//         //enter the username text
//          username.sendKeys("myname");
//        WebElement passWord=driver.findElement(By.id("password"));
//        passWord.sendKeys("passwor");
//        //click the Login button
//        WebElement loginBtn=driver.findElement(By.xpath("//button[@type='submit']"));//you can also use className
//        loginBtn.click();
//        //verify the login title
//        String loginTitle=driver.getTitle();
//
//        if (loginTitle.equals("The Internet")){
//            System.out.println("Login title verification PASSED");
//        }
//        else {
//            System.out.println("Login title verification FAILED");
//        }
      //verify the new URL verification
//      String newURL=driver.getCurrentUrl();
//        if(newURL.equals("https://the-internet.herokuapp.com/login")){
//            System.out.println("New title verification PASSED");
//        }
//        else{
//            System.out.println("New title verification FAILED");

        }

  //}

    public static  void negativeLogin(WebDriver driver,String usernameValue,String passwordValue){
        WebElement username = driver.findElement(By.id("username"));
        WebElement passWord=driver.findElement(By.id("password"));
        WebElement loginBtn=driver.findElement(By.xpath("//button[@type='submit']"));

        username.sendKeys(usernameValue);
        passWord.sendKeys(passwordValue);
        loginBtn.click();
        WebElement erorMsg=driver.findElement(By.id("flash"));

        if(erorMsg.equals(" Your username is invalid!")){
            System.out.println("Error title verification PASSED");
        }
        else{
            System.out.println("New title verification FAILED");
        }
    }
}
