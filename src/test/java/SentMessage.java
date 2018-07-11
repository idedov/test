import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SentMessage {

    WebDriver driver;
    @FindBy(xpath="//textarea[@data-original-name='To']")
    WebElement who;

    @FindBy(xpath="//input[@class='b-input']")
    WebElement theme;

    @FindBy(xpath="//body[@id='tinymce']")
    WebElement text;

    @FindBy(xpath="//div[@id='b-toolbar__left']//span[@class='b-toolbar__btn__text b-toolbar__btn__text_pad']")
    WebElement write;

    @FindBy(xpath="//div[@class='b-toolbar__item b-toolbar__item_ b-toolbar__item_false']//span[@class='b-toolbar__btn__text']")
    WebElement sent;


    public SentMessage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickWrite(String Who,String Theme, String Text) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='b-toolbar__left']//span[@class='b-toolbar__btn__text b-toolbar__btn__text_pad']")).click();
        who.sendKeys(Who);
        theme.sendKeys(Theme);
        driver.switchTo().frame(0);
        System.out.println(driver.getTitle());
        text.sendKeys(Text);
        driver.switchTo().defaultContent();
        sent.click();

    }
}
