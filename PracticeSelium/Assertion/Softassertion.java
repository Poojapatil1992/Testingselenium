package Assertion;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.Test;
	import org.testng.asserts.SoftAssert;
	public class Softassertion {
		

		@Test
		public void verifyLogin() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize(); // browser maximize

			driver.get("file:///C:/Selenium/OfflineWebsite/index.html");
			
			SoftAssert obj = new SoftAssert();

			Thread.sleep(5000);
			
			WebElement email = driver.findElement(By.cssSelector("input.form-control[placeholder='Email']"));
			
			email.sendKeys("kiran@gmail.com");
			
			WebElement password = driver.findElement(By.cssSelector("#password"));
			
			password.sendKeys("123456");
			
			WebElement SignInButton = driver.findElement(By.cssSelector("button[type='submit']"));
			
			SignInButton.click();
			// soft assertion
			obj.assertEquals(driver.getCurrentUrl(), "file:///C:/Selenium/OfflineWebsiteForSeleniu/OfflineWebsite/pages/examples/dashboard.html");
			
			System.out.println("Testcomplete");
			
			driver.close();
			
			obj.assertAll();
		}

	
}
