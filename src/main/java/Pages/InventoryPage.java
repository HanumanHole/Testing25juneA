package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;
import Utility.ReadData;
import Utility.UtilityMethod;

      public class InventoryPage extends TestBase {
    //Tc1- verify the visible of small logo 
	//Tc2- verify the visibility of big logo 
	//TC3- Add 6 product from cart
	//Tc4- Remove 2 product from cart 
	//TC5- verify the visibility of twitter logo (assignment)
	//Tc6- verify the visibility of fb logo 
	//TC7- verify the visibility of linkedin logo (assignment)
	
	//Object Repository
	@FindBy(xpath="//div[@class='peek']")private WebElement smallLogo;
	@FindBy(xpath="//img[@class='footer_robot']")private WebElement BigLogo;
	@FindBy(xpath="//select[@class='product_sort_container']")private WebElement sorterDropdown;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")private WebElement BackPackProduct ;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']")private WebElement BikeLightProduct;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")private WebElement tshirtBlackProduct;
    @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']")private WebElement jacketProduct;
    @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']")private WebElement tshirtProduct;
    @FindBy(xpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")private WebElement tshirtRedProduct;
    @FindBy(xpath="//span[@class='shopping_cart_badge']")private WebElement ProductCountBtn;
	
	
    //Constructor
    public InventoryPage()
    {
    	PageFactory.initElements(driver,this);
    }
    
    //methods
    public boolean verifySmallLogo()
    {
    	return smallLogo.isDisplayed();
    }
    public boolean verifyBigLogo()
    {
       return BigLogo.isDisplayed();

    }
    public String add6Product() throws Exception
    {
    	//Select s = new Select(sorterDropdown);
    	//s.selectByVisibleText("Price (low to high)");
    	Thread.sleep(2000);
    	UtilityMethod.selectClass(sorterDropdown, "Price (low to high)");
    	Thread.sleep(2000);
    	//s.selectByVisibleText(ReadData.readExcelFile(0, 0));
    	BackPackProduct.click();
    	BikeLightProduct.click();
    	tshirtBlackProduct.click();
    	jacketProduct.click();
    	tshirtProduct.click();
    	tshirtRedProduct.click();
    	 String count = ProductCountBtn.getText();
    	 return count;
    }
    public void remove2Product()
    {
    	
    }

	
	}
    
    
    
    
    
    
