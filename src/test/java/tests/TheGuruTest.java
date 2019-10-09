package tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AbstractTest;
import pages.PageHomeGuru;
import pages.newWindowsGuru;

public class TheGuruTest extends AbstractTest {

	@Override
	protected String getBaseUrl() {
		return "http://demo.guru99.com/test/guru99home/";
	}

	@Test
	public void GuruTestPage() {
		PageHomeGuru homepage=new PageHomeGuru(getDriver());
		newWindowsGuru newwin= homepage.clickIframe();
		AssertJUnit.assertEquals(newwin.getVisible(), true);
	}
}
