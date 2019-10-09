package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utils.SeleniumUtils;


public class PageHomeAutomation extends AbstractPage {

	@FindBy(className = "login")
	WebElement loginlink;

	
	public PageHomeAutomation(WebDriver driver) {
		super(driver);
	}
	
	public PageLoginAutomation loginclick() {
		SeleniumUtils.esperarVisibilidadDelElemento(driver, loginlink);
		loginlink.click();
		return new PageLoginAutomation(driver);
	}

}
