package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PageHomeTC extends AbstractPage{

	@FindBy(id = "primary-header-flight")
	WebElement flightlink;
	public PageHomeTC(WebDriver driver) {
		super(driver);
	}
	
	public PageFlightTC ClickLink() {
		Utils.SeleniumUtils.esperarVisibilidadDelElemento(driver, flightlink);
		flightlink.click();
		return new PageFlightTC(driver);
	}
	

}
