package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Currency_Page extends BasePage {
	public WebDriver driver;
	
	

	@FindBy(xpath = "(//a[@id='dropdownCurrency'])[1]")
	WebElement Currency_List;

	@FindBy(xpath = "//a[contains(.,'INR')]")
	WebElement Currency_INR;

	public Currency_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void ClickCurrencyDropDown() {
		Currency_List.click();
	}

	public void clickCurrencyINR() {

		/*
		 * WebElement selectCurrencyDropdown=driver.findElement(By.
		 * xpath("//div[@class='dropdown dropdown-currency']"));
		 * 
		 * Select clickCurrencyINR = new Select(selectCurrencyDropdown);
		 * clickCurrencyINR.selectByVisibleText("INR");
		 */

		Currency_INR.click();

	}

	public void clickonCurrencyList() {
    Currency_List.click();
		
	}

}
