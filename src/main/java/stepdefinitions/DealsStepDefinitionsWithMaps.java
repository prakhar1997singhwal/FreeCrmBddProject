package stepdefinitions;


import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//data Table: for the parameterization of test cases with column name

public class DealsStepDefinitionsWithMaps {
	WebDriver driver;
	@Given("^user is already on freecrmhome page for the third time$")
	public void user_is_already_on_freecrmhome_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://freecrm.co.in/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	@When("^title of the page is FreeCrmHomePageDemo for the third time$")
	public void title_of_the_page_is_FreeCrm()
	{
		String title = driver.getTitle();
		Assert.assertEquals("Free CRM #1 cloud software for any business large or small", title);
	}
	@Then("^user clicks on login buttonnnn on freecrmpage for third time$")
	public void user_clicks_on_login_buttonn_on_freecrmpage()
	{
		driver.findElement(By.xpath("//a[@href='https://ui.freecrm.com']")).click();
	}
	@Then("^user enters emailId and password for the third Time$")
	public void user_enters_emailId_and_password(DataTable credentials)  {
		for(Map<String,String> data : credentials.asMaps(String.class,String.class))
		{
		driver.findElement(By.name("email")).sendKeys(data.get("email-Address"));
		driver.findElement(By.name("password")).sendKeys(data.get("password"));
		driver.findElement(By.xpath("//div[text()='Login']")).click();}
	}
	@Then("^user is on homePage for third time$")
	public void user_is_on_homePage()
	{
		String title = driver.getTitle();
		Assert.assertEquals("Cogmento CRM",title);
	}

	@Then("^user clicks on deals tab for third time$")
	public void user_clicks_on_deals_tab() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//div[@class='ui fluid container']//span[text()='Deals']")).click();
	    Thread.sleep(2000);
	}
	@Then("^user clicks on new button on Home Page for third time$")
	public void user_clicks_on_new_button_on_Home_Page()
	{
		driver.findElement(By.xpath("//a[@href='/deals/new']//button")).click();
	}

	@Then("^user is on DealsPage for third time$")
	public void user_is_on_DealsPage()  {
	    // Write code here that turns the phrase above into concrete actions
	   String title = driver.getTitle();
	   Assert.assertEquals("Cogmento CRM",title);
	}

	@Then("^user enters contact details Title and Assigned To and Company and Products and Contacts for third time$")
	public void user_enters_contact_details_Title_and_Assigned_To_and_Company_and_Products_and_Contacts_for_third_time(DataTable dealdata) throws InterruptedException {
		for(Map<String,String> data:dealdata.asMaps(String.class, String.class))
		{
	    driver.findElement(By.xpath("//input[@name='title']")).sendKeys(data.get("Title"));
	    driver.findElement(By.xpath("//div[@class='ui field']//div[@role='listbox' and @aria-disabled='false']//i")).click();
	    driver.findElement(By.xpath("//div[@class='visible menu transition']//div[@role='option']")).click();
	    driver.findElement(By.xpath("//div[@name='company']//i")).click();
	    driver.findElement(By.xpath("//div[@name='company']//input[@aria-autocomplete='list']")).sendKeys(data.get("Company"));
	    driver.findElement(By.xpath("//div[@name='products']//i")).click();
	  	driver.findElement(By.xpath("//div[@name='products']//input")).sendKeys(data.get("Products"));
	    driver.findElement(By.xpath("//div[@name='contacts']//i")).click();
		driver.findElement(By.xpath("//div[@name='contacts']//input")).sendKeys(data.get("Contacts"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='item']//button[@class='ui linkedin button']")).click();
		Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[@class='ui fluid container']//span[text()='Deals']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[@href='/deals/new']//button")).click();
		  Thread.sleep(2000);
		}
	    
	}

	@Then("^terminate the browser for third time$")
	public void terminate_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		driver.quit();
	    	}


}
