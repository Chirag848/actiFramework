package acti.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class DriverScript {

	public static WebDriver driver;
	public static Properties prop;

	public DriverScript() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("./acti.configuration/config.properties");
			prop.load(fis);
		}

		catch (Exception e) {
			System.out.println("file not found " + e.getMessage());
		}

	}

	
	public static void initBrowser() {
		String browser = prop.getProperty("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./acti.browser/chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "./acti.browser/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		else {
			System.out.println("browser not found. check the properties");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String url = prop.getProperty("qaurl");
		driver.get(url);

	}

}
