import Reuse.Home;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Baseclass {
    @BeforeTest
    public void start(){
        new Home().setup();
    }
    @AfterTest
    public void stop(){
        new Home().Teardown();
    }
}

