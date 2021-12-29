package serenity.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import page.basepage;
import page.locaters;

public class stepspage {
	
	basepage login;
	
	
		@Given("^Enter user name\"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void enter_something_and_something(String username, String password) throws Throwable {
		 login.login(username, password);
	    }

	    @Then("^verify user login$")
	    public void verify_user_login() throws Throwable {
	    	
	    	
	    }
	
	
}
