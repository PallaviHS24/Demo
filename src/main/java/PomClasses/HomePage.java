package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	private static final WebElement MenMenuLink = null;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//button[@data-test-id='account-button'])//*[name()='svg']")
	private WebElement MenuIcon;
	
	@FindBy(id="logout")
	private WebElement LogOutButton;
	
	@FindBy(xpath="//span[text()='Men']")
	private WebElement MenButton;
	
	@FindBy(xpath="(//a[@data-link-name='Men']")
	private WebElement ShoesLink;
	
	@FindBy(xpath="(//a[text()='Sneakers']")
	private WebElement RunningLink;
	
	public WebElement getMenuIcon() {
		return MenuIcon;
	}
	
	public WebElement getLogOutButton() {
		return LogOutButton;
		
	}

//	public WebElement getMenMenuLink1() {
//		// TODO Auto-generated method stub
//		return MenMenuLink1();
//	}

	public WebElement getshoesLink1() {
		// TODO Auto-generated method stub
		return ShoesLink;
	}

	public WebElement getRunningLink() {
		// TODO Auto-generated method stub
		return RunningLink;
	}

	public WebElement getshoesLink(String string) {
		// TODO Auto-generated method stub
		return ShoesLink;
	}

	public WebElement getMenMenuLink() {
		// TODO Auto-generated method stub
		return MenMenuLink;
	}

}
