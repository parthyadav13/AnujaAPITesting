package testPages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.CreateYourGoogleAccountPage;
import testInputPOGO.ReadWriteJson;
import utils.Base;

public class CreateYourGoogleAccountTest extends Base {

	CreateYourGoogleAccountPage createPage = new CreateYourGoogleAccountPage(driver);
	ReadWriteJson enterData = new ReadWriteJson();
	WebDriverWait wait = new WebDriverWait(driver, 20);

	public void enterFirstName() {

		wait.until(ExpectedConditions.visibilityOf(createPage.FirstName()))
				.sendKeys(enterData.ReadJsonFile().getFirstName());

	}

	public void enterLastName() {
		wait.until(ExpectedConditions.visibilityOf(createPage.LastName()))
				.sendKeys(enterData.ReadJsonFile().getLastName());

	}

	public void enterUserName() {
		wait.until(ExpectedConditions.visibilityOf(createPage.UserName()))
				.sendKeys(enterData.ReadJsonFile().getUsername());

	}

	public void enterPassword() {
		wait.until(ExpectedConditions.visibilityOf(createPage.Password()))
				.sendKeys(enterData.ReadJsonFile().getPassword());

	}

	public void enterConfirmPassword() {

		wait.until(ExpectedConditions.visibilityOf(createPage.ConfirmPassword()))
				.sendKeys(enterData.ReadJsonFile().getPassword());

	}

	public void clickNext() {
		wait.until(ExpectedConditions.visibilityOf(createPage.Next())).click();
	}

	public void selectOptions() throws Exception {
		if (createPage.AvailableOptions().isEnabled()) {
			Thread.sleep(500);
			List<WebElement> links = createPage.AvailableOptions().findElements(createPage.Options());
			links.get(0).click();
			wait.until(ExpectedConditions.visibilityOf(createPage.Next())).click();

		}
	}

}
