package testPages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.SignInPage;
import testInputPOGO.ReadWriteJson;
import utils.Base;

public class SignInTest extends Base {

	SignInPage signInPage = new SignInPage(driver);
	ReadWriteJson enterData = new ReadWriteJson();

	WebDriverWait wait = new WebDriverWait(driver, 30);

	public void enterUserName() throws InterruptedException {

		wait.until(ExpectedConditions.visibilityOf(signInPage.Email()))
				.sendKeys(enterData.LoginInfoJson().getUserName());

	}

	public void enterPassword() throws InterruptedException {

		wait.until(ExpectedConditions.visibilityOf(signInPage.Password()))
				.sendKeys(enterData.LoginInfoJson().getPassword());
	}

	public void enterNextAfterUserName() throws InterruptedException {

		wait.until(ExpectedConditions.visibilityOf(signInPage.IdentifierNext())).click();
	}

	public void enterNextAfterPassword() throws InterruptedException {

		wait.until(ExpectedConditions.visibilityOf(signInPage.PasswordNext())).click();
	}

	public void clickonCreateAccount() throws InterruptedException {
		// Thread.sleep(500);
		signInPage.CreateAccount().click();
	}

	public void clickonMyself() throws InterruptedException {
		Thread.sleep(500);
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.visibilityOf(signInPage.Myself())).click();
	}

}
