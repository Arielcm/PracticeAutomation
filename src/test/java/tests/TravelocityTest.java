package tests;

import org.testng.annotations.Test;

import pages.AbstractTest;
import pages.PageHomeTC;


public class TravelocityTest extends AbstractTest {

	@Override
	protected String getBaseUrl() {
		return "https://www.travelocity.com";
	}
	
	@Test
	public void FindFligh() {
		PageHomeTC home = new PageHomeTC(getDriver());
		home.ClickLink();
	}

}
