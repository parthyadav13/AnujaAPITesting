package testPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.VerifyPhoneNumberPage;
import utils.Base;

public class VerifyPhoneNumberTest extends Base {

	VerifyPhoneNumberPage verifyPhoneNumberPage = new VerifyPhoneNumberPage(driver);
	WebDriverWait wait = new WebDriverWait(driver, 20);

	public WebElement checkMobileVerificationPage() {
		WebElement phone = wait.until(ExpectedConditions.visibilityOf(verifyPhoneNumberPage.PhoneNumber()));
		return phone;
	}

	public WebElement enterPhoneNumber() {
		WebElement phone = wait.until(ExpectedConditions.visibilityOf(verifyPhoneNumberPage.PhoneNumber()));
		return phone;
	}

	public void clickonNext() {
		wait.until(ExpectedConditions.visibilityOf(verifyPhoneNumberPage.Next())).click();

	}

	public WebElement enterCode() {
		WebElement code = wait.until(ExpectedConditions.visibilityOf(verifyPhoneNumberPage.Code()));
		return code;
	}

	public void clickonVerify() {
		wait.until(ExpectedConditions.visibilityOf(verifyPhoneNumberPage.Verify())).click();

	}

}
