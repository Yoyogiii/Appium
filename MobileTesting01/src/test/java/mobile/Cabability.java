package mobile;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Cabability {
	
	
	public static AndroidDriver<AndroidElement> GeneralStore() throws MalformedURLException {
		
		 DesiredCapabilities dc=new DesiredCapabilities();
		 dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
		 dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		 dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
		 dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.androidsample.generalstore");
		 dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.androidsample.generalstore.SplashActivity");
		 AndroidDriver<AndroidElement> driver =new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		 return driver;
	}
	
	public static AndroidDriver<AndroidElement> Cal() throws MalformedURLException {
		
		 DesiredCapabilities dc=new DesiredCapabilities();
		 dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
		 dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		 dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
		 dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.android.calculator2");
		 dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");
		 AndroidDriver<AndroidElement> driver =new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		 return driver;
	}
	public static AndroidDriver<AndroidElement> Khan() throws MalformedURLException {
		
		 DesiredCapabilities dc=new DesiredCapabilities();
		 dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
		 dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		 dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
		 dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"org.khanacademy.android");
		 dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "org.khanacademy.android.ui.library.MainActivity");
		 AndroidDriver<AndroidElement> driver =new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		 return driver;
		

	}
	
	public static AndroidDriver<AndroidElement> Phone() throws MalformedURLException {
	
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	 dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
	 dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.google.android.dialer");
	 dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.apps.dialer.extensions.GoogleDialtactsActivity");
	 AndroidDriver<AndroidElement> driver  =new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
	 return driver;
	 
	}
	public static AndroidDriver<AndroidElement> Ride() throws MalformedURLException {
		
		 DesiredCapabilities dc=new DesiredCapabilities();
		 dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
		 dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		 dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
		 dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.forbinary.banjararide");
		 dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.forbinary.banjararide.activity.SplashActivity");
		 AndroidDriver<AndroidElement> driver =new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		 return driver;
		
		
	}
	public static AndroidDriver<AndroidElement> Alarm() throws MalformedURLException {
		
		 DesiredCapabilities dc=new DesiredCapabilities();
		 dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
		 dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		 dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
		 dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.google.android.deskclock");
		 dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.deskclock.DeskClock");
		 AndroidDriver<AndroidElement> driver =new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		 return driver;
		
		
	}
}