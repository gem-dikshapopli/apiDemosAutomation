package implementation;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DemoImplementation {

    public static AppiumDriver driver;
    public static TouchAction action;
    public static int widthOfButton;
    public static int postRightSwipe;
    public static int postLeftSwipe;
    public static WebElement element;

    public static void openApplication() throws MalformedURLException {
        //Desired capabilites
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\Diksha.Popli\\Downloads\\com.touchboarder.android.api.demos_2016-02-08.apk");
        // to provide allow notification by default
        cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, cap);
    }


    public static void scrollAction() throws InterruptedException, AWTException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(Locators.clickOk).click();
        driver.findElement(Locators.apiDemos).click();
        driver.findElement(Locators.app).click();
        driver.findElement(Locators.activity).click();

        // scroll down to an element
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Wallpaper\").instance(0))")).click();
        driver.findElement(Locators.setWallpaper).click();
        driver.navigate().back();
    }

    public static void dragAndDrop() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(Locators.back).click();
        Thread.sleep(2000);
        driver.findElement(Locators.back).click();
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Views\").instance(0))")).click();
        driver.findElement(Locators.dragAndDrop).click();
    }
    public static void dragAndDropTheBall(){
        // drag the element and drop to a particular location
        WebElement drag = driver.findElement(Locators.dragElement);
        WebElement drop = driver.findElement(Locators.dropElement);

        // action class to perform drag and drop
        action = new TouchAction<>(driver);
        LongPressOptions lp = new LongPressOptions();
        lp.withElement(ElementOption.element(drag)).withDuration(Duration.ofSeconds(2));
        action.longPress(lp).moveTo(ElementOption.element(drop)).release().perform();
        // to move back to the previous screen
        driver.navigate().back();
    }

    public static void doubleTapAction() {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"TextSwitcher\").instance(0))")).click();
        WebElement doubleTapElement = driver.findElement(Locators.tap);
        action.tap(ElementOption.element(doubleTapElement)).perform();
        action.tap(ElementOption.element(doubleTapElement)).perform();


        /**Hovering over an element is not directly supported in Appium
        ** because Appium primarily focuses on mobile application automation,
        ** and hovering is more common in desktop web applications.
        ** However, you can still achieve a similar effect by interacting
        ** with the element in a way that simulates a tap or click.**/

    }
    public static void countTheTaps() {
        String verifyNumberOfTaps = driver.findElement(Locators.verifyNumberOfTapsText).getText();
        Assert.assertTrue(verifyNumberOfTaps.equalsIgnoreCase("2"));
        // Navigate back
        driver.navigate().back();
    }

    public static void scrollUpAction() throws InterruptedException {
        //scroll up functionality
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Dimension size = driver.manage().window().getSize();
        int start_x = (int) (size.width * 0.5);
        int start_y = (int) (size.height * 0.2);
        int end_x = (int) (size.width * 0.2);
        int end_y = (int) (size.height * 0.5);
        Thread.sleep(1000);
        action.press(PointOption.point(start_x, start_y))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(end_x, end_y)).release().perform();
    }

    public static void swipeRight() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Rotating Button\").instance(0))")).click();

        //swipe action
        //performing swipe right
        Dimension dimension = driver.findElement(Locators.rotatingButtonDimension).getSize();
        widthOfButton = dimension.width;
        element = driver.findElement(Locators.swipe);
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(),
                "direction", "right",
                "percent", "0.75"));

        Dimension dimensionRight = driver.findElement(Locators.rotatingButtonDimension).getSize();
        postRightSwipe = dimensionRight.width;

    }
    public static void swipeLeft() throws InterruptedException {
        Thread.sleep(3000);
        //performing swipe left
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(),
                "direction", "left",
                "percent", "0.7"));
        Dimension dimensionLeft = driver.findElement(Locators.rotatingButtonDimension).getSize();
        postLeftSwipe = dimensionLeft.width;

    }
    public static void checkTheDimensions(){
        Assert.assertTrue(widthOfButton != postRightSwipe && widthOfButton != postLeftSwipe);
    }


}
