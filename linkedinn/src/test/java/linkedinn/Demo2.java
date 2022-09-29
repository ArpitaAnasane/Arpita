package linkedinn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Loginpage;

public class Demo2 {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.linkedin.com/checkpoint/lg/sign-in-another-account");
	    new Loginpage(driver);
}

}
