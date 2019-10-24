package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.AbstractTest;
import pages.PageFlightTC;
import pages.PageHomeTC;
import pages.PageResultTC;


public class TravelocityTest extends AbstractTest {

	@Override
	protected String getBaseUrl() {
		return "https://www.travelocity.com";
	}
	
	@Test
	public void FindFligh() throws InterruptedException {
		PageHomeTC home = new PageHomeTC(getDriver());
		PageFlightTC Fligth=home.ClickLink();
		PageResultTC Res=Fligth.SearchFly();
		String result=Res.Title();
		System.out.println(result);
		assertEquals(result, "RES to COR Flights | Travelocity");
		
	}

}
