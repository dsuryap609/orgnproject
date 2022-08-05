package hrm.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPages {
	//*************************User System*********************************
	@FindBy(name = "searchSystemUser[userName]")
	WebElement adusername;
	public void AdUsername()
	{
		adusername.sendKeys("1Rover124412");
	}
	@FindBy(xpath = "//option[text()='Admin']")
	WebElement addropdown;
	
	public void getAddropdown() {
		addropdown.click();
	}
	@FindBy(name = "searchSystemUser[employeeName][empName]")
		WebElement adEmployee_name;
	public void AdEmployee_name()
	{
		adEmployee_name.sendKeys("adEmployee_name");
	}
	@FindBy(name = "_search")
		WebElement searchBtn;
	public void SearchBtn()
	{
	searchBtn.click();
	}
	
//**********checkBox****************************
	@FindBy(name = "chkSelectAll")
	public
	WebElement chkSelectAll;
	public  void ChkSelectAll()
		{
		chkSelectAll.click();
		}

//******************inti*****************
public AdminPages(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
