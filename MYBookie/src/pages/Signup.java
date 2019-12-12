package pages;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Signup {
	protected WebDriver driver;

	@FindBy(name = "last_name")
	private WebElement lastName;

	@FindBy(name = "first_name")
	private WebElement firstName;

	@FindBy(id = "email")
	private WebElement eMail; 	

	@FindBy(id = "phone")
	private WebElement pHone; 

	@FindBy(id = "address_postalcode")
	private WebElement postalCode;

	@FindBy(id = "address_city")
	private WebElement cIty;

	@FindBy(id = "address_street")
	private WebElement sTreet;

	@FindBy(id = "password")
	private WebElement pasword;

	@FindBy(name = "password2")
	private WebElement pasword2;

	@FindBy(name = "signup")
	private WebElement button;

	@FindBy(id = "signup-info-modal")
	private WebElement Modal;

	@FindBy(xpath= "//a[@class='btn btn-lg btn-login gaming__header-login-btn']")
	private WebElement LOGIN;

	@FindBy(xpath = "//a[@class='btn btn-lg btn-join gaming__header-login-btn mr-2 shake-lr']")
	private WebElement JOIN;

	@FindBy(id="name")
	private WebElement Account;

	@FindBy(id="login_trk")
	private WebElement Lbutton;

	@FindBy(id = "nickname")
	private WebElement Username;


	public Signup (WebDriver driver) {
		this.driver = driver;
	}

	public void setFirstName(String firstname) {
		firstName.clear();
		firstName.sendKeys(firstname);
	
	}

	public void setEmail() {
		eMail.clear();
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);  
		eMail.sendKeys("test"+ randomGenerator.nextInt(1000) +"@yaooo.com");
	}

	public void setLastName(String lastname) {
		lastName.clear();
		lastName.sendKeys(lastname);
	}
	public void setpHonenu(String phonenumber) {
		pHone.clear();
		pHone.sendKeys(phonenumber);
	}

	public void setMonth(String MONTH) {
		Select month = new Select(driver.findElement(By.id("dob_month")));
		month.selectByIndex(1);
	}

	public void setDAYS(String Day) {
		Select day = new Select(driver.findElement(By.id("dob_day")));
		day.selectByIndex(1);
	}

	public void setYEAR(String Year) {
		Select year = new Select(driver.findElement(By.id("dob_year")));
		year.selectByValue(Year);
	}

	public void setcOuntry(String Country) {
		Select country = new Select(driver.findElement(By.id("address_country")));
		country.selectByVisibleText(Country);
	}

	public void setpostal(String postalcode) {
		postalCode.clear();
		postalCode.sendKeys(postalcode);
	}

	public void setstate(String State) {
		Select state = new Select(driver.findElement(By.id("address_state")));
		state.selectByVisibleText(State);
	}

	public void setcity(String City) {
		cIty.clear();
		cIty.sendKeys(City);
	}

	public void setstreet(String Street) {
		sTreet.clear();
		sTreet.sendKeys(Street);
	}

	public void setPasword(String Password) {
		pasword.clear();
		pasword.sendKeys(Password);
	}

	public void setrePassword(String Password2) {
		pasword2.clear();
		pasword2.sendKeys(Password2);
	}

	public void setuname(String userName) {
		Username.clear();
		Username.sendKeys(userName);
	}

	public void setcreatemyaccount() {
		button.click();
	}

	public void setsignupModal() {

		Modal.click();

	}

	public void clearFields() {
		firstName.clear();
		lastName.clear();
	}

	public void setlgin() {
		LOGIN.click(); 

	}

	public void setaccountnumer(String aNumber) {
		Account.clear();
		Account.sendKeys(aNumber);
	}

	public void setloginbutton() {
		Lbutton.click();
	}

	public void setjoinbutton() {
		JOIN.click();
	}
}

