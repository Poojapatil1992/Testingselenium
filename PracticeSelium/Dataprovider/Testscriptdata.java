package Dataprovider;

import org.testng.annotations.DataProvider;

public class Testscriptdata {
		@DataProvider(name="logintestdata")
		public static Object[][] logindata(){
			Object[][] x = {{"kiran@gmail.com","123456"},{"kiran@gmail.com","123"},{"kiran","123456"},{"",""}};
			return x;
		}
		
		@DataProvider(name="addduserdata")
		public static Object[][] adduserdata(){
			Object[][] x = {{"kiran@gmail.com","123456","test@test.com","M","9988776655"}};
			return x;
		}

	
}
