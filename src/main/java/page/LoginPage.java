    package page;

    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.support.FindBy;
    import org.openqa.selenium.support.How;

    public class LoginPage {
	WebDriver driver;
		
	public LoginPage(WebDriver driver) {
	this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]") WebElement USERNAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]") WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button") WebElement SIGNIN_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]n") WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]") WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"address\"]") WebElement ADDRESS_ELEMENT;
	
	
	
	public void insertUserName(String userName) {
	USERNAME_ELEMENT.sendKeys(userName);
	}
	
	public void insertPassword(String password) {
	PASSWORD_ELEMENT.sendKeys(password);
	}
	
	public void clickSininButton() {
	SIGNIN_BUTTON_ELEMENT.click();
	}
	
	public void loginIn(String userName, String password) {
	USERNAME_ELEMENT.sendKeys(userName);
	PASSWORD_ELEMENT.sendKeys(password);
	SIGNIN_BUTTON_ELEMENT.click();
	}
   public void insertEmail(String email) {
	   
   }
   public void insertPhone(String Phone) {
	
}
    }
    