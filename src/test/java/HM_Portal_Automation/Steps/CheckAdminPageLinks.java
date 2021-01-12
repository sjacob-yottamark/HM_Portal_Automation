//package HM_Portal_Automation.Steps;
//import cucumber.api.java.Before;
//import java.util.concurrent.TimeUnit;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
////import io.cucumber.java.en.Given;
////import io.cucumber.java.en.Then;
//
//public class CheckAdminPageLinks {
//	
//	WebDriver driver;
//	
//	@Before()
//	public void setup() throws Exception {
//		//System.setProperty("webdriver.chrome.driver", "//Users//sjacob//Development//2020//iFoods_Automation//HM_Portal_Automation//src//test//java//HM_Portal_Automation//resources//chromedriver 4");
//		System.setProperty("webdriver.chrome.driver", "//Users//sjacob//drivers//chromedriver");
//		this.driver = new ChromeDriver();
//		//this.driver = new FirefoxDriver();
//		this.driver.manage().window().maximize();
//		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);	
//	}
//	
//	@cucumber.api.java.en.Given("User navigates to harvestmark portal")
//	public void user_navigates_to_harvestmark_portal() {
//	    driver.get("https://qa.harvestmark.com/users/sign_in");
//	    
//	}
//
//	@cucumber.api.java.en.Then("User enters the admin username")
//	public void user_enters_the_admin_username() {
//	    //driver.findElement(By.id(id))
//		driver.findElement(By.xpath(".//*[@id='user_email']")).sendKeys("dev@yottamark.com");
//	    
//	}
//
//	@cucumber.api.java.en.Then("User enters the admin password")
//	public void user_enters_the_admin_password() {
//		driver.findElement(By.xpath(".//*[@id='user_password']")).sendKeys("bbb123");
//	    
//	}
//
//	@cucumber.api.java.en.Then("User clicks on the sign in button")
//	public void user_clicks_on_the_sign_in_button() {
//		//driver.findElement(By.xpath("//a[contains(text(), 'Sign in')]")).click(); - 
//		
//		driver.findElement(By.xpath(".//*[@id='sign_in']")).click();
//	    
//	}
//
//	@cucumber.api.java.en.Then("User should be taken to the successful login page")
//	public void user_should_be_taken_to_the_successful_login_page() throws InterruptedException {
//		Thread.sleep(4000);
//		//WebElement Welcometext = driver.findElement(By.xpath("//a[contains(text(), 'Settings')]"));
//		WebElement Welcometext = driver.findElement(By.xpath("//h3[contains(text(), 'Welcome')]"));
//		Assert.assertEquals(true, Welcometext.isDisplayed());
//	    
//	}
//
//
//
//
//}
