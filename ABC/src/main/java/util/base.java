package util;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import Com.Utility.configDataProvider;

public class base {
public static WebDriver driver;


	@BeforeClass
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//admin//Desktop//Hybrid_FM//ABC//Driver//chromedriver.exe");
		
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		
	//	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.get("https://trade.angelone.in");
		System.out.println("Enter BeforeClass");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Thread.sleep(5000);
		System.out.println("Enter BeforeClass");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}


	@AfterClass
	public void close() {
}
}