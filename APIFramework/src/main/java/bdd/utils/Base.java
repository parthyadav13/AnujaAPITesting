package utils;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {

	public static WebDriver driver;
	GlobalValues gv = new GlobalValues();

	public WebDriver initialiseDriver() throws IOException {
		Properties prop = gv.PropertyFile();

		String browserName = prop.getProperty("browser");
		String driverPath = prop.getProperty("driverPath");
		int timeout = Integer.parseInt(prop.getProperty("timeOut"));

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			// write code for firefox if required in future
		}

		else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", driverPath);
			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);

		return driver;
	}

	public String enterBrowerUrl() throws IOException {
		Properties prop = gv.PropertyFile();
		String url = prop.getProperty("url");
		return url;
	}

	public String jsonPathInput() throws IOException {
		Properties prop = gv.PropertyFile();
		String jsonPath = prop.getProperty("jsonPath");
		return jsonPath;
	}

	public String jsonPathForCustomInput() throws IOException {
		Properties prop = gv.PropertyFile();
		String jsonPath = prop.getProperty("jsonPathforCustomGender");
		return jsonPath;
	}

	public String jsonPathOutPut() throws IOException {
		Properties prop = gv.PropertyFile();
		String jsonPath = prop.getProperty("outjsonPath");
		return jsonPath;
	}

	public String jsonPathLoginInfo() throws IOException {
		Properties prop = gv.PropertyFile();
		String jsonPath = prop.getProperty("loginjsonPath");
		return jsonPath;
	}

}
