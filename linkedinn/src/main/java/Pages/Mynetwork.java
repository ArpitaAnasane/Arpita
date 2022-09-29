package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mynetwork {
	
	
	@FindBy (xpath= "//div[text()='Connections']")
	private WebElement connetions;
	
	@FindBy (xpath= "//div[text()='Contacts']")
	private WebElement contacts;
	

	@FindBy (xpath= "//div[text()='People I Follow']")
	private WebElement follow;

	@FindBy (xpath= "//div[text()='Groups']")
	private WebElement groups;

	@FindBy (xpath= "//div[text()='Events']")
	private WebElement events ;

	@FindBy (xpath= "//div[text()='Pages']")
	private WebElement pages;

	@FindBy (xpath= "//div[text()='Newsletter']")
	private WebElement newsLetter;

	@FindBy (xpath= "//div[text()='Hashtags']")   
	private WebElement hashTags;
	
	@FindBy (xpath= "//span[text()='Show less']")   
	private WebElement showLess;
	   
	
	public Mynetwork(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnConnections() {
		connetions.click();
	}
	
	
	public void clickOnContacts() {
		contacts.click();
	}
	
	
		
	public void clickOnFollow() {
		 follow.click();

	}
		
	public void clickOnGroups() {
		groups.click();

	}
	public void clickOnEvents() {
		events.click();

	}
	public void clickOnpages() {
		pages.click();

	}
	
	public void clickOnNewsLetter() {
		newsLetter.click();

	}
	
	public void clickOnHashtags() {
		newsLetter.click();

	}
	
	public void clickOnShowLess() {
		showLess.click();



	}
	
	
	
	
		
		
		
	}
	
	
	
	

