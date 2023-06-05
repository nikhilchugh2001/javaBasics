package org.universal.javaprogramming.oldJavaCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class ScopeWorkerUI {
	
	public static void main(String[] args) throws InterruptedException {
		
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		  
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "internet explorer");
		capabilities.setCapability(InternetExplorerDriver.
		  INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);

		
	System.setProperty("webdriver.ie.driver","C:\\Users\\Nikhil\\Downloads\\IEDriverServer_Win32_3.141.0\\IEDriverServer.exe");
	
	//comment the above 2 lines and uncomment below 2 lines to use Chrome
	//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	
	//it is used to initialize the IE driver
	 WebDriver driver = new InternetExplorerDriver(capabilities);
	  
	 driver.manage().window().maximize();

	 driver.get("http://gmail.com");
	  
	 driver.quit();
	
}
	
}

