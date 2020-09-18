package TestDemo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestJUnitd {

	@Test
	public void test() {
		
		String baseurl = "https://letskodeit.com";
		
		System.setProperty("webdriver.chrome.driver", "E:\\Vignesh\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(baseurl);
		driver.close();
		driver.quit();
	}

}
