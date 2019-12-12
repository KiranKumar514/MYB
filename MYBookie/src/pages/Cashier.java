package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;


public class Cashier {

	protected WebDriver driver; 

	@FindBy(xpath="//a[@href='/cashier']")
	private WebElement deposit;

	@FindBy(xpath="//a[@href='#credit_cards']")
	private WebElement Card;

	@FindBy(id = "cardNumber")
	private WebElement cnumber;

	@FindBy(xpath="//*[@id='newCcrForDec']/div/div[1]/div[3]/div/input")
	private WebElement CV;

	@FindBy(xpath="//*[@id='Imput_amount']")
	private WebElement dollar;

	@FindBy(id ="depositExisting")
	private WebElement buttondeposit ;

	@FindBy(xpath="//*[@id=\"newCcrForDec\"]/div/div[4]/div/div/div[4]/div[1]/div/div/label[2]")
	WebElement nobonus;

	public Cashier (WebDriver driver) {
		this.driver = driver; 
	}
	public void setDeposit1() {
		deposit.click();
	}

	public void setvisa() {
		Card.click();
	}

	public void setenternumber(String cardnumber) {
		cnumber.clear();
		cnumber.sendKeys(cardnumber);

	}

	public void setexpmont(String Depositmonth) {
		
		WebElement MON = driver.findElement(By.xpath("//*[@id=\"newCcrForDec\"]/div/div[1]/div[2]/div/div[1]/div/select"));
		MON.click();
		Select month = new Select(driver.findElement(By.name("expMonth"))) ;
		month.deselectByValue(Depositmonth);
	}

	public void setexpyea(String Deposityear) {
				
		Select year = new Select(driver.findElement(By.name("expYear"))) ;
		year.selectByValue(Deposityear);
	}

	public void setcvnumber(String cnum) {
		CV.clear();
		CV.sendKeys(cnum);
	}

	public void setAmount(String money) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(3000);
		dollar.clear();
	//	dollar.click();
		dollar.sendKeys(money);
	}

	public void setbonus() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		nobonus.click();
	}

	public void setbuttond() {
		buttondeposit.click();
	}
}
