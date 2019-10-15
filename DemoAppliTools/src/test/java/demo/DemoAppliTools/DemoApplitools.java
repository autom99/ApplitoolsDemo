package demo.DemoAppliTools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.*;
//import com.applitools.eyes.selenium.ClassicRunner;
import com.applitools.eyes.selenium.Eyes;

public class DemoApplitools {

	public static void main(String[] args) throws InterruptedException 
	{
		// Open a Chrome browser.
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Purpose\\Helper Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		Eyes eyes = new Eyes();
		//eyes.setApiKey("x98ITG6Y8EjdSjxIhxVfo4cCuwJYgt6YgUNh0ghCsl1g110");
		eyes.setApiKey("Vr0fQRgPAtNig2ASpUYkzcP8Fs3zbStI4aYG4p1Vq78110");
	
		try{
			/*
			// Start the test and set the browser's viewport size to 800x600.
			eyes.open(driver, "Hello World!", "My first Selenium Java test!",
					new RectangleSize(800, 600));
			
			// Navigate the browser to the "hello world!" web-site.
			driver.get("https://applitools.com/helloworld?diff2");
			
			// Visual checkpoint #1.
			eyes.checkWindow("Hello!");
			
			// Click the "Click me!" button.
			driver.findElement(By.tagName("button")).click();
			
			// Visual checkpoint #2.
			eyes.checkWindow("Click!");

			// End the test.
			eyes.close();			
			Thread.sleep(2000);
			*/
			/*----------begin of--------- Demo Automation Testing -----------------------------*/
			
			eyes.open(driver,"Demo Automation Testing","Demo Automation Testing- Index Page",new RectangleSize(800, 600));
			driver.get("http://demo.automationtesting.in/Index.html");
			driver.findElement(By.id("email")).sendKeys("test@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.id("enterimg")).click();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
			driver.findElement(By.id("btn2")).click();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
			driver.findElement(By.id("btn1")).click();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
			eyes.close();
			Thread.sleep(2000);
			
			/*----------end of --------- Demo Automation Testing -----------------------------*/
			
			/*----------begin of--------- Demo Automation Testing - SIGNIN-----------------------------*/
			
			eyes.open(driver,"Demo Automation Testing","Demo Automation Testing- Signin Page",new RectangleSize(800, 600));
			Thread.sleep(1000);
			driver.get("http://demo.automationtesting.in/SignIn.html");
			Thread.sleep(1000);
			driver.findElement(By.name("eMail_textbox")).sendKeys("test@gmail.com");
			//driver.findElement(By.xpath("//input[@type='text'][@placeholder='E mail']")).sendKeys("test@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.name("password_password_textbox")).sendKeys("test@123");
			//driver.findElement(By.xpath("//input[@type='password'][@placeholder='Password']")).sendKeys("test@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@id='enterbtn']")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(1000);
			eyes.close();
			
			/*----------end of --------- Demo Automation Testing -----------------------------*/			
			
		} finally {

			// Close the browser.
			driver.quit();

			// If the test was aborted before eyes.close was called, ends the test as aborted.
			eyes.abortIfNotClosed();
		}
	}

}
