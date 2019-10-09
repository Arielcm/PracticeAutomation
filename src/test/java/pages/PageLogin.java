package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageLogin extends AbstractPage {

	@FindBy(name = "username")
	WebElement usertxt;
	@FindBy(name = "password")
	WebElement passtxt;
	@FindBy(xpath ="//button")
	WebElement btn;
	public PageLogin(WebDriver driver) {
		super(driver);

	}
	
	private void complete() {
		usertxt.sendKeys("tomsmith");
		passtxt.sendKeys("SuperSecretPassword!");
		btn.click();
	}
	
	public String login() {
		complete();
		return driver.getCurrentUrl();
	}

}
