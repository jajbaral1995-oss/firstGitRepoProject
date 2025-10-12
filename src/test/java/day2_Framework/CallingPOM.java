package day2_Framework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CallingPOM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@Test
		public static void executeMethod() {
			
		}
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Login_ORHM lin= new Login_ORHM(driver);
		Logout_ORHM lout= new Logout_ORHM(driver);
		
		lin.url();
		lin.enterUserName();
		lin.enterPassword();
		lin.clickOnLoginBtn();
		lout.clickOnProfile();
		lout.clickOnLogout();

	}

}

////input[@name='nav-search-query']
/////input[@name='passcode1']
/////input[@name='saveOnlineId']
