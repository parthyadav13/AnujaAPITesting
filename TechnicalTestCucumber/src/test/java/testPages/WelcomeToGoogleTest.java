package testPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.WelcomeToGooglePage;
import testInputPOGO.ReadWriteJson;
import utils.Base;

public class WelcomeToGoogleTest extends Base {

	WelcomeToGooglePage welcomeToGooglePage = new WelcomeToGooglePage(driver);
	ReadWriteJson enterData = new ReadWriteJson();
	WebDriverWait wait = new WebDriverWait(driver, 30);

	public void verifyPhonenumber() {
		wait.until(ExpectedConditions.visibilityOf(welcomeToGooglePage.PhoneNumber())).equals("");// assert with the
																									// mobile
		// number if entered

	}

	public void enterDate() {
		wait.until(ExpectedConditions.visibilityOf(welcomeToGooglePage.Date()))
				.sendKeys(enterData.ReadJsonFile().getDob().getDate());

	}

	public void enterMonth() {
		wait.until(ExpectedConditions.visibilityOf(welcomeToGooglePage.Month()));
		Select select = new Select(welcomeToGooglePage.Month());
		select.selectByVisibleText(enterData.ReadJsonFile().getDob().getMonth());

	}

	public void enterYear() {
		wait.until(ExpectedConditions.visibilityOf(welcomeToGooglePage.Year()))
				.sendKeys(enterData.ReadJsonFile().getDob().getYear());

	}

	public void enterGender() {
		wait.until(ExpectedConditions.visibilityOf(welcomeToGooglePage.Gender()));
		Select select = new Select(welcomeToGooglePage.Gender());
		select.selectByVisibleText(enterData.ReadJsonFile().getGender());

	}

	public WebElement customGender() {
		WebElement custom = wait.until(ExpectedConditions.visibilityOf(welcomeToGooglePage.CustomGender()));// enter
																											// when
		// gender=custom
		return custom;
	}

	public Select enterPreference() {
		wait.until(ExpectedConditions.visibilityOf(welcomeToGooglePage.PleaseReferMeAs()));// enter when gender=custom
		Select select = new Select(welcomeToGooglePage.PleaseReferMeAs());
		return select;

	}

	public void next() {
		wait.until(ExpectedConditions.visibilityOf(welcomeToGooglePage.Next())).click();
		;

	}
}
