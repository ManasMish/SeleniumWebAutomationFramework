package comtta.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class driverManager {
    public static WebDriver driver;
    public static WebDriver getDriver() {
        return driver;
    }
    public static void init(){
        if(driver==null){
            EdgeOptions edgeOptions = new EdgeOptions();
            edgeOptions.addArguments("--start-maximized");
            edgeOptions.addArguments("--guest");
            driver = new EdgeDriver(edgeOptions);
        }
    }
    public static void down(){
        if(driver != null){
            driver.quit();
            driver= null;
        }
    }
}