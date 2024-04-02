package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser_launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		String title=driver.getTitle();
		System.out.println(title);
		String windowHandle=driver.getWindowHandle();
		System.out.println(windowHandle);
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
		driver.close();

	}

}
