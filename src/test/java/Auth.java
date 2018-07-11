import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Auth {

	WebDriver driver;
	@FindBy(id="mailbox:login")
	WebElement userName;
	
	@FindBy(id="mailbox:password")
	WebElement password;
	
	@FindBy(id="mailbox:submit")
	WebElement login;
	
	public Auth(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void setUserName(String strUserName){
		userName.sendKeys(strUserName);		
	}
	
	public void setPassword(String strPassword){
	password.sendKeys(strPassword);
	}
	
	public void clickLogin(){
			login.click();
	}

	public void Author(String strUserName,String strPasword){
		Assert.assertEquals(driver.getTitle(),"Mail.Ru: почта, поиск в интернете, новости, игры");
		this.setUserName(strUserName);
		this.setPassword(strPasword);
		this.clickLogin();

	}
}
