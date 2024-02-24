package exceptionDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertDemo {

	@Test
	public void softAsset() {
		
		SoftAssert SA=new SoftAssert();
		SA.assertEquals(0, 0);
		SA.assertEquals(0, 9);
		
		System.out.println("before loging exception");
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("de")).click();
		driver.findElement(By.id("username")).sendKeys("demoUser");
		
		System.out.println("after log");
		SA.assertAll();
	}

}
