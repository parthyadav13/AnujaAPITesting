package testPages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.WelcomePage;
import testInputPOGO.ReadWriteJson;
import utils.Base;

public class WelcomeTest extends Base {

	WelcomePage welcomePage = new WelcomePage(driver);
	ReadWriteJson enterData = new ReadWriteJson();
	WebDriverWait wait = new WebDriverWait(driver, 30);

	public void clickOnPersonalInfo() {
		wait.until(ExpectedConditions.visibilityOf(welcomePage.PersonalInfo())).click();
	}

	public void clickOnName() {
		wait.until(ExpectedConditions.visibilityOf(welcomePage.Name())).click();
	}

	public boolean verifyName() {
		String modifiedName = enterData.LoginInfoJson().getFisrtNameModifyTo()
				.concat(enterData.LoginInfoJson().getLastNameModifyTo());
		// Assert.assertEquals(modifiedName, welcomePage.Name().getText());
		return welcomePage.Name().getText().contains(modifiedName);

	}

	public void enterFirstName() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(welcomePage.FirstName())).clear();
		wait.until(ExpectedConditions.visibilityOf(welcomePage.FirstName()))
				.sendKeys(enterData.LoginInfoJson().getFisrtNameModifyTo());
		// Thread.sleep(3000);
	}

	public void enterLastName() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(welcomePage.LastName())).clear();
		wait.until(ExpectedConditions.visibilityOf(welcomePage.LastName()))
				.sendKeys(enterData.LoginInfoJson().getLastNameModifyTo());
		// Thread.sleep(3000);
	}

	public void clickSave() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(welcomePage.Save())).click();
		// Thread.sleep(3000);
	}

	public void clickOnCancel() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(welcomePage.Cancel())).click();
		// Thread.sleep(3000);

	}
}
