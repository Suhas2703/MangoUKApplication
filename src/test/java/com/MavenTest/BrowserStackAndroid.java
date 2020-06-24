package com.MavenTest;

import java.net.URL;
import java.util.List;
import java.net.MalformedURLException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
 
public class BrowserStackAndroid {
  
  public static String userName = "mehire1";
  public static String accessKey = "sz7pSKrcijBu2HByjq8L";

  public static AndroidDriver<MobileElement> browser() throws Throwable
  {
    DesiredCapabilities caps = new DesiredCapabilities();

    caps.setCapability("device", "Google Pixel 3");
    caps.setCapability("os_version", "9.0");
    caps.setCapability("project", "My First Project");
    caps.setCapability("build", "My First Build");
    caps.setCapability("name", "Bstack-[Java] Sample Test");
    caps.setCapability("app", "bs://cac24e4c72f404bd034f42f92ae42e6ac63f002f");

    AndroidDriver<MobileElement> androidDriver = new AndroidDriver<MobileElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);
    
    return androidDriver;
  }
  public static void main(String[] args) throws Throwable, Throwable 
  {
	browser();
	
}
  public static void quit(AndroidDriver<MobileElement> androidDriver)
  {
	  androidDriver.quit();
  }
}