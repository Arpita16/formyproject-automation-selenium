package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Formy_login {
		
			public static void main(String[] args) {
		   	 
		    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://formy-project.herokuapp.com/");
				driver.quit();
}
	
}
