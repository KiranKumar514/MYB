package tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test; 
import pages.Cashier;
import pages.Signup;
import utils.ConfigReader;

public class VisaCard {

	protected WebDriver driver;
	public Cashier depositdriver;
    public Signup logdriver;

	private static final ConfigReader configReader = new ConfigReader();
	public static final String cardnumber = configReader.getcardnumber();
	public static final String DEPOMONTH = configReader.getdepositMonth();
	public static final String DEPOSIT = configReader.getdepositYear();
	public static final String cnum = configReader.getcvvnum();
	public static final String money = configReader.getMoney();
	public static final String BASE_URL = configReader.getBaseURL();
	public static final String DRIVER_PATH = configReader.getDriverPath();
	public static final String aNumber = configReader.getanumber();
	public static final String Password = configReader.getpassword();
	
		
//	@Test (priority = 1, enabled = true, description = "TC01: Verify the login with valid credentials")
//	public void verifylogin() throws InterruptedException {
//
//		logdriver = PageFactory.initElements(driver, Signup.class);
//				
//		logdriver.setlgin();
//		Thread.sleep(1000);
//		logdriver.setaccountnumer(aNumber);
//		logdriver.setPasword(Password);
//		logdriver.setloginbutton();
//		
//	}
	
	@BeforeMethod
	public void setUpbrowsers() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kirankumar\\Selenuim\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(BASE_URL); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		depositdriver = PageFactory.initElements(driver, Cashier.class);
		logdriver = PageFactory.initElements(driver, Signup.class);
		driver.manage().window().maximize();
	}
	@Test (priority = 2, enabled = true, description = "TC02: Verify the deposit with valid credentials")
	public void verifydeposit () throws InterruptedException {
           		
		
		logdriver.setlgin();
		Thread.sleep(1000);
		logdriver.setaccountnumer(aNumber);
		logdriver.setPasword(Password);
		logdriver.setloginbutton();
		depositdriver.setDeposit1();
		depositdriver.setvisa();
		depositdriver.setenternumber(cardnumber);
	    depositdriver.setexpmont(DEPOMONTH);
	    depositdriver.setexpyea(DEPOSIT);
		depositdriver.setcvnumber(cnum);
		//depositdriver.setAmount(money);
		depositdriver.setbonus();
		depositdriver.setbuttond();
	}

}
