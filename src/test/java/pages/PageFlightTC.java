package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
	@FindBy (id = "flight-returning-flp")
	WebElement returningclick;
	@FindBy (xpath = "//*[@id=\"gcw-flights-form-flp\"]/div[8]/label/button")
	WebElement searchbtn;
	public PageFlightTC(WebDriver driver) {
		super(driver);
	}
	
	public PageResultTC SearchFly() {
		Utils.SeleniumUtils.esperarVisibilidadDelElemento(driver, originftxt);
		originftxt.sendKeys("Resistencia, Argentina (RES-Resistencia Intl.)");
		destinationftxt.sendKeys("Cordoba");
		departingclick.click();
		SelectDate();
		Utils.SeleniumUtils.esperarVisibilidadDelElemento(driver, searchbtn);
		searchbtn.click();
		return new PageResultTC(driver);
	}
	
	private void SelectDate() {
		WebElement next = driver.findElement(By.xpath("//*[@id=\"flight-departing-wrapper-flp\"]/div/div/button[2]"));
		Utils.SeleniumUtils.esperarVisibilidadDelElemento(driver, next);
		next.click();
		driver.findElement(By.xpath("//*[@id=\"flight-departing-wrapper-flp\"]/div/div/div[2]/table/tbody/tr[2]/td[1]/button")).click();
		returningclick.click();
		driver.findElement(By.xpath("//*[@id=\"flight-returning-wrapper-flp\"]/div/div/div[2]/table/tbody/tr[2]/td[7]")).click();
	}

}
