package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomeToGooglePage {
	WebDriver driver;

	public WelcomeToGooglePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='phoneNumberID']")
	WebElement phoneNumber;

	@FindBy(name = "recoveryEmail")
	WebElement recoveryEmail;

	@FindBy(xpath = "//*[@id='month']")
	WebElement month;

	@FindBy(xpath = "//*[@id='day']")
	WebElement day;

	@FindBy(xpath = "//*[@id='year']")
	WebElement year;

	@FindBy(xpath = "//*[@id='gender']")
	WebElement gender;

	@FindBy(xpath = "//*[@id='customGender']/div[1]/div/div[1]/input")
	WebElement customGender;

	@FindBy(xpath = "//*[@id='genderpronoun']")
	WebElement pleaseReferMeAs;

	@FindBy(xpath = "//*[@id='view_container']/div/div/div[2]/div/div[2]/div/div[1]/div/div/button")
	WebElement next;

	public WebElement PhoneNumber() {

		return phoneNumber;
	}

	public WebElement RecoveryEmail() {

		return recoveryEmail;
	}

	public WebElement Month() {
		return month;
	}

	public WebElement Date() {
		return day;
	}

	public WebElement Gender() {

		return gender;
	}

	public WebElement Year() {
		return year;
	}

	public WebElement Next() {
		return next;
	}

	public WebElement CustomGender() {

		return customGender;
	}

	public WebElement PleaseReferMeAs() {

		return pleaseReferMeAs;
	}

}
