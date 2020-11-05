package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class NewContactPageStepDefinition {
	WebDriver driver;
	@Given("^user is already on freecrmhome page$")
	public void user_is_already_on_freecrmhome_page() throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://freecrm.co.in/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(2000);
	  
	}

	@When("^title of the page is FreeCrm$")
	public void title_of_the_page_is_FreeCrm() {
	    // Write code here that turns the phrase above into concrete actions
		String title = driver.getTitle();
		Assert.assertEquals("Free CRM #1 cloud software for any business large or small", title);
	   
	}
	@Then("^user clicks on login buttonn on freecrmpage$")
	public void user_clicks_on_login_button_on_freecrmpage()
	{
		driver.findElement(By.xpath("//a[@href='https://ui.freecrm.com']")).click();
	}
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username,String password) throws InterruptedException
	{
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(3000);
	}
	

	@Then("^user is on homepage$")
	public void user_is_on_homepage() throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		String title = driver.getTitle();
		Assert.assertEquals("Cogmento CRM",title);
		Thread.sleep(3000);
	    
	}

	@Then("^user clicks on contacts tab$")
	public void user_clicks_on_contacts_tab() throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//div[@id='main-nav']//span[text()='Contacts']")).click();
		Thread.sleep(3000);
	    
	}

	@Then("^user clicks on new button$")
	public void user_clicks_on_new_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[@href='/contacts/new']//button[@class='ui linkedin button']")).click();
		Thread.sleep(2000);
		
	    
	}

	@Then("^user is on NewContactPage$")
	public void user_is_on_NewContactPage()  {
	    // Write code here that turns the phrase above into concrete actions
	   String title = driver.getTitle();
	   Assert.assertEquals("Cogmento CRM", title);
	}
	@Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_enters_firstname_lastname_company_emailaddress_category_status_channel(String Firstname,String Lastname,String Comapny,String EmailAddress,String category,String Status,String SocialChannel)
	
	{
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(Firstname);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(Lastname);
		driver.findElement(By.xpath("//div[@name='company']//input")).sendKeys(Comapny);
		driver.findElement(By.xpath("//input[@name='value' and @placeholder ='Email address']")).sendKeys(EmailAddress);
		driver.findElement(By.xpath("//div[@name='category']//i")).click();
		driver.findElement(By.xpath("//div[@class='visible menu transition']//span[text()='Lead']")).click();
		driver.findElement(By.xpath("//div[@name='status']//i")).click();
		driver.findElement(By.xpath("//div[@class='visible menu transition']//span[text()='New']")).click();
		driver.findElement(By.xpath("//div[@name='channel_type']//i")).click();
		driver.findElement(By.xpath("//div[@class='visible menu transition']//span[text()='Twitter']")).click();
	}

	@Then("^user clicks on save button$")
	public void user_clicks_on_save_button() throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
	  driver.findElement(By.xpath("//div[@class='item']//button[@class='ui linkedin button']")).click();
	  Thread.sleep(2000);
	}
	@Then("^end the browser$")
	public void end_the_browser()
	{
		driver.quit();
	}

}
