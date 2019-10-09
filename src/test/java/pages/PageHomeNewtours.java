package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageHomeNewtours extends AbstractPage {

	@FindBy(linkText = "REGISTER")
	WebElement LinkRegister;
	
	@FindBy(linkText = "SIGN-ON")
	WebElement Singlink;
	
	public PageHomeNewtours(WebDriver driver) {
		super(driver);

	}
	
	public PageRegisterNewTour ClickLink() {
		LinkRegister.click();
		return new PageRegisterNewTour(driver);
	}
	
	public PageSignNewTour Signin() {
		Singlink.click();
		return new PageSignNewTour(driver);
	}

}
