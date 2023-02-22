package mobile;
import java.io.File;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;

import com.mongodb.MapReduceCommand.OutputType;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class Hybrid extends Cabability {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver=GeneralStore();
		Thread.sleep(5000);
		driver.findElement(MobileBy.id("android:id/text1")).click();
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Australia\"))").click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("Yogiii");
		driver.findElement(By.xpath("//*[@text='Female']")).click();
		driver.findElement(By.xpath("//*[@text='Male']")).click();
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		Thread.sleep(2000);
		
		/*driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Converse All Star\"))");
		int Count =driver.findElements(MobileBy.id("com.androidsample.generalstore:id/productName")).size();
		System.out.println(Count);
		for(int i=0;i<Count;i++)
		{
			String Name=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
			System.out.println(Name);
			Thread.sleep(3000);
			if(Name.equalsIgnoreCase("Converse All Star"))
			{
				driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
			}
			
		}
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"))");
		int Count1 =driver.findElements(MobileBy.id("com.androidsample.generalstore:id/productName")).size();
		System.out.println(Count);
		for(int i=0;i<Count1;i++)
		{
			String Name=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
			System.out.println(Name);
			Thread.sleep(3000);
			if(Name.equalsIgnoreCase("Jordan 6 Rings"))
			{
				driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
				
			}
			
		}
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(1000);
		 String price1 = driver.findElements(MobileBy.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();
		 System.out.println("price-1: " + price1);
		 price1 = price1.substring(1);
		 Double dprice1 = Double.parseDouble(price1);
		 System.out.println(dprice1);
		 String price2 = driver.findElements(MobileBy.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();
		 System.out.println("price-2: " + price2);
		 price2 = price2.substring(1);
		 Double dprice2 = Double.parseDouble(price2);
		 System.out.println(dprice2);
		 String TotalPrice = driver.findElement(MobileBy.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
		 System.out.println("Total Price: " + TotalPrice);
		 TotalPrice = TotalPrice.substring(2);
		 Double dtotal = Double.parseDouble(TotalPrice);
		 System.out.println("dtotal:" + dtotal);
		 Double AddedTotal = dprice1 + dprice2;
		 System.out.println("AddTotal:" + AddedTotal);
		 //Assert.assertEquals(dtotal, AddedTotal);
		 if (dtotal.equals(AddedTotal)) {
		 System.out.println("Assertion Pass");
		 } else {
		 System.out.println("Assertion Fail");
		 }
		 */
	
	}

}
