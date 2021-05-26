package testPages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.PrivacyPage;
import utils.Base;

public class PrivacyTest extends Base {

	PrivacyPage privacyPage = new PrivacyPage(driver);
	WebDriverWait wait = new WebDriverWait(driver, 20);

	public void clickOnIAgree() {
		wait.until(ExpectedConditions.visibilityOf(privacyPage.IAgree())).click();
	}

}
