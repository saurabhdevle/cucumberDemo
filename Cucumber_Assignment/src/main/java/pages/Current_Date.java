package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Current_Date extends BasePage {
	public WebDriver driver;

	
	@FindBy(xpath = "//span[contains(@class,'h4')]")
WebElement Current_date;
	
	
	public Current_Date(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
		
}
	
	public void CurrentDate() {
	
		Current_date.isDisplayed();
	}

}
