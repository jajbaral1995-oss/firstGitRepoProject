import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DataProvider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   @Test
   public void searchMobile() {
	   WebDriver driver = new ChromeDriver();
	   driver.manage().windows().maximize();
	   driver.get("https://www.facebook.com/");
	   Thread.sleep(4000);
	   driver.findElement(By.name("q")).sendKeys("iphone 17");
	   driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	   
	   
   }
	}

}