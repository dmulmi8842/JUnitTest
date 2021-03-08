import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LamdaTest_JUnit {
    WebDriver driver;

    @Test
    public void Register_User()
    {
        System.setProperty("webdriver.chrome.driver", "C://Users//Diwash PC//Desktop//Selenium Learning//selenium jars and drivers//drivers//chromedriver.exe");
        driver= new ChromeDriver() ;
        driver.get("https://www.lambdatest.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Start Free Testing']")).click();
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("User20164005667891@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("TestUser123");
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9412262090");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//button[text()='Free Sign Up']")).click();
        String url= driver.getCurrentUrl();
        assertEquals("https://accounts.lambdatest.com/email/verify", url);
        System.out.println(url);
        driver.close();
    }

}