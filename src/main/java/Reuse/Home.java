package Reuse;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

/**
 * Created by user on 17/07/2016.
 */
public class Home {
    public static WebDriver driver;
    String Baseurl="https://www.imaginecurve.com/";


    public void setup() {
        /*ProfilesIni firProfiles = new ProfilesIni();
        FirefoxProfile wbdrverprofile = firProfiles.getProfile("WebDiver_Profile");
        FirefoxDriver driver = new FirefoxDriver(wbdrverprofile);*/
        driver = new FirefoxDriver();
        driver.navigate().to(Baseurl);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();}


    public void Teardown() {
        driver.close();
    }
}
