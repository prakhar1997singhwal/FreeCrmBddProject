/*
 * package stepdefinitions;
 * 
 * import java.util.concurrent.TimeUnit;
 * 
 * import org.junit.Assert; import org.openqa.selenium.By; import
 * org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * import cucumber.api.java.en.Given; import cucumber.api.java.en.Then; import
 * cucumber.api.java.en.When;
 * 
 * public class LoginPageStepDefinitions { WebDriver driver;
 * 
 * @Given("^User is already on the login page$") public void
 * user_is_already_on_the_login_page() {
 * System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe"); driver
 * = new ChromeDriver(); driver.manage().window().maximize();
 * driver.manage().deleteAllCookies(); driver.get("https://freecrm.co.in/");
 * driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
 * driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
 * driver.findElement(By.xpath("//a[@href='https://ui.freecrm.com']")).click();
 * }
 * 
 * @When("^title of the login page is LoginPage$") public void
 * title_of_the_login_page_is_LoginPage() { String title = driver.getTitle();
 * Assert.assertEquals("Cogmento CRM", title); }
 * 
 * @Then("^user enters \"(.*)\" and \"(.*)\"$") public void
 * user_enters_username_and_password(String username,String password) {
 * driver.findElement(By.name("email")).sendKeys(username);
 * driver.findElement(By.name("password")).sendKeys(password); }
 * 
 * @Then("^user clicks on the login button$") public void
 * user_clicks_on_login_button() {
 * driver.findElement(By.xpath("//div[text()='Login']")).click(); }
 * 
 * @Then("^end the browser$") public void end_the_browser() { driver.quit(); }
 * 
 * 
 * }
 */