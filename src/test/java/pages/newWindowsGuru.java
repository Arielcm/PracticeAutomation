package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utils.SeleniumUtils;


public class newWindowsGuru extends AbstractPage {
	@FindBy(id = "ResultsLogoImg1")
	WebElement imgresult;
	
	public newWindowsGuru(WebDriver driver) {
		super(driver);
		
	}

	public boolean getVisible() {
		SeleniumUtils.cambiapestaña(driver);
		return imgresult.isDisplayed();
	}
	
	

}
