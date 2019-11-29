package seleniumtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String x = driver.getTitle();
		System.out.println("Title is "+ x);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(4000);
		//driver.findElement(By.xpath(xpathExpression))
		driver.findElement(By.id("u_0_m")).sendKeys("neeraj");
		driver.findElement(By.name("lastname")).sendKeys("kulkarni");
		driver.findElement(By.id("u_0_13")).click();
		driver.navigate().back();
		driver.navigate().forward();
	
		
		
	}

}
