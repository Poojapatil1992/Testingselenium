package Crossbrowser;

	import org.openqa.selenium.By;

	import org.openqa.selenium.WebElement;
	import org.testng.annotations.Test;

	public class Testclass  extends BaseClass{


		@Test(priority = 1)
		public void verifyLogin() throws InterruptedException {
			
			WebElement email = driver.findElement(By.cssSelector("input.form-control[placeholder='Email']"));
			
			email.sendKeys("kiran@gmail.com");
			
			WebElement password = driver.findElement(By.cssSelector("#password"));
			
			password.sendKeys("123456");
			
			WebElement SignInButton = driver.findElement(By.cssSelector("button[type='submit']"));
			
			SignInButton.click();
			
		}
	
}
