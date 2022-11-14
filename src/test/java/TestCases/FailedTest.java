package TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Utility.CaptureScreenshot;

public class FailedTest extends TestBase {
   private static final FailedTest Login = null;
LoginPage login;
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();
		 login = new LoginPage();
		
	}
	@Test
	public boolean VerifyLoginLogo()
	{
            boolean result = Login.VerifyLoginLogo();
		Assert.assertEquals(result,true);
		System.out.println("verifyLoginLogo");
		return result;
	}
	@Test
	public void verifyBotlogoTest()
	{
		boolean result = login.verifyBotLogo();
		Assert.assertEquals(result,true);
		System.out.println("verifyBotLogoTest");
	}
	@Test
	public void loginToApp11Test() throws Exception
	{
		
		
		String label = login.loginToApp11();
		Assert.assertEquals(label,"PRODUCTS");
		//Assert.assertEquals(label,ReadData.readExcelFile(1, 0));
		System.out.println("loginToApp11Test");
		
	}
	@Test
	public void loginToApp2Test() throws Exception
	{
		Assert.assertEquals(login.loginToApp2(),"https://www.saucedemo.com/inventory.html");
	//	Assert.assertEquals(login.loginToApp2(),ReadData.readExcelFile(1, 1));
		System.out.println("loginToApp2Test");
	}	
	@Test
	public void verifyUrlTest() throws Exception
	{
		
		String url = login.verifyUrl();
		Assert.assertEquals(url, "https://www.saucedemo.com/");
	//	Assert.assertEquals(url,ReadData.readExcelFile(1,3));
		System.out.println("verifyUrlTest");
	}
	@Test
	public void verifyTitleTest() throws Exception
	{
		
		String title = login.verifyTitle();
		Assert.assertEquals(title, "Swag Labs");
	//	Assert.assertEquals(title,ReadData.readExcelFile(1,2));
		System.out.println("verifyTitleTest");
	}
	

	@AfterMethod
	public void closeBrowser(ITestResult it) throws Exception
	{
     if(ITestResult.FAILURE == it.getStatus())
   {
	CaptureScreenshot.screenshot(it.getName());
   }
     driver.close();
	}
}

