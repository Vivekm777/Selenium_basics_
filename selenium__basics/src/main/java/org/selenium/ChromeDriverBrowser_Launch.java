package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverBrowser_Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		String windowHandle=driver.getWindowHandle();
		System.out.println(windowHandle);
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
		driver.close();
	}

}
