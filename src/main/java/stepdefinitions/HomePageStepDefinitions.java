package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDefinitions {
	WebDriver driver;
	
	@Given("^User is already on the home page$")
	public void user_is_already_on_the_home_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://freecrm.co.in/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='https://ui.freecrm.com']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("prakharsinghwal96@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Prakhar@1234");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(2000);
	    
	}

	@When("^the title of the home page is HomePage$")
	public void the_title_of_the_home_page_is_HomePage()  {
	    // Write code here that turns the phrase above into concrete actions
		String title = driver.getTitle();
		Assert.assertEquals("Cogmento CRM", title);
	    
	}

	@Then("^user clicks on contacts$")
	public void user_clicks_on_contacts() throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//div[@id='main-nav']//span[text()='Contacts']")).click();
		Thread.sleep(1000);
	    
	}

	@Then("^user click on new Contacts$")
	public void user_click_on_new_Contacts() throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[@href='/contacts/new']//button[@class='ui linkedin button']")).click();
		Thread.sleep(2000);
	   
	}

	@Then("^finish the browser$")
	public void finish_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		driver.quit();
	    
	}



}
