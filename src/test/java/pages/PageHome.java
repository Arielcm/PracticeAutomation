package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageHome extends AbstractPage {

	@FindBy(linkText = "Dropdown")
	private WebElement dropdown;
	
	@FindBy(linkText = "Multiple Windows")
	private WebElement multipleWindows;
	
	@FindBy(linkText = "Form Authentication")
	private WebElement loginlink;

	public PageHome(WebDriver driver) {
		super(driver);
	}
	
	public PageMultipleWindows clickMultipleWindows() {
		multipleWindows.click();
		return new PageMultipleWindows(driver);
	}
	
	public PageLogin clickLogin() {
		loginlink.click();
		return new PageLogin(driver);
	}
}
