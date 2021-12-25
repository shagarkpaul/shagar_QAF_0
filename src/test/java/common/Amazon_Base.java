package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Base {
	
	
	public WebDriver driver;
	
	public void launchbrowser() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	public void closebrowser() {
		
		driver.close();
	}
	
	public void  closeall() {
		
		driver.quit();
		
	}
	
	

}
