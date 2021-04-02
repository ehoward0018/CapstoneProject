package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CapstoneProjectPageObj;
import utilities.WebDriverUtility;

public class CapstoneProjectStepDefinitions extends Base {
	CapstoneProjectPageObj capstoneProject = new CapstoneProjectPageObj();
	
	@When("^User click on '(.+)' tab$")
	public void user_click_on_desktopsTab_tab(String value) throws Throwable {
		capstoneProject.clickOnWebElement(value);
		logger.info("User clicked on " + value);
	}

	@When("^User click on '(.+)' button$")
	public void user_click_on_showAllDesktops_button(String value) throws Throwable {
		capstoneProject.clickOnWebElement(value);
		logger.info("User clicked on "+ value + " button");
	}

	@Then("^User should see all '(.+)' are present in Desktop page$")
	public void user_should_see_all_iMac_are_present_in_Desktop_page(String value) throws Throwable {
		Assert.assertFalse(capstoneProject.checkForWebElementDisplayed(value));
		logger.info("User was able to see desktops");
	}
	
	@When("^User select '(.+)' '(.+)'$")
	public void user_select_quantity(String input, String value) throws Throwable {
	    Assert.assertTrue(capstoneProject.checkInputForValue(input,value));
	    logger.info("User selected " + input + " " + value);
	}

	@When("^User click on '(.+)'$")
	public void user_click_on_addToCart(String value) throws Throwable {
	    capstoneProject.clickOnWebElement(value);
	    logger.info("User added " + value + " to the cart");
	    
	}

	@Then("^User should see a '(.+)' message$")
	public void user_should_see_a_successfullAddedToCartMessage_message(String value) throws Throwable {
	    Assert.assertTrue(capstoneProject.checkForWebElementDisplayed(value));
	    logger.info("User can see " + value + " message");
	}
	
	@When("^User select color from '(.+)' '(.+)'$")
	public void user_select_color_from_dropDown_Red(String input, String value) throws Throwable {
	    Assert.assertTrue(capstoneProject.checkDropDownValue(input, value));
	}
	
	@When("^user fill the review information with below information$")
	public void user_fill_the_review_information_with_below_information(DataTable arg1) throws Throwable {
		List<Map<String,String>> dataValues = arg1.asMaps(String.class, String.class);
		capstoneProject.insertReviewValues(dataValues.get(0).get("yourname"), dataValues.get(0).get("yourReview"), dataValues.get(0).get("Rating"));
		WebDriverUtility.screenShot();
	}
	
	@Then("^User should see '(.+)' showed to the '(.+)'$")
	public void user_should_see_item_s_$_showed_to_the_cartTotal(String value, String input) throws Throwable {
	    Assert.assertTrue(capstoneProject.checkInputForText(input,value));
	    logger.info("User should see " + input + " showed to the " + value);
	}
	
	@Then("^User should see all '(.+)' are present$")
	public void user_should_see_all_LoggedIn_are_present(String value) throws Throwable {
	    Assert.assertTrue(capstoneProject.checkForWebElementDisplayed(value));
	}
	
	@When("^User fill affiliate form with below information$")
	public void user_fill_affiliate_form_with_below_information(DataTable arg1) throws Throwable {
		List<Map<String,String>> dataValues = arg1.asMaps(String.class, String.class);
		capstoneProject.insertAffiliateFormValues(dataValues.get(0).get("company"), dataValues.get(0).get("website"), dataValues.get(0).get("taxID"), dataValues.get(0).get("paymentMethod"));
		WebDriverUtility.screenShot();
	}
	
	@When("^User fill bank form with below information$")
	public void user_fill_bank_form_with_below_information(DataTable arg1) throws Throwable {
		List<Map<String,String>> dataValues = arg1.asMaps(String.class, String.class);
		capstoneProject.insertBankInformation(dataValues.get(0).get("bankName"), dataValues.get(0).get("abaNumber"), dataValues.get(0).get("swiftCode"), dataValues.get(0).get("accountName"), dataValues.get(0).get("accountNumber"));
		WebDriverUtility.screenShot();
	}
	
	@When("^User fill account information with below information$")
	public void user_fill_account_information_with_below_information(DataTable arg1) throws Throwable {
		List<Map<String,String>> dataValues = arg1.asMaps(String.class, String.class);
		capstoneProject.insertAccountInformation(dataValues.get(0).get("firstname"), dataValues.get(0).get("lastName"), dataValues.get(0).get("email"), dataValues.get(0).get("telephone"));
		WebDriverUtility.screenShot();
	}
}
