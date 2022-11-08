package Dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class logintestscript {
		
		@Test(dataProviderClass = Dataprovider.Testscriptdata.class, dataProvider = "logintestdata")
		public void verifyLogin(String uname, String pass) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize(); // browser maximize

			driver.get("file:///C:/Selenium/OfflineWebsite/index.html");

			Thread.sleep(5000);
			
			WebElement email = driver.findElement(By.cssSelector("input.form-control[placeholder='Email']"));
			
			email.sendKeys(uname);
			
			WebElement password = driver.findElement(By.cssSelector("#password"));
			
			password.sendKeys(pass);
			
			WebElement SignInButton = driver.findElement(By.cssSelector("button[type='submit']"));
			
			SignInButton.click();
			
			driver.close();
		}

	
}
