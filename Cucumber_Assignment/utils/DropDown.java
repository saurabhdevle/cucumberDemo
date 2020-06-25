package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	WebDriver driver;
	public DropDown(WebDriver driver) {
		this.driver=driver;
		
	}
	public void clickOnCurrency() {
	WebElement selectCurrencyDropdown=driver.findElement(By. xpath("//div[@class='dropdown dropdown-currency']"));
			 
			 Select clickCurrencyINR = new Select(selectCurrencyDropdown);
			 clickCurrencyINR.selectByVisibleText("INR");
			 

}
}