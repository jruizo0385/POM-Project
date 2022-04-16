           package page;

           import org.openqa.selenium.WebDriver;
           import org.openqa.selenium.WebElement;
           import org.openqa.selenium.support.FindBy;
           import org.openqa.selenium.support.How;
           import org.testng.Assert;

            public class AddCustomerPage extends BasePage{
			WebDriver driver;

        	public AddCustomerPage(WebDriver driver) {
        	this.driver = driver;
        	}

        	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/div[1]/h5") WebElement ADD_CONTACT_HEADER_ELEMENT;
        	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]") WebElement FULL_NAME_ELEMENT;
        	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]") WebElement COMPANY_ELEMENT;
//        	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]") WebElement EMAIL_ELEMENT;
        	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]") WebElement EMAIL_ELEMENT;
        	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]") WebElement PHONE_ELEMENT;
        	@FindBy(how = How.XPATH, using = "//*[@id=\"address\"]") WebElement ADDRESS_ELEMENT;
        	@FindBy(how = How.XPATH, using = "//*[@id=\"city\"]") WebElement CITY_ELEMENT;
        	@FindBy(how = How.XPATH, using = "//*[@id=\"state\"]") WebElement STATE_ELEMENT;
        	@FindBy(how = How.XPATH, using = "//*[@id=\"zip\"]") WebElement SZIP_ELEMENT;
        	@FindBy(how = How.XPATH, using = "//*[@id=\"rform\"]/div[1]/div[1]/div[10]/div/span/span[1]/span/ul") WebElement TAG_ELEMENT;
          
        	public void verifyAddContactPage(){
        	waitForElement(driver, 5, ADD_CONTACT_HEADER_ELEMENT);
        	Assert.assertEquals(ADD_CONTACT_HEADER_ELEMENT.getText(), "Add Contact", "Wrong page!!!");
        	}
        	
        	
          //ADD_CONTACT_HEADER_ELEMENT.getText(), "Add Contact", "Wrong page!!!");
        	public void insertFullName(String fullName) {
        	String insertedName = fullName + generateRandom(999);
        	FULL_NAME_ELEMENT.sendKeys(insertedName);
        	}

        	public void selectCompanyDropdown(String company) {
        	selectFromDropdown(COMPANY_ELEMENT, company);
        	EMAIL_ELEMENT.sendKeys("");
        	}	
        	public void isertEmail(String Email) {
        	String insertedEmail = Email + generateRandom(999);
        	EMAIL_ELEMENT.sendKeys(insertedEmail);
        	}
			public void isertPhoneNumber(String phone) {	
			String insertedPhone = phone + generateRandom(999);
			PHONE_ELEMENT.sendKeys(insertedPhone);
			}
           public void insertAddress(String addres) {
           String insertedAddres = addres + generateRandom(999);	
           ADDRESS_ELEMENT.sendKeys(insertedAddres);
            }
           public void insertCity(String city) {
           String insertedCity = city + generateRandom(999);	
            CITY_ELEMENT.sendKeys(insertedCity); 
           }
           public void insertState(String state) {
           String insertedState = state + generateRandom(999);	
           STATE_ELEMENT.sendKeys(insertedState); 
            
            
       }
           public void insertZip(String zip) {
            String insertedZip = zip + generateRandom(999);	
            SZIP_ELEMENT.sendKeys(insertedZip); 
      
           
           }
           public void insertTag(String tag) {
           String insertedTag = tag + generateRandom(999);		
           TAG_ELEMENT.sendKeys(insertedTag); 
           }
           
            }    
