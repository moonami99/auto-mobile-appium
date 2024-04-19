package api_learning;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class LauchAppTest {
    public static void main(String[] args) {
        //DesiredCap
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        desiredCapabilities.setCapability("udid", "emulator-5554");
        desiredCapabilities.setCapability("appPackage", "com.wdiodemoapp");
        desiredCapabilities.setCapability("appActivity", "com.wdiodemoapp.MainActivity");

        AppiumDriver appiumDriver = null;

        //Init session
        try {
            URL appiumServer = new URL("http://localhost:4725");
            appiumDriver = new AndroidDriver(appiumServer, desiredCapabilities);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Close session
        if (appiumDriver != null) {
            appiumDriver.quit();
        }
    }
}
