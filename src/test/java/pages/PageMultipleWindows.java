package pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageMultipleWindows extends AbstractPage {

	@FindBy(linkText = "Click Here")
	private WebElement clickHere;

	public PageMultipleWindows(WebDriver driver) {
		super(driver);
	}

	public PageNewWindows clickLink() {
		clickHere.click();
		cambiapestaña(driver);
		return new PageNewWindows(driver);
	}
	
	public void cambiapestaña(WebDriver driver) {
		ArrayList<String> pestaña = new ArrayList<String> (driver.getWindowHandles());
		   driver.switchTo().window(pestaña.get(1));
		}
}
