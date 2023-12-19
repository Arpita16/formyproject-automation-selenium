package demo.Form;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.junit.Assert;



		public class ConfirmationPage 
		{
		   
		    

		    public static void waitForAlertBanner(WebDriver driver)
		    {
		        WebDriverWait wait = new WebDriverWait(driver, 10);
		        wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));
		    }

		    public static String getAlertBannerText(WebDriver driver)
		    {
		        return driver.findElement(By.className("alert")).getText();
		    }
		
		
		
	}
		
	


