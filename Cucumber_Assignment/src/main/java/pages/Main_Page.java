package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Main_Page extends BasePage{
	public WebDriver driver;
	
	@FindBy(xpath="(//*[@id='dropdownCurrency'])[2]")
	WebElement myAccount_dropdown;
	@FindBy(linkText="Login")
	WebElement login_link;
	@FindBy(linkText="Sign Up")
	WebElement SignUp_link;
	@FindBy(xpath = "(//a[@id='dropdownCurrency'])[1]")
	WebElement Currency_List;
	
	
	public Main_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickMyAccDropdown() {
		myAccount_dropdown.click();
	}
	
	public void clickLoginLInk() {
		login_link.click();
	}
	public void clickSignUpLInk() {
		SignUp_link.click();
	}

	public void clickonCurrencyList() {
		Currency_List.click();
	}
	
}
