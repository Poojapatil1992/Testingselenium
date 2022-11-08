package Crossbrowser;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.safari.SafariDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Parameters;

	public class BaseClass {

		static WebDriver driver;

		@BeforeClass
		@Parameters({"browser","url"})
		public void openBrowser(String BrowserName, String URL) {

			if (BrowserName.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (BrowserName.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver", "path");
				driver = new FirefoxDriver();
			} else if (BrowserName.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", "path");
				driver = new EdgeDriver();
			} else if (BrowserName.equalsIgnoreCase("safari")) {
				System.setProperty("webdriver.safari.driver", "path");
				driver = new SafariDriver();
			}

			driver.manage().window().maximize(); // browser maximize

			driver.get(URL);

		}

		@AfterClass
		public void closeBrowser() {
			driver.close();
		}

	
}
