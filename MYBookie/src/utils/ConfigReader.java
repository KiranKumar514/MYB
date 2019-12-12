package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Class reads base settings from the config.properties file
 */
public class ConfigReader {
	
	private String firstname = "";
	private String lastname = "";
	private String validEmail = "";
//	private String invalidPassword = "";
	private String driverPath = "";
	private String browser ="";
	private String baseURL = "";
	private String MONTH = "";
	private String Day = "";
	private String Year = "";
	private String Country = "";
	private String phonenumber= "";
	private String postalcode = "";
	private String State = "";
	private String City = "";
	private String Street = "";
	private String Password = "";
	private String Password2 = "";
	private String userName = "";
	private String aNumber="";
	private String cardnumber="";
	private String cnum="";
	private String Depositmonth = "";
    private String Deposityear = "";
    private String money ="";

	/**
	 * Class constructor loads settings from the file and saves to fields
	 */
	public ConfigReader() {
		FileInputStream fis;
		try {
			fis = new FileInputStream("data/config2.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Cant't read config2.properties file!");
			return;
		}
		Properties p = new Properties();
		try {
			p.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Cant't read config2.properties file!");
			return;
		}
		
		firstname = p.getProperty("FIRSTNAME");
		validEmail = p.getProperty("VALID_EMAIL");
//		invalidPassword = p.getProperty("INVALID_PASSWORD");
		lastname = p.getProperty("LASTNAME");
		browser = p.getProperty("BROWSER");
		driverPath = p.getProperty("DRIVER_PATH");
		baseURL = p.getProperty("BASE_URL");
		phonenumber = p.getProperty("phonenumber");
	    MONTH = p.getProperty("MONTH");
	    Day = p.getProperty("Day");
	    Year = p.getProperty("Year");
	    Country = p.getProperty("Country");
	    postalcode= p.getProperty("postalcode");
	    State= p.getProperty("State");
	    City= p.getProperty("City");
	    Street= p.getProperty("Street");
	    Password = p.getProperty("pasword");
	    Password2 = p.getProperty("pasword2");
	    userName =p.getProperty("Username");
	    aNumber =p.getProperty("Account");
	    cardnumber=p.getProperty("cnumber");
	    cnum=p.getProperty("CV");
	    Depositmonth = p.getProperty("DEPOMONTH");
	    Deposityear=p.getProperty("DEPOSIT");
	    money =p.getProperty("dollar");
		
	}
	
	public String getFirstName() {
		return firstname;
	}
	
	public String getLastName() {
		return lastname;
	}

	public String getBrowser() {
		return browser;
	}
	
	public String getMONTH() {
		return MONTH;
	}
	
	public String getDay() {
		return Day;
	}
	
	public String getYear() {
		return Year;
	}
	
	public String getCountry() {
		return Country;
	}
	
	
	public String getDriverPath() {
		return driverPath;
	}

//	public String invalidPassword() {
//		return invalidPassword;
//	}
//
	public String ValidEmail() {
		return validEmail;
	}

	public String getBaseURL() {
		return baseURL;
	}

	public String getphoneNumber() {
		return phonenumber;
	}
	
	public String getpostalCode() {
		return postalcode;
	}
	
	public String getstate() {
		return State;
	}

	public String getcity() {
		return City;
	}
	
	public String getstreet() {
		return Street;
	}
	
	public String getpassword() {
		return Password;
	}
	
	public String getpassword2() {
		return Password2;
	}
	
	public String getUname() {
		return userName; 
	}
	
	public String getanumber() {
		return aNumber;
	}
	
	public String getcardnumber() {
		return cardnumber ;
	}
	
	public String getcvvnum() {
		return cnum ;
	}
		
	public String getdepositMonth() {
		return Depositmonth ;
	}	
	
	public String getdepositYear() {
		return Deposityear ;
	}	
	public String getMoney() {
		return money;
	}
}
