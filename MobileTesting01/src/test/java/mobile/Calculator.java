package mobile;


import io.appium.java_client.MobileBy;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


import java.net.MalformedURLException;


import org.openqa.selenium.WebElement;

import org.testng.annotations.AfterTest;

public class Calculator extends Cabability {
	AndroidDriver<WebElement> driver;
  
  
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	  AndroidDriver<AndroidElement> driver=Cal();
	  driver.findElement(MobileBy.id("com.android.calculator2:id/digit_7")).click();
	  driver.findElement(MobileBy.id("com.android.calculator2:id/digit_6")).click();
	  driver.findElement(MobileBy.AccessibilityId("plus")).click();
	  driver.findElement(MobileBy.id("com.android.calculator2:id/digit_2")).click();
	  driver.findElement(MobileBy.id("com.android.calculator2:id/digit_0")).click();
	  driver.findElement(MobileBy.id("com.android.calculator2:id/digit_0")).click();
	  driver.findElement(MobileBy.id("com.android.calculator2:id/digit_1")).click();
	  driver.findElement(MobileBy.AccessibilityId("equals")).click();
	  driver.navigate().back();
      Thread.sleep(2000);
      
     /* driver.findElement(MobileBy.AccessibilityId("Phone")).click();
      Thread.sleep(2000);
      driver.findElement(MobileBy.xpath("//android.widget.ImageButton[@content-desc=\"key pad\"]")).click();
      Thread.sleep(2000);
      WebElement plus= driver.findElement(MobileBy.AccessibilityId("0,+"));
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
      Thread.sleep(2000);
      driver.findElement(MobileBy.AccessibilityId("End ")).click();
      */
  }

  @AfterTest
  public void afterTest() {
  }

}
