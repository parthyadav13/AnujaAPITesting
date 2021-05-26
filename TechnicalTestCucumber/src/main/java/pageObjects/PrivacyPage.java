package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrivacyPage {

	WebDriver driver;

	public PrivacyPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[text()='Cancel']")
	WebElement cancel;

	@FindBy(xpath = "//*[text()='I agree']")
	WebElement iAgree;

	public WebElement IAgree() {
		return iAgree;
	}

	public WebElement Cancel() {
		return cancel;
	}

}
