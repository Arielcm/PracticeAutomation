package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFlightTC extends AbstractPage {

	@FindBy (id = "flight-origin-flp")
	WebElement originftxt;
	@FindBy (id = "flight-destination-flp")
	WebElement destinationftxt;
	@FindBy (id = "flight-departing-flp")
	WebElement departingclick;
	@FindBy (xpath = "button[class='datepicker-paging datepicker-next btn-paging btn-secondary next']")
	WebElement nextmonthclick;
	public PageFlightTC(WebDriver driver) {
		super(driver);
	}

}
