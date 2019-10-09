package tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.AbstractTest;
import pages.PageHomeNewtours;
import pages.PageRegisterNewTour;
import pages.PageSignNewTour;

public class TestNewTours extends AbstractTest {

	@Override
	protected String getBaseUrl() {
		
		return "http://www.newtours.demoaut.com/";
	}
	
	@Test
	public void Registro() {
		PageHomeNewtours home = new PageHomeNewtours(getDriver());
		PageRegisterNewTour registerpage= home.ClickLink();
		String url=registerpage.RegisterPage();
		AssertJUnit.assertEquals("http://newtours.demoaut.com/create_account_success.php", url);
	}

	@Test(dependsOnMethods = "Registro")
	public void Ingreso() {
		PageHomeNewtours home = new PageHomeNewtours(getDriver());
		PageSignNewTour sigin = home.Signin();
		String url= sigin.signin();
		AssertJUnit.assertEquals("http://newtours.demoaut.com/mercuryreservation.php", url);
	}
}
