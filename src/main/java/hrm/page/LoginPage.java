package hrm.page;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hrm.base.HrmBaseClass;

public class LoginPage extends HrmBaseClass{
	
	//username
@FindBy(id = "txtUsername")
 WebElement usernametextfield;
	
	//password
@FindBy(name = "txtPassword")
 WebElement passwordtextfeild;

	//login
@FindBy(name = "Submit")
 WebElement SubmitButton;

//Forgot your password
@FindBy(xpath = "//a[text()='Forgot your password?']")
 WebElement ForgotPasslink;

public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}



public void ForgetPassword()
{
	ForgotPasslink.click();
}

/*public String GetTitle() {
	// TODO Auto-generated method stub
	return  driver.getTitle();
}*/

public void login() throws Exception
{

// TODO Auto-generated method stub
	usernametextfield.sendKeys(pdata.getpropertyData("username")); /// Getting username
	passwordtextfeild.sendKeys(pdata.getpropertyData("password"));  /// Getting password
	SubmitButton.submit(); //Submit
	 
}


}

