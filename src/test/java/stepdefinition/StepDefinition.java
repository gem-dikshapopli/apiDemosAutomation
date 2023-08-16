package stepdefinition;

import implementation.DemoImplementation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.awt.*;
import java.net.MalformedURLException;

public class StepDefinition {
    @Given("the ApiDemo application is open")
    public static void openApp() throws MalformedURLException {
        DemoImplementation.openApplication();
    }
    @When("performing scroll action")
    public static void scroll() throws InterruptedException, AWTException {
        DemoImplementation.scrollAction();
    }
    @Then("performing drag and drop")
    public static void dragAndDrop() throws InterruptedException {
        DemoImplementation.dragAndDropAction();
    }
    @And("double tapping")
    public static void doubleTap(){
        DemoImplementation.doubleTapAction();
    }
    @And("perform scroll up functionality")
    public static void scrollUp() throws InterruptedException {
        DemoImplementation.scrollUpAction();
    }

}
