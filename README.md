# formyproject-automation-selenium

formyproject-automation-selenium is a Java-based automation project built with Selenium WebDriver for automating web application-Formy(http://formy-project.herokuapp.com/).This project leverages Sauce Labs to perform automated cross-browser and mobile testing on real devices and emulators. By using Sauce Labs, this project ensures that web applications are tested on various environments, providing thorough test coverage and enhanced reliability.


## Key Features
- Test cases for login, navigation, form submission,data validation and all UI functionalities
- Page Object Model (POM) structure for easy maintenance and scalability
- Cross-Browser Testing: Run tests on different browsers and versions.
- Parallel Testing: Run multiple tests simultaneously to save time.
- Cloud-Based Infrastructure: No need for local browser setup; use Sauce Labs’ cloud infrastructure.


## Prerequisites
- Java Development Kit (JDK) 11 or higher
- WebDriver for the browser under test (e.g., ChromeDriver, GeckoDriver)
- Sauce Labs Account: Sign up at [Sauce Labs](https://saucelabs.com/) if you don’t have an account.
- Sauce Labs Credentials: Obtain your `SAUCE_USERNAME` and `SAUCE_ACCESS_KEY` from your Sauce Labs account.
- Testing Framework: This project uses Selenium, but you can also integrate Sauce Labs with Cypress, Appium, etc.


## Installation

### Clone the Repository
1. Clone the repository:
    git clone https://github.com/username/formy-automation-selenium.git

2. Set Up Sauce Labs Credentials
    Export Sauce Labs credentials as environment variables:

         export SAUCE_USERNAME=your-username
         export SAUCE_ACCESS_KEY=your-access-key

 3. Configure Sauce Labs
     Specify Sauce Labs configurations in your Selenium setup.

DesiredCapabilities caps = new DesiredCapabilities();

caps.setCapability("platformName", "Windows 10");

caps.setCapability("browserName", "chrome");

caps.setCapability("browserVersion", "latest");

caps.setCapability("sauce:options", sauceOptions);

**Running Tests on Sauce Labs**

Run Locally: npm run test:local

Run on Sauce Labs: npm run test:saucelabs

## Viewing Results in Sauce Labs

- After tests run on Sauce Labs, we can view detailed test results, including screenshots and logs, in [Sauce Labs Dashboard](https://app.saucelabs.com/dashboard).
- Navigate to the dashboard and find test run under **Test Results**.
- Each test result includes session logs, video recordings, and detailed steps for debugging.


**Test Configuration Options**

platformName: OS (e.g., Windows 10)

browserName: Browser (e.g., chrome)

browserVersion: Browser version (e.g, latest)











