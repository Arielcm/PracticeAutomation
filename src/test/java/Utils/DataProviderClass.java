package Utils;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

	@DataProvider(name="Personas")
	public static Object[][] Personas()
    {
		return new Object[][] 
				{ new Object[] { "prpr1@prueba1.com","Nose", "Jose", "NoseJose","Calle Falsa 123", "Sprindfield", "12345", "123456789" }, 
		          new Object[] { "prpr2@prueba2.com","DosNose", "DosJose", "DosNoseJose","Dos Calle Falsa 123", "Sprindfield", "56789", "123456789" },
				  new Object[] { "prpr3@prueba3.com","TresNose", "TresJose", "TresNoseJose","Tres Calle Falsa 123", "Sprindfield", "01234", "123456789" },
			};
    }
}
