package demo;

import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



	public class Autocomplete {
		public static void main(String[] args) {
	   	 
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://formy-project.herokuapp.com/autocomplete");

	        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
	        autocomplete.sendKeys("Centralvägen 21,Solna");
	        //Implicit Wait
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        
	        //Explicit Wait
	        WebDriverWait wait = new WebDriverWait(driver, 10);
	        WebElement autocompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("form-control")));

	        WebElement autocompleteResult1 = driver.findElement(By.className("form-control"));
	        autocompleteResult1.click();

	        driver.quit();
	}

}
