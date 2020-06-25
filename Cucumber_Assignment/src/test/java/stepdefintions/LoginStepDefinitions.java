package stepdefintions;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.Currency_Page;
import pages.Login_Page;
import pages.Main_Page;
import pages.Signup_Page;
import pages.User_Home_Page;
import utils.WaitHelper;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class LoginStepDefinitions extends BasePage {
	Main_Page main_Page;
	Login_Page login_Page;
	Signup_Page signup_Page;
	User_Home_Page user_home_Page;
	WaitHelper waithelper;
	Currency_Page currency_Page;

	@Given("user is already on {string} page")
	public void user_is_already_on_login_page(String param) throws IOException {
		// Write code here that turns the phrase above into concrete actions

		initDriver("chrome");
		launchApp();
		main_Page = new Main_Page(driver);
		login_Page = new Login_Page(driver);
		signup_Page = new Signup_Page(driver);
		waithelper = new WaitHelper(driver);
        currency_Page = new Currency_Page(driver);
        
		main_Page.clickMyAccDropdown();
		if (param.equalsIgnoreCase("login"))
			main_Page.clickLoginLInk();
		else if (param.equalsIgnoreCase("signup"))
			main_Page.clickSignUpLInk();
		

		

	}

	@And("title of login page is login")
	public void title_of_login_page_is_login() {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals("Login", getBrowserTitle());

	}

	// @When("^user enters \"(.*)\" and \"(.*)\"$")
	@When("user enters {string} and {string}")
	public void user_enters_username_and_password(String username, String password) {
		// Write code here that turns the phrase above into concrete actions
		login_Page.enterEmail(username);
		login_Page.enterPassword(password);

	}

	@When("user enter {string} and {string}")
	public void user_enter_username_and_password(String username, String password) {
		// Write code here that turns the phrase above into concrete actions
		login_Page.enterEmail(username);
		login_Page.enterPassword(password);

	}

	@When("user enters below username and password provided")
	public void user_enter_username_and_password_datatable(DataTable dt) {
		// Write code here that turns the phrase above into concrete actions
		List<List<String>> list = dt.asLists();

		// for(int i=0;i<list.size();i++) {
		for (List<String> li : list) {
			login_Page.enterEmail(li.get(0));
			login_Page.enterPassword(li.get(1));
		}

	}

	@When("user provides signup information")
	public void user_provides_signup_info(DataTable dt) {
		// Write code here that turns the phrase above into concrete actions
		List<Map<String, String>> list = dt.asMaps();

		// for(int i=0;i<list.size();i++) {

		signup_Page.enterFirstName(list.get(0).get("firstName"));
		signup_Page.enterLastName(list.get(0).get("lastName"));
		signup_Page.enterMobNumber(list.get(0).get("mobileNumber"));
		signup_Page.enteremail(list.get(0).get("email"));
		signup_Page.enterPassword(list.get(0).get("password"));
		signup_Page.enterConfirmPassword(list.get(0).get("confirmPwd"));

	}

	@Then("user clicks on Login button")
	public void user_clicks_on_Login_button() {
		// Write code here that turns the phrase above into concrete actions
		login_Page.clickLoginButton();

	}

	@Then("user clicks on Signup button")
	public void user_clicks_on_Singup_button() {
		// Write code here that turns the phrase above into concrete actions
		signup_Page.clickSignupButton();

	}

	@Then("User is on home page")
	public void user_is_on_home_page() {
		// Write code here that turns the phrase above into concrete actions
		waithelper.waitForPageLoaded();
		Assert.assertEquals("My Account", getBrowserTitle());

	}

	@But("User is not on home page")
	public void user_is_not_on_home_page() {
		waithelper.waitForPageLoaded();
		Assert.assertEquals("Login", getBrowserTitle());
	}

	@Then("login error is displayed")
	public void login_error_is_displayed() {
		waithelper.waitForPageLoaded();
		Assert.assertEquals("Invalid Email or Password", login_Page.getLoginErrorMessage());

	}

	/*
	 * @Given("user is on home page") public void user_is_on_home_page(String
	 * strArg1) throws IOException {
	 * 
	 * main_Page.ClickOnCurrency(); }
	 * 
	 * @Then("user clicked on INR currency") public void
	 * user_clicked_on_inr_currency() { currency_Page.ClickCurrencyDropDown(); }
	 * 
	 * @And("user click on the currency dropdown buttonsss") public void
	 * user_click_on_the_currency_dropdown_button() {
	 * 
	 * 
	 * WebElement selectCurrencyDropdown=driver.findElement(By.
	 * xpath("//div[@class='dropdown dropdown-currency']"));
	 * 
	 * Select clickCurrencyINR = new Select(selectCurrencyDropdown);
	 * clickCurrencyINR.selectByVisibleText("INR");
	 * currency_Page.clickCurrencyINR();
	 * 
	 * 
	 * }
	 * 
	 * @And("currency list is displayed") public void currency_list_is_displayed() {
	 * System.out.println(currency_Page);
	 * 
	 * }
	 */

	@Given("user is on home page")
	public void user_is_on_home_page1() throws Exception{

	currency_Page.clickonCurrency();
	}

	@Given("user click on the currency dropdown button")
	public void user_click_on_the_currency_dropdown_button() {
		currency_Page.ClickCurrencyDropDown();
	}

	@Then("user clicked on INR currency")
	public void user_clicked_on_INR_currency() {

		WebElement selectCurrencyDropdown=driver.findElement(By.xpath("//div[@class='dropdown dropdown-currency']"));
				  
				  Select clickCurrencyINR = new Select(selectCurrencyDropdown);
				  clickCurrencyINR.selectByVisibleText("INR");
				  currency_Page.clickCurrencyINR();
	}

	@And("user closes browser")
	public void user_closes_browser() {

		driver.close();

	}
}
