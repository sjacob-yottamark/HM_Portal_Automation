package HM_Portal_Automation.Steps;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class HMPortalSteps {
	
	WebDriver driver;
	
	@Before()
	public void setup() throws Exception {
		//System.setProperty("webdriver.chrome.driver", "//Users//sjacob//Development//2020//iFoods_Automation//HM_Portal_Automation//src//test//java//HM_Portal_Automation//resources//chromedriver 4");
		System.setProperty("webdriver.chrome.driver", "//Users//sjacob//drivers//chromedriver");
		this.driver = new ChromeDriver();
		//this.driver = new FirefoxDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);	
	}
	
	@After() 
	public void teardown() {
		driver.manage().deleteAllCookies();
		driver.close();
		driver.quit();
	}
	
	// Login Screen
	
	@Given("User navigates to harvestmark portal")
	public void user_navigates_to_harvestmark_portal() throws Throwable {
	    driver.get("https://qa.harvestmark.com/users/sign_in");
	    //driver.get("https://portal.harvestmark.com/users/sign_in"); 
	}

	@Then("^User enters the username as \"([^\"]*)\"")
	public void user_enters_the_admin_username(String username) throws Throwable {
		//driver.findElement(By.xpath(".//*[@id='user_email']")).sendKeys("dev@yottamark.com");
		driver.findElement(By.id("user_email")).sendKeys(username);
	    
	}

	@Then("^User enters the passord as \"([^\"]*)\"")
	public void user_enters_the_admin_password(String password ) throws Throwable{
		//driver.findElement(By.xpath(".//*[@id='user_password']")).sendKeys("bbb123");
		driver.findElement(By.id("user_password")).sendKeys(password);
	    
	}

	@Then("User clicks on the sign in button")
	public void user_clicks_on_the_sign_in_button() {
		//driver.findElement(By.xpath("//a[contains(text(), 'Sign in')]")).click(); - 
		//driver.findElement(By.xpath(".//*[@id='sign_in']")).click();
		driver.findElement(By.id("sign_in")).click();
	    
	}

	@Then("User should be taken to the successful login page")
	public void user_should_be_taken_to_the_successful_login_page() throws Throwable {
		Thread.sleep(2000);
		//WebElement Welcometext = driver.findElement(By.xpath("//a[contains(text(), 'Settings')]"));
		WebElement Welcometext = driver.findElement(By.xpath("//h3[contains(text(), 'Welcome')]"));
		Assert.assertEquals(true, Welcometext.isDisplayed());
	    
	}
	
	// Check ALl the Company Links 
	
	@Then("^I click on Companies Link$")
	public void i_click_on_Companies_Link() throws Throwable {
		Thread.sleep(2000);
		//driver.findElement(By.xpath(".//link[@id='Companies']")).click();
		driver.findElement(By.linkText("Companies")).click();
		WebElement companylist = driver.findElement(By.xpath("//h1[contains(text(), 'Listing Companies')]"));
		Assert.assertEquals(true, companylist.isDisplayed());
	}
	
	@Then("^I click on Code Explorer Link$")
	public void i_click_on_Code_Explorer_Link() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.linkText("Code Explorer")).click();
		WebElement codeexplorer = driver.findElement(By.xpath("//h1[contains(text(), 'Code Explorer')]"));
		Assert.assertEquals(true, codeexplorer.isDisplayed());
	}

	@Then("^I click on Tim Explorer Link$")
	public void i_click_on_Tim_Explorer_Link() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.linkText("TIM Explorer")).click();
		
		WebElement timexplorer = driver.findElement(By.xpath("//h1[contains(text(), 'TIM Explorer')]"));
		Assert.assertEquals(true, timexplorer.isDisplayed());
	}

	@Then("^I click on Block Chain Link$")
	public void i_click_on_Block_Chain_Link() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.linkText("Blockchain")).click();
		
		WebElement blockchain = driver.findElement(By.xpath("//h1[contains(text(), 'Blockchain')]"));
		Assert.assertEquals(true, blockchain.isDisplayed());
	}

	@Then("^I click on Form Submission Link$")
	public void i_click_on_Form_Submission_Link() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.linkText("Form Submissions")).click();
		
		WebElement formsubmission = driver.findElement(By.xpath("//h1[contains(text(), 'Form Submissions')]"));
		Assert.assertEquals(true, formsubmission.isDisplayed());
	}

	@Then("^I click on My Forms Link$")
	public void i_click_on_My_Forms_Link() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.linkText("My Forms")).click();
		
		//WebElement myforms = driver.findElement(By.xpath("//h1[contains(text(), 'Forms')]"));
		//Assert.assertEquals(true, myforms.isDisplayed());
	}

	@Then("^I click on My Reports Link$")
	public void i_click_on_My_Reports_Link() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.linkText("My Reports")).click();
		
		//WebElement myreports = driver.findElement(By.xpath("//h1[contains(text(), 'My Reports')]"));
		//Assert.assertEquals(true, myreports.isDisplayed());
	}

	@Then("^I click on Batches Link$")
	public void i_click_on_Batches_Link() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.linkText("Batches")).click();
		
		//WebElement batches = driver.findElement(By.xpath("//h1[contains(text(), 'Association')]"));
		//Assert.assertEquals(true, batches.isDisplayed());
	}

	@Then("^I click on Insights Link$")
	public void i_click_on_Insights_Link() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.linkText("Insights")).click();
		
		Thread.sleep(2000);
		WebElement indights = driver.findElement(By.xpath("//h3[contains(text(), 'Insights / Markets')]"));
		Assert.assertEquals(true, indights.isDisplayed());
	}

	@Then("^I click on GTIN Manager Link$")
	public void i_click_on_GTIN_Manager_Link() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.linkText("GTIN Manager")).click();
		Thread.sleep(2000);
		WebElement gtimmanager = driver.findElement(By.xpath("//h1[contains(text(), 'GTIN Manager')]"));
		Assert.assertEquals(true, gtimmanager.isDisplayed());
	}

	@Then("^I click on PTI Link$")
	public void i_click_on_PTI_Link() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.linkText("PTI")).click();
		Thread.sleep(2000);
		//WebElement pti = driver.findElement(By.xpath("//h1[contains(text(), 'Company:')]"));
		//Assert.assertEquals(true, pti.isDisplayed());
	}

	@Then("^I click on Settings Link$")
	public void i_click_on_Settings_Link() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.linkText("Settings")).click();
		Thread.sleep(2000);
		//WebElement settings = driver.findElement(By.xpath("//h1[contains(text(), 'Username')]"));
		//Assert.assertEquals(true, settings.isDisplayed());
	}
	
	// Insights Links
	
	@Then("^I click on Markets link$")
	public void i_click_on_Markets_link() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.linkText("Markets")).click();
		Thread.sleep(2000);
		//WebElement Markets = driver.findElement(By.xpath("//h1[contains(text(), 'Markets')]"));
		//Assert.assertEquals(true, Markets.isDisplayed());
	}

	@Then("^I click on Ratings Link$")
	public void i_click_on_Ratings_Link() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.linkText("Ratings")).click();
		Thread.sleep(2000);
		//WebElement Ratings = driver.findElement(By.xpath("//h1[contains(text(), 'Ratings')]"));
		//Assert.assertEquals(true, Ratings.isDisplayed());
	}

	@Then("^I click on Containers Link$")
	public void i_click_on_Containers_Link() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.linkText("Containers")).click();
		Thread.sleep(2000);
		//WebElement Containers = driver.findElement(By.xpath("//h1[contains(text(), 'Containers')]"));
		//Assert.assertEquals(true, Containers.isDisplayed());
	}

	@Then("^I click on Devices Link$")
	public void i_click_on_Devices_Link() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.linkText("Devices")).click();
		Thread.sleep(2000);
		//WebElement Devices = driver.findElement(By.xpath("//h1[contains(text(), 'Devices')]"));
		//Assert.assertEquals(true, Devices.isDisplayed());
	}

	@Then("^I click on Programs Link$")
	public void i_click_on_Programs_Link() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.linkText("Programs")).click();
		Thread.sleep(2000);
		//WebElement Programs = driver.findElement(By.xpath("//h1[contains(text(), 'Programs')]"));
		//Assert.assertEquals(true, Programs.isDisplayed());
	}

	@Then("^I click on Specification Management Link$")
	public void i_click_on_Specification_Management_Link() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.linkText("Specification Management")).click();
		Thread.sleep(2000);
		//WebElement SpecificationManagement = driver.findElement(By.xpath("//h1[contains(text(), 'Specification Management')]"));
		//Assert.assertEquals(true, SpecificationManagement.isDisplayed());
	}

	@Then("^I click on Insights Products Link$")
	public void i_click_on_Insights_Products_Link() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.linkText("Insights Products")).click();
		Thread.sleep(2000);
		//WebElement InsightsProducts = driver.findElement(By.xpath("//h1[contains(text(), 'Insights Products')]"));
		//Assert.assertEquals(true, InsightsProducts.isDisplayed());
	}

	@Then("^I click on Locations Link$")
	public void i_click_on_Locations_Link() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.linkText("Locations")).click();
		Thread.sleep(2000);
		//WebElement Locations = driver.findElement(By.xpath("//h1[contains(text(), 'Locations')]"));
		//Assert.assertEquals(true, Locations.isDisplayed());
	}

	@Then("^I click on DC Inspection Link$")
	public void i_click_on_DC_Inspection_Link() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.linkText("DC Inspection")).click();
		Thread.sleep(2000);
		//WebElement DCInspection = driver.findElement(By.xpath("//h1[contains(text(), 'DC Inspection')]"));
		//Assert.assertEquals(true, DCInspection.isDisplayed());
	}

	@Then("^I click on Uploads Link$")
	public void i_click_on_Uploads_Link() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.linkText("Uploads")).click();
		Thread.sleep(2000);
		//WebElement Uploads = driver.findElement(By.xpath("//h1[contains(text(), 'Uploads')]"));
		//Assert.assertEquals(true, Uploads.isDisplayed());
	}

	@Then("^I click on Watched Products Link$")
	public void i_click_on_Watched_Products_Link() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.linkText("Watched Products")).click();
		Thread.sleep(2000);
		//WebElement WatchedProducts = driver.findElement(By.xpath("//h1[contains(text(), 'Watched Products')]"));
		//Assert.assertEquals(true, WatchedProducts.isDisplayed());
	}

	@Then("^I click on Edit Inspections Link$")
	public void i_click_on_Edit_Inspections_Link() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.linkText("Edit Inspections")).click();
		Thread.sleep(2000);
		//WebElement EditInspections = driver.findElement(By.xpath("//h1[contains(text(), 'Edit Inspections')]"));
		//Assert.assertEquals(true, EditInspections.isDisplayed());
	}

	@Then("^I click on Supplier Contacts Link$")
	public void i_click_on_Supplier_Contacts_Link() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.linkText("Supplier Contacts")).click();
		Thread.sleep(2000);
		//WebElement SupplierContacts = driver.findElement(By.xpath("//h1[contains(text(), 'Supplier Contacts')]"));
		//Assert.assertEquals(true, SupplierContacts.isDisplayed());
	}

	@Then("^I click on Inspection Minimums Link$")
	public void i_click_on_Inspection_Minimums_Link() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.linkText("Inspection Minimums")).click();
		Thread.sleep(2000);
		//WebElement InspectionMinimums = driver.findElement(By.xpath("//h1[contains(text(), 'Inspection Minimums')]"));
		//Assert.assertEquals(true, InspectionMinimums.isDisplayed());
	}

	@Then("^I click on Notification Template Manager Link$")
	public void i_click_on_Notification_Template_Manager_Link() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.linkText("Notification Template Manager")).click();
		Thread.sleep(2000);
		//WebElement NotificationTemplateManager = driver.findElement(By.xpath("//h1[contains(text(), 'Notification Template Manager')]"));
		//Assert.assertEquals(true, NotificationTemplateManager.isDisplayed());
	}





}
