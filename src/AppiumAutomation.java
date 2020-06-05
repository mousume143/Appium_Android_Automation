import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumAutomation {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities dc = new DesiredCapabilities();

        //Emulator Name
        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"988a9042474a49583430");
        //For Android android, for IOS ios
        dc.setCapability("platformName","android");
        //Testing Application Package Name
        dc.setCapability("appPackage","com.shohoz.rides.stage");
        //Testing Application Launcher Activity
        dc.setCapability("appActivity","com.shohoz.rides.activities.splash.SplashActivity");


        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);




    }
    public static void waitForVisibility (AndroidDriver<AndroidElement> driver,String id) {

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));


    }


}

