package mobile;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileTesting {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<WebElement> driver;
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
		dc.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE,"C:\\Users\\LENOVO\\eclipse-workspace\\MobileTesting01\\chromedriver.exe");
		driver =new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("orangehrm demo");
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.partialLinkText("OrangeHRM Demo.")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();










		
	}

}
