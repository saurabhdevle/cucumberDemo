package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup_Page extends BasePage {
	
	public WebDriver driver;
	@FindBy(name="firstname")
	WebElement firstName_textBox;
	@FindBy(name="lastname")
	WebElement lastName_textBox;
	@FindBy(name="phone")
	WebElement mobileNumber_textBox;
	@FindBy(name="email")
	WebElement email_textBox;
	@FindBy(name="password")
	WebElement password_textBox;
	@FindBy(name="confirmpassword")
	WebElement confirmpassword_textBox;
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signup_Button;
	
	
	public Signup_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
}

public void enterFirstName(String fname) {
	firstName_textBox.clear();
	firstName_textBox.sendKeys(fname);
}

public void enterLastName(String lname) {
	lastName_textBox.clear();
	lastName_textBox.sendKeys(lname);
}

public void enterMobNumber(String mnumber) {
	mobileNumber_textBox.clear();
	mobileNumber_textBox.sendKeys(mnumber);
}

public void enteremail(String email) {
	email_textBox.clear();
	email_textBox.sendKeys(email);
}

public void enterPassword(String pwd) {
	password_textBox.clear();
	password_textBox.sendKeys(pwd);
}

public void enterConfirmPassword(String cp) {
	confirmpassword_textBox.clear();
	confirmpassword_textBox.sendKeys(cp);
}

public void clickSignupButton() {
	signup_Button.click();
}


}
