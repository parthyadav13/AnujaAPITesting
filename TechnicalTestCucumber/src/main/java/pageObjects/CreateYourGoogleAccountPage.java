package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateYourGoogleAccountPage {

	WebDriver driver;

	public CreateYourGoogleAccountPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#firstName")
	WebElement firstName;

	@FindBy(xpath = "//*[@id='lastName']")
	WebElement lastName;

	@FindBy(xpath = "//*[@id='username']")
	WebElement userName;

	@FindBy(xpath = "//*[@id='passwd']/div[1]/div/div[1]/input")
	WebElement password;

	@FindBy(xpath = "//*[@id='confirm-passwd']/div[1]/div/div[1]/input")
	WebElement confirmPassword;

	@FindBy(css = "#accountDetailsNext")
	WebElement next;

	@FindBy(xpath = "//*[@id='usernameList']")
	WebElement availableOptions;

	By options = By.tagName("li");

	public WebElement FirstName() {
		return firstName;
	}

	public WebElement LastName() {
		return lastName;
	}

	public WebElement UserName() {
		return userName;
	}

	public WebElement AvailableOptions() {
		return availableOptions;

	}

	public By Options() {
		return options;
	}

	public WebElement Password() {
		return password;
	}

	public WebElement ConfirmPassword() {
		return confirmPassword;
	}

	public WebElement Next() {
		return next;

	}

}