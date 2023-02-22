package mobile;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Clock extends Cabability {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		AndroidDriver<AndroidElement> driver=Alarm();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='ALARM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='9:00 AM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='00']")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.AccessibilityId("30")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='PM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='OK']")).click();
	}

}

