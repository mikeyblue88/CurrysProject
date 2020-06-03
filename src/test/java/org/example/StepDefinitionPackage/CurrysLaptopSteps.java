package org.example.StepDefinitionPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObjectPackage.CurrysLaptop;

public class CurrysLaptopSteps {
    CurrysLaptop currysLaptop = new CurrysLaptop();

    @Given("^user is on CurrysPC World homepage$")
    public void user_is_on_CurrysPC_World_homepage() throws Throwable {
        currysLaptop.HomepageURL();
    }

    @When("^user hovers over computing$")
    public void user_hovers_over_computing() throws Throwable {
        currysLaptop.MousehoverComputing();
    }

    @When("^user moves the mouse to laptop$")
    public void user_moves_the_mouse_to_laptop() throws Throwable {
        currysLaptop.MousehoverLaptop();
    }

    @When("^user clicks on all laptops$")
    public void user_clicks_on_all_laptops() throws Throwable {
        currysLaptop.MousehoverAllLaptops();
    }

    @When("^userchanges the sort by feature to High to low$")
    public void userchanges_the_sort_by_feature_to_High_to_low() throws Throwable {
        currysLaptop.sortByClick();
    }

    @When("^user clicks on the most expensive laptop$")
    public void user_clicks_on_the_most_expensive_laptop() throws Throwable {
        currysLaptop.selectProductClick();
    }

    @Then("^user should be able to add that laptop to basket$")
    public void user_should_be_able_to_add_that_laptop_to_basket() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
}
