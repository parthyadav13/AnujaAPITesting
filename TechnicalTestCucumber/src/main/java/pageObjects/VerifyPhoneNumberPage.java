package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyPhoneNumberPage {

	WebDriver driver;

	public VerifyPhoneNumberPage(WebDriver driver) {
		// this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = "#phoneNumberId")
	WebElement phoneNumber;

	@FindBy(xpath = "//*[@id='view_container']/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/div[2]")
	WebElement next;

	@FindBy(xpath = "//*[@id='code']")
	WebElement code;

	@FindBy(xpath = "//*[@id='view_container']/div/div/div[2]/div/div[2]/div[2]/div[1]/div/div/button")
	WebElement verify;

	public WebElement PhoneNumber() {

		return phoneNumber;
	}

	public WebElement Next() {

		return next;
	}

	public WebElement Verify() {

		return verify;
	}

	public WebElement Code() {

		return code;
	}

}
