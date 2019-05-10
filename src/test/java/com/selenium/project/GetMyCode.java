package com.selenium.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetMyCode {
	@Test
	public void test_01() {
		//launching the browser
		System.setProperty("webdriver.chrome.driver", "F:\\downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
	}
}
