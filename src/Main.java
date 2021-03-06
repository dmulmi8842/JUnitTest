import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;

public class Main {
    @Test
    public static void main(String[] args) {
        WebDriver obj;
        //System.out.println("hello world");
        System.setProperty("webdriver.chrome.driver","C://Users//Diwash PC//Desktop//Selenium Learning//selenium jars and drivers//drivers//chromedriver.exe");
        obj = new ChromeDriver();
        obj.get("https://www.google.com");
        String currentTitle = obj.getTitle();
        System.out.println("Google title is >>" + currentTitle);
        obj.close();
    }
}
