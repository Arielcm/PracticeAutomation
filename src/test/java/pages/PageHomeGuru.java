package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utils.SeleniumUtils;

public class PageHomeGuru extends AbstractPage {

	@FindBy(name = "dk4")
	private WebElement linkinframe;
	@FindBy(id="_mN_main_224278574_0_n")
	private WebElement iframe;
	
	public PageHomeGuru(WebDriver driver) {
		super(driver);

	}
	
	public newWindowsGuru clickIframe() {
		boolean visible=SeleniumUtils.esperarVisibilidadDelElemento(driver, iframe);
		if(visible){
			System.out.println("Entro Aca");
			driver.switchTo().frame("_mN_main_224278574_0_n");
			linkinframe.click();
			return new newWindowsGuru(driver);
		}else {
			System.out.println("Elemento no encontrado");
			return null;
		}
		
		
		
	}

}
