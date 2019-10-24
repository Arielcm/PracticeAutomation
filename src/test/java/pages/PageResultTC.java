package pages;

import org.openqa.selenium.WebDriver;

public class PageResultTC extends AbstractPage {

	public PageResultTC(WebDriver driver) {
		super(driver);
	}
	
	public String Title() {
		return driver.getTitle().toString();
	}

}
