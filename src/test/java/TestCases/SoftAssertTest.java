package TestCases;

	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.TestBase;
	import Pages.InventoryPage;
	import Pages.LoginPage;
	import Utility.ReadData;
	 
	    public class SoftAssertTest extends TestBase {
	         LoginPage login;
	         InventoryPage invent;
	 
	        @BeforeMethod
	        public void setup() throws Exception
	        {
	        	initalization();
	        	login = new LoginPage();
	        	invent = new InventoryPage();
	        }
	        @Test
	        public void verifysmallLogoTest() throws Exception
	        {
	        	SoftAssert s = new SoftAssert();
	        	System.out.println("Execution Started");
	        	login.loginToApp11();
	        	boolean result = invent.verifySmallLogo();
	        	s.assertEquals(result, false);
	        	System.out.println("Execution ended");
	        	s.assertAll();
	        	
	        }
	        @Test(enabled=false)
	        public void verifyBigLogoTest() throws Exception
	        {
	        	login.loginToApp11();
	        	boolean result = invent.verifyBigLogo();
	        	
	        }
	        @Test(enabled=false)
	        public void add6ProductTest() throws Exception
	        {
	        	login.loginToApp11();
	        	String result = invent.add6Product();
	        	
	        
	        }
	        @AfterMethod
	        public void closeBrowser()
	        {
	        	driver.close();
	        }
		
	    }
	    
		


