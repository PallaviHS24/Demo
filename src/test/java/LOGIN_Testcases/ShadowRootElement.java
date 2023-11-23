package LOGIN_Testcases;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowRootElement {
   public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	Thread.sleep(3000);
	
//	driver.get("https://demowebshop.tricentis.com/");
//	JavascriptExecutor jse= (JavascriptExecutor) driver;
//	
//	Object obj = jse.executeScript("return document.querySelector(\"body > downloads-manager\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\"))");
//	WebElement element=(WebElement) obj;
//	element.sendKeys("from root");
	
	driver.get("https://demoapps.qspiders.com/shadow?sublist=1");
	JavascriptExecutor js= (JavascriptExecutor) driver;
	
	Object ob=js.executeScript("return document.querySelector(\"#root > div > div:nth-child(2) > div > section:nth-child(2) > main > section > article > aside > div > aside > div > aside > section.pt-3.p-4.basis-\\\\[60\\\\%\\\\].bg-white.h-fit > form > div:nth-child(1)\").shadowRoot.querySelector(\"input[type=text]\")");
	WebElement element=(WebElement) ob;
	element.sendKeys("1hk19is071@hkbk.edu.in");
	
	
	
	
	
	driver.get("https://demoapps.qspiders.com/shadow?sublist=1");
	JavascriptExecutor js1= (JavascriptExecutor) driver;
	
	//Object ob1=js1.executeScript("returndocument.querySelector(\"#root > div > div:nth-child(2) > div > section:nth-child(2) > main > section > article > aside > div > aside > div > aside > section.pt-3.p-4.basis-\\[60\\%\\].bg-white.h-fit > form > div:nth-child(2)").shadowRoot.querySelector("input[type=text]");
	//WebElement element=(WebElement) ob;
	
	
	
	                              
	element.sendKeys("Pallavihs@2404");
	
	
   }  

}
