package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;

public class LoginPage extends TestBase {
	//object repositry
	@FindBy(xpath="//div[@class='login_logo']")private WebElement swagLabLogo;
	@FindBy(xpath="//div[@class='bot_column']")private WebElement botLogo;
	@FindBy(xpath="//input[@id='user-name']")private WebElement usernameTextbox1;
	@FindBy(xpath="//input[@id='password']")private WebElement passwordTextbox;
	@FindBy(xpath="//input[@id='login-button']")private WebElement loginbtn;
	@FindBy(xpath="//span[@class='title']")private WebElement productlabel;
	private WebElement loginLogo;
	
	//method to verify on swagLab logo availablity
	//constructor
	public  LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	//method1
	public String  loginToApp2() throws Exception
	{
		 loginToApp11();
		return driver.getCurrentUrl();
	}
	//method2

	public boolean verifySwagLogo()
	{
		 return swagLabLogo.isDisplayed();
	}
	
	//method to the verify title 
	
    public  String verifyTitle()
    
    {
    	return driver.getTitle();
    	
    }
    //method to verify visibility of log in logo
    public boolean verifyLoginLogo()
    {
    return	loginLogo.isDisplayed();
    }
    //method to verify visibility of bot logo
    public boolean verifyBotLogo()
    {
    return	botLogo.isDisplayed();
    }
    //method to verify log in application and verify the label
    public String loginToApp11() throws Exception
    {
    	usernameTextbox1.sendKeys(ReadData.readPropertyFile("Username"));
    	passwordTextbox.sendKeys(ReadData.readPropertyFile("password"));
    	loginbtn.click();
		return productlabel.getText();
    	
    }
	
	// method to the verify Url
    public String verifyUrl()
    {
    	return driver.getCurrentUrl();
    	
    }
}



