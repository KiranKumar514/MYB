package tests;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Signup;
import utils.ConfigReader;

public class MBNetTest{
	
	protected WebDriver driver;
	public Signup registrationdriver;
	private static final ConfigReader configReader = new ConfigReader();
	public static final String firstName = configReader.getFirstName();
	public static final String lastName = configReader.getLastName();
	public static final String email = configReader.ValidEmail();
	public static final String phonenumber = configReader.getphoneNumber();
	public static final String Password = configReader.getpassword();
	public static final String Password2 = configReader.getpassword2();
	public static final String postalcode = configReader.getpostalCode();
	public static final String State = configReader.getstate();
	public static final String userName = configReader.getUname();
	public static final String BROWSER = configReader.getBrowser();
	public static final String DRIVER_PATH = configReader.getDriverPath();
	public static final String BASE_URL = configReader.getBaseURL();
	
		
	// setting up in Chrome .
	
	@BeforeTest
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kirankumar\\Selenuim\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(BASE_URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		registrationdriver = PageFactory.initElements(driver, Signup.class);
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void initURL() {
		driver.get(BASE_URL);
		registrationdriver.clearFields();
	}
	
	@Test(priority = 1, enabled = true, description = "TC02: Verify the user signup MB.Net with valid credentials")
	public void validCredentials() {
				
		registrationdriver.setFirstName(firstName);
		registrationdriver.setLastName(lastName);
		registrationdriver.setEmail();
		registrationdriver.setpHonenu(phonenumber);
		registrationdriver.setpostal(postalcode);
		registrationdriver.setstate(State);
		registrationdriver.setPasword(Password);
		registrationdriver.setrePassword(Password2);
		registrationdriver.setuname(userName);
		registrationdriver.setcreatemyaccount();
		
			}
		
		@AfterTest
	   
		public void Close() throws InterruptedException{
		Thread.sleep(2000);
		driver.quit();
	}
	}

