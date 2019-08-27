import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class T2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public void m1() {
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://bing.com");
		System.out.println(driver.getTitle()); 
	}
}
