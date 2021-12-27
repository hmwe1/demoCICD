package com.demoautocicd.demoCICD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {
	public static WebDriver webdriver;
	
	@BeforeMethod
  public void launchDriver() {
	  System.setProperty("webdriver.chrome.driver","D:\\Demo-Eclipse\\demoCICD\\drivers\\chromedriver.exe");
      ChromeOptions options = new ChromeOptions();
      options.addArguments("--disable-notification");
      webdriver= new ChromeDriver(options);
      webdriver.manage().window().maximize();
  }
  @Test
  public void Test1() {
	  webdriver.navigate().to("https://ebguat.2c2p.com/mm");
	  System.out.println("Test 1 title is " +webdriver.getTitle());
  }
  @Test
  public void Test2() {
	  webdriver.navigate().to("https://ebguat.2c2p.com/mm");
	  System.out.println("Test 2 title is " +webdriver.getTitle());
  }
  @Test
  public void Test3() {
	  webdriver.navigate().to("https://ebguat.2c2p.com/mm");
	  System.out.println("Test 3 title is " +webdriver.getTitle());
  }
  @AfterMethod
  public void quit() {
     webdriver.quit();
  }
  
}
