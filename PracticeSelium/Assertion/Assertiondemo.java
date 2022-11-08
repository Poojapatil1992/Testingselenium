package Assertion;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.Test;

	public class Assertiondemo {
		
		@Test
		public void verifyLogin() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize(); // browser maximize

			driver.get("file:///C:/Selenium/OfflineWebsite/index.html");

			Thread.sleep(5000);
			
			WebElement email = driver.findElement(By.cssSelector("input.form-control[placeholder='Email']"));
			
			email.sendKeys("kiran@gmail.com");
			
			WebElement password = driver.findElement(By.cssSelector("#password"));
			
			password.sendKeys("123456");
			
			WebElement SignInButton = driver.findElement(By.cssSelector("button[type='submit']"));
			
			SignInButton.click();
			
			Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Dashboard']")).isDisplayed());
			
			System.out.println("Testcomplete");
			
			driver.close();
		}

	
}
