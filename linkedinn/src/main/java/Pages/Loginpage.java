package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy (xpath= "//input[@type='text']")
	private WebElement userName;
	
	@FindBy (xpath= "//input[@type='password']")
	private WebElement password;
	
	@FindBy (xpath= "//button[@type='submit']")
	private WebElement loginButton;
	 
	@FindBy (xpath= "//span[text()='Home']")
	private WebElement homeButton;
	
	@FindBy (xpath= "//span[text()='My Network']")
	private WebElement myNetwork;
	
	
	
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	    
	
	public void sendUserName() {
		userName.sendKeys("arpitaanasane2@gmail.com");
	}
	public void sendpassword() {
		password .sendKeys("arpitalinked@321");
	}
		
	public void clickOnLoginButton() {
	    loginButton.click();
		}
	
	public void clickOnHomeButton() {
		homeButton.click();
	}
	 
	public void clickOnMyNetwork() {
		myNetwork.click();
	}
	
	

}
