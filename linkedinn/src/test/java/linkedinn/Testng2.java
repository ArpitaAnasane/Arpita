package linkedinn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.Loginpage;
import Pages.LogoutPage;
import Pages.Mynetwork;




public class Testng2 {
	private WebDriver driver;
	private Loginpage loginpage;
	private Mynetwork mynetwork;
	//private SoftAssert soft ;
	private LogoutPage logOut;
	
	@Parameters("browser")
	@BeforeTest
	public void openBroswer(String browserName) {
		
		if(browserName.equals("Chrome")) 
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ACER\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		}
		
		if(browserName.equals("Firefox")) 
		{
		System.setProperty("webdriver.gecko.driver","E:\\New Folder selenium\\geckodriver.exe");
				
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		}

	}
	@BeforeClass
	public void createPOMObjects() 
	{
		loginpage = new Loginpage(driver);
		mynetwork = new Mynetwork(driver);
	     logOut= new LogoutPage(driver);
		//soft = new SoftAssert();
	}
	
	@BeforeMethod
	public void clickOnHomePage() throws InterruptedException {
		// System.out.println("Before Method");
		driver.get("https://in.linkedin.com/");
		loginpage.sendUserName();
		loginpage.sendpassword();
		loginpage.clickOnLoginButton();
		loginpage.clickOnMyNetwork();
	}
	
	
	@Test (priority=1)
	public void verifyclickOnGroups() throws InterruptedException {
		Thread.sleep(3000);
		mynetwork.clickOnGroups();
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
		//System.out.println(url);
		Assert.assertEquals(url, "https://www.linkedin.com/groups/");
		
	}
	          ///invocation 3 - 3 times same method will run
	@Test //(priority=0, invocationCount=-2)//invocation 0 method skip// -2 or any -ve tht method wont execute
	public void verifyclickOnEvents() throws InterruptedException {
		Thread.sleep(3000);
		mynetwork.clickOnEvents();
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
		//System.out.println(url);
		Assert.assertEquals(url, "https://www.linkedin.com/mynetwork/network-manager/events/");
		
	}
	

	@AfterMethod
	public void logOut() throws InterruptedException {
		//LogoutPage logOut= new LogoutPage(driver);
		logOut.logOutApp();
		Thread.sleep(3000);

	}
	@AfterClass
	public void Nullobj() {
	loginpage = null;
	mynetwork = null;
     logOut= null;
	}
	

	@AfterTest
	public void closeBrowser() {
		// System.out.println("After Class");
		driver.close();
		driver=null;
		System.gc();
	}
}
	
	
	
	
	
	
	
	
	


