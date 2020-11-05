package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

public class FreeCrmHomePageStepDefinitions {
	WebDriver driver;
	
	@Given("^User is already on FreeCrmHome page$")
	public void user_already_on_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://freecrm.co.in/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	@When("^title of FreeCrmpage is Free CRM$")
	public void title_of_Free_Crm_Home_page()
	{
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Free CRM #1 cloud software for any business large or small", title);
	}
	@Then("^user clicks on login button$")
	public void user_click_on_login_button()
	{
		driver.findElement(By.xpath("//a[@href='https://ui.freecrm.com']")).click();
	}
    @Then("^user is on login page$")
    public void user_is_on_login_page()
    {
    	String title = driver.getTitle();
    	System.out.println("home page title ="+title);
    	Assert.assertEquals("Cogmento CRM", title);
    }
    @Then("^close the browser$")
    public void close_the_browser()
    {
    	driver.quit();
    }
}
