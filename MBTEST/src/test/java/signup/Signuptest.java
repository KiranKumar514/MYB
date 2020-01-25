package signup;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import signuppage.Signup1;
import utils.ConfigReader;

public class Signuptest{
	
	protected WebDriver driver;
	public Signup1 signupdriver;
	
	
	private static final ConfigReader configReader = new ConfigReader();
	public static final String firstName = configReader.getFirstName();
	public static final String lastName = configReader.getLastName();
	public static final String BROWSER = configReader.getBrowser();
	public static final String DRIVER_PATH = configReader.getDriverPath();
	public static final String BASE_URL = configReader.getBaseURL();
	public static final String phonenumber = configReader.getphoneNumber();
	public static final String MONTH = configReader.getMONTH();
	public static final String Day = configReader.getDay();
	public static final String Year = configReader.getYear();
	public static final String Country = configReader.getCountry();
	public static final String postalcode = configReader.getpostalCode();
	public static final String State = configReader.getstate();
	public static final String City = configReader.getcity();
	public static final String Street = configReader.getstreet();
	public static final String Password = configReader.getpassword();
	public static final String Password2 = configReader.getpassword2();
	public static final String aNumber = configReader.getanumber();
	public static final String CardName= configReader.getCardname();
	public static final String DEPOMONTH = configReader.getdepositMonth();
	public static final String DEPOSITYEAR = configReader.getdepositYear();
	public static final String cnum = configReader.getcvvnum();
	public static final String cardnumber = configReader.getcardnumber();
	
	// setting up in Chrome .
	
	@BeforeMethod
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kiran.kumar\\Selenuim\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(BASE_URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		signupdriver = PageFactory.initElements(driver, Signup1.class);
		// depositdriver = PageFactory.initElements(driver, Cashier.class);
		driver.manage().window().maximize();
	}
	
	
	@Test(priority = 1, enabled = true, description = "TC03: Verify the user signup MB.ag with valid credentials")
	public void validCredentials() throws InterruptedException {
				
		signupdriver.setjoinbutton();
		signupdriver.clearFields();
		signupdriver.setEmail();
		signupdriver.setPasword(Password);
		signupdriver.setFirstName(firstName);
		signupdriver.setLastName(lastName);
		signupdriver.setpHonenu(phonenumber);
		signupdriver.setMonth(MONTH);
		signupdriver.setDAYS(Day);
		signupdriver.setYEAR(Year);
		signupdriver.setcOuntry(Country);
		signupdriver.setpostal(postalcode);
		signupdriver.setstate(State);
		signupdriver.setcity(City);
		signupdriver.setstreet(Street);
		signupdriver.setcreatemyaccount();
		Thread.sleep(1000);
	}
	
//	@Test (priority = 2, enabled = true, description = "TC02: Verify the deposit with valid credentials")
//	public void verifydeposit () throws InterruptedException {
//         
//		depositdriver.setclose();
//		Thread.sleep(1000);
//	// 	depositdriver.setCashier();
//		depositdriver.setvisa();
//		depositdriver.setconfirmbutton();
//		depositdriver.setCardNumber(CardName);
//		depositdriver.setenternumber(cardnumber);
//	    depositdriver.setexpmonth(DEPOMONTH);
//	    depositdriver.setexpyear(DEPOSITYEAR);
//		depositdriver.setcvnumber(cnum);
//		depositdriver.setSubmit();
//		// driver.quit();
		
//	}
		
	@AfterTest
	public void takeScreenshot() {
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("./Screenshots/Screen.png"));
			} catch (IOException e) {
			e.printStackTrace();
			}
		
		}
}
