package com.MavenTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class Test {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "Galaxy A20s");
		cap.setCapability("appPackage", "com.dylvian.mango.activities");
		cap.setCapability("appActivity", "com.mango.activities.splash.presentation.ActivitySplash");
		cap.setCapability("fullReset", "false");
		cap.setCapability("noReset", "true");
		cap.setCapability("autoGrantPermissions", "true");
		AndroidDriver<MobileElement>  driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("com.dylvian.mango.activities:id/searchEditText")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Clothing']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Shirts']")).click();
		driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id='com.dylvian.mango.activities:id/constraintlayout_item_gallery_clothing_root'])[1]")).click();
		driver.findElement(By.id("com.dylvian.mango.activities:id/layout_gallery_size_selector")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='M']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text='Add']")).click();
		driver.findElement(By.id("com.dylvian.mango.activities:id/linearLayout")).click();
		driver.findElement(By.id("com.dylvian.mango.activities:id/bag_button_buy")).click();
		
		driver.findElement(By.xpath("//android.widget.Button[@text='Proceed with payment']")).click();
		Thread.sleep(3000);
		TouchAction action = new TouchAction(driver);
		action.longPress(PointOption.point(450, 1200)).moveTo(PointOption.point(450, 400)).release().perform();
		driver.findElement(By.xpath("//android.widget.Image[@text='paypal']")).click();
		driver.findElement(By.id("SVMobileSummaryBody:j_id_2g_2_1k:form-step2:complete-step2")).click();
		}
}
