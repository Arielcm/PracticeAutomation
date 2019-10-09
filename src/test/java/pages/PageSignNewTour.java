package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utils.SeleniumUtils;

public class PageSignNewTour extends AbstractPage {

	@FindBy(name = "userName")
	WebElement usertxt;
	@FindBy(name = "password")
	WebElement passtxt;
	@FindBy(name = "login")
	WebElement loginbtn;	
	@FindBy(name="findFlights")
	WebElement continuebtn;
	public PageSignNewTour(WebDriver driver) {
		super(driver);
		
	}
	
	private void complete() {
		usertxt.sendKeys("a");
		passtxt.sendKeys("a");
		loginbtn.click();
	}
	
	public String signin() {
		complete();
		SeleniumUtils.esperarVisibilidadDelElemento(driver, continuebtn);
		return driver.getCurrentUrl();
	}

}
