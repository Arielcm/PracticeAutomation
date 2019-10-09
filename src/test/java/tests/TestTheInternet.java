package tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AbstractTest;
import pages.PageHome;
import pages.PageLogin;
import pages.PageMultipleWindows;
import pages.PageNewWindows;

public class TestTheInternet extends AbstractTest {

	//Sobre escribe el metodo de la clase Abstracta con la URL del sitio
	@Override
	protected String getBaseUrl() {
		return "http://the-internet.herokuapp.com";
		
	}
	
	@Test(enabled = false)
	public void testMultipleWindows() {
		PageHome homePage = new PageHome(getDriver());
		PageMultipleWindows tiMultipleWindows = homePage.clickMultipleWindows();
		PageNewWindows tiNewWindowPage = tiMultipleWindows.clickLink();
		AssertJUnit.assertEquals(tiNewWindowPage.getTitle(), "New Window");
	}
	
	@Test
	public void logintest() {
		PageHome homePage = new PageHome(getDriver());
		PageLogin loginpage = homePage.clickLogin();
		String url=loginpage.login();
		AssertJUnit.assertEquals("http://the-internet.herokuapp.com/secure", url);
	}

}
