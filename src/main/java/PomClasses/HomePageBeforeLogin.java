package PomClasses;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageBeforeLogin {
	private SearchContext driver;

	public HomePageBeforeLogin(WebDriver diver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@data-test-id='login-button']")
    private WebElement loginButton;
	
	@FindBy(xpath="//button[@data-test-id='account-butto`n']")
	private WebElement accountButton;
	
	
	@FindBy(xpath="//div[text()='Login with Email and Password']")
    private WebElement loginWithEmail;
	
	@FindBy(xpath="//a[text()='Home']")
    private WebElement HomePagePumaLink1;
	
	@FindBy(id="email")
	private WebElement emailTextField;
	
	@FindBy(id="password")
	private WebElement passwordTextField;
	
	@FindBy(id="Login-submit")
	private WebElement loginsubmitbutton;
	
	@FindBy(xpath="//a[@data-test-id='main-nav-home-link']")
	private WebElement HomePagePumaLink;
	
	public WebElement getloginsubmitbutton() {
		return loginsubmitbutton;
	} 
	
	public WebElement getemailTextField() {
		return emailTextField;
	} 
	
	public WebElement getPasswordTextField() {
		return passwordTextField;
		
	}
		
	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}

	public WebElement getAccountButElement() {
		return accountButton;
		
	}

	public WebElement getloginWithEmail1() {
		// TODO Auto-generated method stub
		return loginWithEmail;
	}

	public WebElement getloginWithEmail() {
		// TODO Auto-generated method stub
		return loginWithEmail;
	}

	public WebElement getHomePagePumaLink() {
		// TODO Auto-generated method stub
		return HomePagePumaLink1;
	}
	
    
}
