package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageNewWindows extends AbstractPage {

	@FindBy(tagName = "h3")
	private WebElement title;

	public PageNewWindows(WebDriver driver) {
		super(driver);
	}
	
	public String getTitle() {
		return title.getText();
	}
}
