
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import Reuse.Home;
import org.testng.Assert;


public class PhoneNumber {

    private final WebDriver driver;
    @FindBy(xpath = ".//*[@id='wrapper']/div[2]/div[1]/div[2]/div/div[1]/a/img[1]")
    WebElement curve;
    @FindBy(xpath = ".//*[@id='menu-item-240']/a/span")
    WebElement joinnow;
    @FindBy(id="field_38kar")
    WebElement Mobiletextfield;
    @FindBy(xpath = ".//*[@id='post-192']/div/div[2]/div/div/h2")
    WebElement iphone;
    public PhoneNumber(WebDriver driver){
        this.driver= driver;
        AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver,100);
        PageFactory.initElements(factory, this);
    }
    public void validatecurve(){
     Assert.assertTrue(curve.getText().toLowerCase().contains("curve"));}
    public void clickjoinnow(){
        joinnow.click();
    }
    public void entermobileno(String no){
        Mobiletextfield.sendKeys(no);

    }
    public void validateiphone(){
        Assert.assertTrue(iphone.getText().toLowerCase().contains("iphone"));
    }


}
