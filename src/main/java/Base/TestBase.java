package Base;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Utility.ReadData;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
    public static WebDriver driver;
	 public void initalization() throws Exception
	 {
		 String browser = ReadData.readPropertyFile("browser");
		 if(browser.equals("chrome"))
		 {
		 WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
	 }
		/* else if(browser.equals("edge"))
		 {
			 
		 WebDriverManager.edgedriver().setup();
         driver = new EdgeDriver();
	 }*/
         driver.manage().window().maximize();
         driver.manage().deleteAllCookies();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         //driver.get("https://www.saucedemo.com/");
         driver.get(ReadData.readPropertyFile("Url"));
     
	}

}
  //parameterazation
  //creadential:-property File
   //Testdata :- excel File










