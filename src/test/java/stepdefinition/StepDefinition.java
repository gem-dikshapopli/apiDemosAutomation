package stepdefinition;

import implementation.DemoImplementation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.awt.*;
import java.net.MalformedURLException;

public class StepDefinition {
    @Given("the ApiDemo application is open")
    public static void openApp() throws MalformedURLException {
        DemoImplementation.openApplication();
    }
    @Given("the user Scroll down to Set Wallpaper Option and Sets the wallpaper")
    public static void scroll() throws InterruptedException, AWTException {
        DemoImplementation.scrollAction();
    }
    @When("the user go back and Scroll down to Views Option and then select dragAndDrop Option")
    public static void selectDragAndDrop() throws InterruptedException {
        DemoImplementation.dragAndDrop();
    }
    @Then("the user drags and drops elements successfully")
    public static void dragAndDropTheBall(){
        DemoImplementation.dragAndDropTheBall();
    }
    @And("the user performs a double tap action by clicking on Next button")
    public static void doubleTap(){
        DemoImplementation.doubleTapAction();
    }
    @Then("the user experiences a double tap effect as the count of clicking is increased by 2")
    public static void checkTheCount(){
        DemoImplementation.countTheTaps();
    }
    @And("the User performs scroll up Action")
    public static void scrollUp() throws InterruptedException {
        DemoImplementation.scrollUpAction();
    }
    @When("the user performs a swipe right action")
    public static void swipe() throws InterruptedException {
        DemoImplementation.swipeRight();
    }
    @When("the user performs a swipe left action")
    public static void swipeLeft() throws InterruptedException {
        DemoImplementation.swipeLeft();
    }
    @Then("the swipe action is successful")
    public static void checkTheSwipe(){
        DemoImplementation.checkTheDimensions();
    }
}
