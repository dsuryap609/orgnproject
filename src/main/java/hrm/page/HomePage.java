package hrm.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	//...................links....................
@FindBy(xpath = "(//Span[@class='quickLinkText'])[1]")
   WebElement assignleave;

public void Assignleavelink()
{
	assignleave.click();
}

@FindBy(xpath = "(//Span[@class='quickLinkText'])[2]")
WebElement leavelist;
public void Leavelistlink()
{
	leavelist.click();
}

@FindBy(xpath = "(//Span[@class='quickLinkText'])[3]")
WebElement timesheet;
public void Timesheetlink()
{
	timesheet.click();
}

@FindBy(xpath = "(//Span[@class='quickLinkText'])[4]")
WebElement applyleave;
public void Applyleavelink()
{
	applyleave.click();
}

@FindBy(xpath = "(//Span[@class='quickLinkText'])[5]")
WebElement myleave;

public void Myleavelink()
{
	myleave.click();
}

@FindBy(xpath = "(//Span[@class='quickLinkText'])[6]")
WebElement mytimesheet;
public void Mytimesheetlink()
{
	mytimesheet.click();
}


//***********************Adimn****************************

@FindBy(xpath = "//b[text()='Admin']")
WebElement Adimin;
public WebElement getAdimin() 
{
	return Adimin;
}

@FindBy(id = "menu_admin_UserManagement")
WebElement UserManagement;
public WebElement getUserManagement() 
{
	return UserManagement;
}

@FindBy(id = "menu_admin_viewSystemUsers")
WebElement systemUsers;
public void Systemuserclick()
{
	systemUsers.click();
}



//................initElement....................
public HomePage(WebDriver dirver)
{
	PageFactory.initElements(dirver, this);
}




}