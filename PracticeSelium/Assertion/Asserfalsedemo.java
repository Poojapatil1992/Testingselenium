package Assertion;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.Test;

	public class Asserfalsedemo {
		

		@Test
		public void verifyRadioButton() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize(); // browser maximize
      // pooja
			driver.get("file:///C:/Selenium/OfflineWebsite/pages/examples/add_user.html");

			Thread.sleep(5000);
			
			WebElement maleRadioButton = driver.findElement(By.xpath("//input[@id='Male']"));
			
			Assert.assertFalse(maleRadioButton.isSelected()); 
			
			driver.close();
		}
	
}
