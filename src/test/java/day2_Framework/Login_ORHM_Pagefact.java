package day2_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_ORHM_Pagefact {
	WebDriver driver;
	
	public Login_ORHM_Pagefact(WebDriver driver) {
		driver=idriver;
		PageFactory.initElements(driver, this);
		
	}
	//Repositary
	@FindBy(name="username")WebElement userNM;
	@FindBy(name="password")WebElement pass;
	@FindBy(xpath="//button[@type='submit']")WebElement Login;
	
	public void url() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	public void enterUserName(String un) {
		userNM.sendKeys(un);
	}
	public void enterPassword(String pw) {
		pass.sendKeys(pw);
	}
	public void clickOnLoginBTN() {
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
