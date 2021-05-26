package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	WebDriver driver;

	public WelcomePage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Personal info")
	WebElement personalInfo;

	@FindBy(xpath = "//*[@id='yDmH0d']/c-wiz[2]/div/div[2]/c-wiz/c-wiz/div/div[3]/div/div/c-wiz/section/div[1]/article/div/div/div[3]/div[2]/a")
	WebElement name;
	/*
	 * @FindBy(xpath = "//a[contains(text(),'Name')]") WebElement name;
	 */
	@FindBy(xpath = "//*[@id='i4']")
	WebElement firstName;

	/*
	 * @FindBy(xpath = "//a[contains(text(),'First name')]") WebElement firstName;
	 */

	@FindBy(xpath = "//*[@id='i7']")
	WebElement lastName;
	/*
	 * @FindBy(xpath = "//a[contains(text(),'Last name')]") WebElement lastName;
	 */

	@FindBy(xpath = "//*[@id='yDmH0d']/c-wiz/div/div[3]/c-wiz/div/div[2]/div/div[2]/div[4]/div[2]/div/div/button")
	WebElement save;

	/*
	 * @FindBy(xpath ="//button") WebElement save;
	 */
	@FindBy(xpath = "//*[@id='yDmH0d']/c-wiz/div/div[3]/c-wiz/div/div[2]/div/div[2]/div[4]/div[1]/div/button")
	WebElement cancel;

	@FindBy(xpath = "//h1[contains(text(), 'Welcome')]")
	WebElement welcome;

	public WebElement Welcome() {
		return welcome;
	}

	public WebElement Save() {
		return save;
	}

	public WebElement FirstName() {
		return firstName;
	}

	public WebElement LastName() {
		return lastName;
	}

	public WebElement PersonalInfo() {
		return personalInfo;
	}

	public WebElement Name() {
		return name;
	}

	public WebElement Cancel() {
		return cancel;
	}

}