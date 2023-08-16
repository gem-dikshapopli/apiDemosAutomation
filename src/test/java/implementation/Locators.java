package implementation;

import org.openqa.selenium.By;

public class Locators {
    public static By clickOk=By.id("com.touchboarder.android.api.demos:id/buttonDefaultPositive");
    public static By apiDemos=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[2]");
    public static By app=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[3]");
    public static By activity= By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[2]");
    public static By setWallpaper=By.id("com.touchboarder.android.api.demos:id/setwallpaper");
    public static By back=By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
    public static By dragAndDrop=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[8]");
    public static By tap=By.id("com.touchboarder.android.api.demos:id/next");
    public static By dragElement=By.id("com.touchboarder.android.api.demos:id/drag_dot_1");
    public static By dropElement=By.id("com.touchboarder.android.api.demos:id/drag_dot_2");
    public static By rotatingButtonDimension=By.id("com.touchboarder.android.api.demos:id/rotatingButton");
    public static By swipe=By.id("com.touchboarder.android.api.demos:id/translationX");

    public static By verifyNumberOfTapsText=By.className("android.widget.TextView");
}
