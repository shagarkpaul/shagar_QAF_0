package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Home_Page {
	
	
	WebDriver driver;
	
	public Amazon_Home_Page(WebDriver dr) {
		
		driver = dr;
		PageFactory.initElements(driver,this);
		
		}
	
	//WebElement searchitem = driver.findElement(By.id("twotabsearchtextbox"));
	//searchitem.sendKeys(name);
	
	@FindBy(id = "twotabsearchtextbox")
	WebElement searchitem;
	
	public void searching(String name) {
		searchitem.sendKeys(name);
	}
	
	//WebElement searchbutton = driver.findElement(By.id("nav-search-submit-button"));
	//searchbutton.submit();
	
	@FindBy(id = "nav-search-submit-button")
	WebElement searchbutton;
	
	public void click_button() {
		searchbutton.submit();
	}

}
