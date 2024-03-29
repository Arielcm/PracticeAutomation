package pages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class AbstractTest {
	private WebDriver driver;

	@BeforeMethod
	public void inicializarBrowser() {
		//System.setProperty("webdriver.chrome.driver", "./resources/ChromeDriver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();//Comentar esta linea Trafico-PC
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(getBaseUrl());
	}
	
	@AfterMethod(alwaysRun = true)
	public void cerrarBrowser() {
		if (null != driver) {
			driver.quit();
		}
	}
	
	protected abstract String getBaseUrl();
	
	protected WebDriver getDriver() {
		return driver;
	}
}
