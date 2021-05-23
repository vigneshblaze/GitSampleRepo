package Expedia.cl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home\\New folder\\chromedriver.exe");
		String baseurl = "https://letskodeit.com";
		WebDriver driver = new ChromeDriver();
		
		
		driver.get(baseurl);
	}

}
