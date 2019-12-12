package tests;
import pages.Signup;
import utils.ConfigReader;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

	protected WebDriver driver;
	public Signup logindriver;
	private static final ConfigReader configReader = new ConfigReader();
	public static final String BASE_URL = configReader.getBaseURL();
	public static final String aNumber = configReader.getanumber();
	public static final String Password = configReader.getpassword();


	// @Parameters("browser")
	//	@BeforeTest
	//	public void setUpbrowsers(String browserName){

	//		if(browserName.equalsIgnoreCase("firefox"))
	//		{
	//			// path for Firefox Driver
	//			System.setProperty("webdriver.gecko.driver","C:\\Users\\Kirankumar\\Selenuim\\Drivers\\geckodriver.exe");
	//			driver = new FirefoxDriver();
	//		}
	//
	//		else if(browserName.equalsIgnoreCase("chrome"))
	//		{
	//			// path for Chrome Driver 
	//			System.setProperty("webdriver.chrome.driver","C:\\Users\\Kirankumar\\Selenuim\\Drivers\\chromedriver.exe");
	//			driver = new ChromeDriver();

	@BeforeMethod
	public void setUpbrowsers() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kirankumar\\Selenuim\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(BASE_URL); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logindriver = PageFactory.initElements(driver, Signup.class);
		driver.manage().window().maximize();

	}

	@Test(priority = 0, enabled = true, description = "TC01: Verify the user login with valid credentials")
	public void validCredentials() throws InterruptedException {
		logindriver.setlgin();
	    Thread.sleep(2000);
	    driver.switchTo().activeElement();
		logindriver.setaccountnumer(aNumber);
		logindriver.setPasword(Password);
		logindriver.setloginbutton();

	}
}

