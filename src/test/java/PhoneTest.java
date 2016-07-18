
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import static Reuse.Home.driver;


public class PhoneTest {
           PhoneNumber obj;
    @Test
    public void validatenofield(){
        PhoneNumber obj=new PhoneNumber(driver);
        obj.validatecurve();
        obj.clickjoinnow();
        obj.validateiphone();
        obj.entermobileno("07785447828");

    }
    }
