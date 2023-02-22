package mobile;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class KhanAcademy extends Cabability {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver=Khan();
		Thread.sleep(10000);
		//driver.findElement(MobileBy.id("android.widget.Button")).click();
		//driver.findElement(By.xpath("//*[@text='Settings']")).click();
	//Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Sign in']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@text='Continue with Google']")).click();
		Thread.sleep(8000);
		driver.findElement(MobileBy.className("android.widget.LinearLayout")).click();
		
		Thread.sleep(8000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Join class\")")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"e.g. ABC123 or teacher@example.com\")")).sendKeys("yoyogeshrockzz.com");
		Thread.sleep(2000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"ADD\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"ADD\")")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='OK']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
			
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Explore\")")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Surprise me!\")")).click();
		Thread.sleep(1000);
		driver.findElement(MobileBy.AccessibilityId("Bookmark")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='GO TO BOOKMARKS']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Edit']")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.AccessibilityId("Select bookmark")).click();
		driver.findElement(By.xpath("//*[@text='Delete']")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Explore\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Explore\")")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Life skills']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@text='Internet safety']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(MobileBy.AccessibilityId("Explore tab")).click();
		Thread.sleep(1000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Computer programming\"))").click();
		
		
		
		
	}

}
