package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoreYouCanDoWithMobile {
	
	
	WebDriver driver;
	  
	  public MoreYouCanDoWithMobile(WebDriver driver)
	  { 
		  this.driver=driver; 
		  PageFactory.initElements(driver, this);
	  }
	  
	  @FindBy(xpath="//*[text()='Skip']")
	  WebElement skip;
	  
	  public WebElement Skip() 
	  { 
		  return skip; 
	  }

}
