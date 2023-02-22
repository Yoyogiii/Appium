package mobile;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ButtonReleaseAction;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class Dial extends Cabability {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		AndroidDriver<AndroidElement> driver=Phone();
		//driver.findElement(MobileBy.AccessibilityId("Phone")).click();
	
	      Thread.sleep(2000);
	      driver.findElement(MobileBy.xpath("//android.widget.ImageButton[@content-desc=\"key pad\"]")).click();
	      File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(scrFile, new File("screenshot.jpg"));

	      
	    

	      
	    /*  WebElement plus= driver.findElement(MobileBy.AccessibilityId("0,+"));
	      TouchAction act=new TouchAction(driver);
	      act.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(plus)).withDuration(Duration.ofSeconds(1))).release().perform();
	      Thread.sleep(2000);
	      driver.findElement(MobileBy.AccessibilityId("9,WXYZ")).click();
	      driver.findElement(MobileBy.AccessibilityId("3,DEF")).click();
	      driver.findElement(MobileBy.AccessibilityId("6,MNO")).click();
	      driver.findElement(MobileBy.AccessibilityId("0,+")).click();
	      driver.findElement(MobileBy.AccessibilityId("9,WXYZ")).click();
	      driver.findElement(MobileBy.AccessibilityId("4,GHI")).click();
	      driver.findElement(MobileBy.AccessibilityId("9,WXYZ")).click();
	      driver.findElement(MobileBy.AccessibilityId("0,+")).click();
	      driver.findElement(MobileBy.AccessibilityId("8,TUV")).click();
	      driver.findElement(MobileBy.AccessibilityId("1,")).click();
	      driver.findElement(MobileBy.AccessibilityId("dial")).click();
	      Thread.sleep(5000);
	      driver.findElement(MobileBy.AccessibilityId("End")).click();*/
	      
	  

	    		 
	}

}
