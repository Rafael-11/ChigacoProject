package TestNGReview_day10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;

import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class Orange {
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
      driver  =new ChromeDriver();

    }
    @BeforeMethod
    public void testSetUp(){
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");


    }
//    @AfterMethod
//    public void testCleanUp(){
//      // driver.close();
//    }
//
//    @AfterClass
//    public void tearDown(){
//       // driver.quit();
//    }


    //===========================================================================//

    @Test
    public void orangeTitleVerificationTest(){
        assertEquals(driver.getTitle(),"OrangeHRM","Title Verification is Failed");

    }
    @Test
    public void orangeLoginVerification(){



     }
}
