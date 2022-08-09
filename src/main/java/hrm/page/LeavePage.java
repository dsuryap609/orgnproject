package hrm.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeavePage {

	@FindBy(xpath ="//b[text()='Leave']")
	WebElement leavelist;
	public void Leavelist()
	{
		leavelist.click();
	}	
	
@FindBy(id="calFromDate")
WebElement calFromDate;
public void CalFromDate()
{
	calFromDate.clear();
	calFromDate.sendKeys("2022-08-12");
}
@FindBy(id="calToDate")
WebElement calToDate;
public void CalToDate()
{
	calToDate.clear();
	calToDate.sendKeys("2022-11-11");
}
/*@FindBy(xpath = "//input[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck' and @checked='checked']")
WebElement showleavewithstatus;
public void ShowLeavewithStatusCheckbox()
{
	
	showleavewithstatus.click();
}*/
@FindBy(id="leaveList_txtEmployee_empName")
WebElement leaveList_txtEmployee_empName;
public void LeaveList_txtEmployee_empName()
{
	leaveList_txtEmployee_empName.sendKeys("Aaliyah Haq");
	
}
@FindBy(id="btnSearch")
WebElement btnSearch;
public void BtnSearchLeavelist()
{
	btnSearch.click();
	
}
public LeavePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
