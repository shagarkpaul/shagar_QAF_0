package steps;



import common.Amazon_Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Amazon_Home_Page;

public class Product_Search extends Amazon_Base{
	
	
	@Given("i am on amazon home page")
	public void i_am_on_amazon_home_page() {
	   
		launchbrowser();
	}
	

	@When("i enter the the product {string}")
	public void i_enter_the_the_product(String name) {
		
		//WebElement searchitem = driver.findElement(By.id("twotabsearchtextbox"));
		//searchitem.sendKeys(name);
		
		Amazon_Home_Page ap = new Amazon_Home_Page(driver);
		ap.searching(name);
	    
		
	}

	@When("i click on the search button")
	public void i_click_on_the_search_button() {
		
		//WebElement searchbutton = driver.findElement(By.id("nav-search-submit-button"));
		//searchbutton.submit();
		
		//driver.navigate().back();
		Amazon_Home_Page ap = new Amazon_Home_Page(driver);
		ap.click_button();
	    
		
	}
	
	

	@Then("i see the relevent search result")
	public void i_see_the_relevent_search_result() {
		
		System.out.println("==============================================================================================================");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		System.out.println("===============================================================================================================");
	    
		closebrowser() ;
		
	}

}
