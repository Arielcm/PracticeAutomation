package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageRegisterNewTour extends AbstractPage {

	@FindBy(id="email")
	WebElement emailtxt;
	@FindBy(name="password")
	WebElement passtxt;
	@FindBy(name="confirmPassword")
	WebElement confirmpasstxt;
	@FindBy(name="register")
	WebElement registerbtn;
	public PageRegisterNewTour(WebDriver driver) {
		super(driver);
	}
	
	private void Register() {
		emailtxt.sendKeys("a");
		passtxt.sendKeys("a");
		confirmpasstxt.sendKeys("a");
		registerbtn.click();
	}
	
	public String RegisterPage() {
		Register();
		return driver.getCurrentUrl();
	}

	
}
