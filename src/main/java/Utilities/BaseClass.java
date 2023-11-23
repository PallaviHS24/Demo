package Utilities;

import java.time.Duration;


//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import PomClasses.HomePage;
import PomClasses.HomePageBeforeLogin;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	@BeforeClass	
	public void launchingBrowser() {	
	System.out.println("---------------launching Browser-------");
    // which one  browser you using
	String browser= "chrome";
	if(browser.equals("chrome")) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver(option);
		}
	
	else if(browser.equals("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver =new FirefoxDriver();
		}
	

	else if(browser.equals("edge")) {
		WebDriverManager.edgedriver().setup();
		driver =new EdgeDriver();
	}
	else  {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://in.puma.com/in/en");
	
	}
	
	@BeforeMethod
	public void loginToApplication()
	{
		System.out.println("---------------login To Application-------");
		HomePageBeforeLogin HPBI = new HomePageBeforeLogin(driver);
		HPBI.getAccountButElement().click();
		HPBI.getLoginButton().click();
		HPBI.getloginWithEmail().click();
		HPBI.getemailTextField().sendKeys("1hk19is071@hkbk.edu.in");
		HPBI.getPasswordTextField().sendKeys("Pallavihs@123");
		HPBI.getloginsubmitbutton().click();
		HPBI.getHomePagePumaLink().click();
		
		
	 	
	}
	@AfterMethod
	public void LogoutFromApplication() throws Throwable
	{
//		System.out.println(" Log out From Application "); 
//		HomePage HP = new HomePage(driver);
//		HP.getMenuIcon().click();
//		HP.getLogOutButton().click();
//		
		 
    }

	@AfterClass
	public void TestServerStop()
	{
		System.out.println("stop");
//		Driver.quit();	
	}
	
}