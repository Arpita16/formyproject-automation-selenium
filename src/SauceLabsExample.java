

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.remote.RemoteWebDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import java.net.URL;
	import java.util.Map;
	import java.util.HashMap;

	public class SauceLabsExample {

	    //public static final String USERNAME = "oauth-arpita-7b4ee";
	    //public static final String ACCESS_KEY = "80eb1ade-a071-48d7-b277-65b08041dcf1";
	    //public static final String URL = "https://oauth-arpita-7b4ee:80eb1ade-a071-48d7-b277-65b08041dcf1@ondemand.eu-central-1.saucelabs.com:443/wd/hub";

	    public static void main(String[] args) throws Exception {

	        //DesiredCapabilities caps = DesiredCapabilities.chrome();
	        //caps.setCapability("platform", "windows");
	        //caps.setCapability("version", "10");
	        
	        ChromeOptions browserOptions = new ChromeOptions();
	        browserOptions.setCapability("Platform","Windows");
	        browserOptions.setCapability("Version","10");
	        
	        
	        Map<String, Object> sauceOptions = new HashMap<>();
	        sauceOptions.put("username", "oauth-arpita-7b4ee");
	        sauceOptions.put("accessKey", "80eb1ade-a071-48d7-b277-65b08041dcf1");
	        sauceOptions.put("build", "selenium-build-1I5X3");
	        sauceOptions.put("name", "formy-automation-project");
	        browserOptions.setCapability("sauce:options", sauceOptions);
	        
	       URL url = new URL("https://oauth-arpita-7b4ee:80eb1ade-a071-48d7-b277-65b08041dcf1@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
	       RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);
	        
	        

	        driver.get("http://formy-project.herokuapp.com/");
	    }
	
	}


