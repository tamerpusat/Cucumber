package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;

public class DriverFactory {
    static WebDriver driver;
    static Properties properties;

    public static WebDriver initialize_Driver(String browser){

        properties = ConfigReader.getProperties();

        if (browser.equals("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

    }

}
