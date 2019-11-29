package seleniumtest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyTitleTestusingClass {
ChromeDriver driver;	
 @BeforeClass 
   public void launch() {
	         System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.get("https://www.edureka.co/");
			driver.manage().window().maximize();
  }
  @Test
  public void VerifyTitle() {
	
	String x = driver.getTitle();
	System.out.println("Title is "+ x);
    Assert.assertEquals(x, "Instructor-Led Online Training with 24X7 Lifetime Support | Edureka");
  }
  @Test
  public void Verifyurl() {
		
		String x = driver.getCurrentUrl();
		System.out.println("URL is "+ x);
	    Assert.assertEquals(x, "https://www.edureka.co/");
	  }
  
  @AfterClass()  
  public void close() {
	         driver.close();
  }
    
 }

