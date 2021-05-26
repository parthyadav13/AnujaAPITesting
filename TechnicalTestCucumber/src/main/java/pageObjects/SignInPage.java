package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

	WebDriver driver;

	public SignInPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='identifierId']")
	WebElement email;
	@FindBy(xpath = "//*[@id='identifierNext']")
	WebElement identifierNext;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//*[@id='passwordNext']")
	WebElement passwordNext;

	@FindBy(xpath = "//*[text()='Create account']")
	WebElement createAccount;

	@FindBy(xpath = "//*[text()='For myself']")
	WebElement myself;

	public WebElement CreateAccount() {
		return createAccount;

	}

	public WebElement Myself() {
		return myself;

	}

	public WebElement Email() {
		return email;

	}

	public WebElement Password() {
		return password;

	}

	public WebElement PasswordNext() {
		return passwordNext;

	}

	public WebElement IdentifierNext() {
		return identifierNext;

	}

}