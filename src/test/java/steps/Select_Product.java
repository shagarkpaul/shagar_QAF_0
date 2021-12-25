package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.Amazon_Base;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Amazon_Home_Page;

public class Select_Product extends Amazon_Base{
	
	
	
	
	@When("i click on the product that i want to select")
	public void i_click_on_the_product_that_i_want_to_select() {
		
		launchbrowser();
		Amazon_Home_Page ap = new Amazon_Home_Page(driver);
		ap.searching("iphone 13");
		
		ap.click_button();
	    
		WebElement selectitem = driver.findElement(By.partialLinkText("Apple iphone 13"));
		selectitem.click();
	}

	@Then("i see the product is selected")
	public void i_see_the_product_is_selected() {
		
       System.out.println("==============================================================================================================");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		System.out.println("===============================================================================================================");
	    
		closebrowser() ;
	    
		
	}


}
