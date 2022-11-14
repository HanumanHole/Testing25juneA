package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventoryPage;
import Pages.LoginPage;
import Utility.ReadData;
 
    public class InventoryPageTest extends TestBase {
         LoginPage login;
         InventoryPage invent;
 
        @BeforeMethod
        public void setup() throws Exception
        {
        	initalization();
        	login = new LoginPage();
        	invent = new InventoryPage();
        }
        @Test(enabled=true,timeOut=2000)
        public void verifysmallLogoTest() throws Exception
        {
        	login.loginToApp11();
        	boolean result = invent.verifySmallLogo();
        	Assert.assertEquals(result, true,"test case Failed zali ka????????");
        	Assert.assertTrue(true);
        	Assert.assertFalse(false);
        	System.out.println("this is verifysmallLogoTest");
        }
        @Test(enabled=false, invocationCount = 5)
        public void verifyBigLogoTest() throws Exception
        {
        	login.loginToApp11();
        	boolean result = invent.verifyBigLogo();
        	Assert.assertEquals(result,true);
        }
        @Test(enabled=false)
        public void add6ProductTest() throws Exception
        {
        	login.loginToApp11();
        	String result = invent.add6Product();
        	Assert.assertEquals(result,ReadData.readExcelFile(1,4));
        
        }
        @AfterMethod
        public void closeBrowser()
        {
        	driver.close();
        }
	
    }
    
	
