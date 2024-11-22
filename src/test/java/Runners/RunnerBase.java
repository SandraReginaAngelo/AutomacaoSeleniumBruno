package Runners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RunnerBase {
    static WebDriver driver;


    public static WebDriver getDriver() {

        if (driver == null){
            getDriverChrome();
        }
        return driver;
    }
    public static WebDriver getDriverChrome() {

        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        return driver;
    }
}