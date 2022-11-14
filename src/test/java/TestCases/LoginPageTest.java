package TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Utility.CaptureScreenshot;
import Utility.ReadData;

public class LoginPageTest extends TestBase {
   LoginPage login;
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();
		 login = new LoginPage();
		
	}
	@Test(enabled=true)
	public void VerifyLoginLogo()
	{
		boolean result = login.verifyLoginLogo();
		Assert.assertEquals(result,false);
		System.out.println("verifyLoginLogoTest");
	}
	@Test(enabled=true,/*dependsOnMethod="verifyTitleTest"*/priority=2)
	public void verifyBotlogoTest()
	{
		boolean result = login.verifyBotLogo();
		Assert.assertEquals(result,true);
		System.out.println("verifyBotLogoTest");
	}
	@Test(enabled=true,priority=4)
	public void loginToApp11Test() throws Exception
	{
		
		
		String label = login.loginToApp11();
		Assert.assertEquals(label,"PRODUCTS");
		//Assert.assertEquals(label,ReadData.readExcelFile(1, 0));
		System.out.println("loginToApp11Test");
		
	}
	@Test(enabled=true,priority=5)
	public void loginToApp2Test() throws Exception
	{
		
		Assert.assertEquals(login.loginToApp2(),ReadData.readExcelFile(1, 1));
		System.out.println("loginToApp2Test");
	}
	@Test(enabled=true,priority=0)
	public void verifyTitleTest() throws Exception
	{
		
		String title = login.verifyTitle();
		Assert.assertEquals(title,"Swag Labs");
		Assert.assertEquals(title,ReadData.readExcelFile(1,2));
		System.out.println("verifyTitleTest");
	}
		
	@Test(enabled=true,priority=1)
	public void verifyUrlTest() throws Exception
	{
		
		String url = login.verifyUrl();
		
	//	Assert.assertEquals(url,ReadData.readExcelFile(1,3));
		System.out.println("verifyUrlTest");
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

