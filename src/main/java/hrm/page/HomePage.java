package hrm.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	//...................links....................
@FindBy(xpath = "(//Span[@class='quickLinkText'])[1]") //leave link
   WebElement assignleave;

public void Assignleavelink()
{
	assignleave.click();
}

@FindBy(xpath = "(//Span[@class='quickLinkText'])[2]") //leavelist
WebElement leavelist;
public void Leavelistlink()
{
	leavelist.click();
}

@FindBy(xpath = "(//Span[@class='quickLinkText'])[3]") //timeSheet link
WebElement timesheet;
public void Timesheetlink()
{
	timesheet.click();
}

@FindBy(xpath = "(//Span[@class='quickLinkText'])[4]") // applyleave
WebElement applyleave;
public void Applyleavelink()
{
	applyleave.click();
}

@FindBy(xpath = "(//Span[@class='quickLinkText'])[5]") //myLeave
WebElement myleave;

public void Myleavelink()
{
	myleave.click();
}

@FindBy(xpath = "(//Span[@class='quickLinkText'])[6]") //MyTime Sheet
WebElement mytimesheet;
public void Mytimesheetlink()
{
	mytimesheet.click();
}


//***********************Adimn****************************

@FindBy(xpath = "//b[text()='Admin']") 		//Admin
WebElement Adimin;
public WebElement getAdimin() 
{
	return Adimin;
}

@FindBy(id = "menu_admin_UserManagement") //menu_admin_UserManagement
WebElement UserManagement;
public WebElement getUserManagement() 
{
	return UserManagement;
}

@FindBy(id = "menu_admin_viewSystemUsers")  //menu_admin_viewSystemUsers
WebElement systemUsers;
public void Systemuserclick()
{
	systemUsers.click();
}

@FindBy(id = "menu_admin_Job")             // mouseover menu_admin_Job
WebElement menu_admin_Job;

public WebElement getMenu_admin_Job() {
	return menu_admin_Job;
}

//****************** PIM link**********************
@FindBy(xpath = "//b[text()='PIM']")
WebElement pim;
public void PimClick()
{
	pim.click();
}
//****************** Leave link**********************
@FindBy(xpath = "//b[text()='Leave']")
WebElement leave;
public void LeaveClick()
{
	leave.click();
}

//****************** Time link**********************
@FindBy(xpath = "//b[text()='Time']")
WebElement time;
public void TimeClick()
{
	time.click();
}

//****************** Recruitment link**********************
@FindBy(xpath = "//b[text()='Recruitment']")
WebElement recruitment;
public void RecruitmentClick()
{
	recruitment.click();
}

//****************** My info link**********************
@FindBy(xpath = "//b[text()='My Info']")
WebElement myinfo;
public void MyinfoClick()
{
	myinfo.click();
}

//****************** Performance link**********************
@FindBy(xpath = "//b[text()='Performance']")
WebElement performance;
public void PerformanceClick()
{
	performance.click();
}

//****************** Directory link**********************
@FindBy(xpath = "//b[text()='Directory']")
WebElement directory;
public void DirectoryClick()
{
	directory.click();
}

//****************** Maintenance link**********************
@FindBy(xpath = "//b[text()='Maintenance']")
WebElement maintenance;
public void MaintenanceClick()
{
	maintenance.click();
}




//********************BuzzPage link***************
@FindBy(xpath = "//b[text()='Buzz']")      // BuzzClick
WebElement buzz;
public void BuzzClick()
{
	buzz.click();
}

//********************Marketplace Page link***************
@FindBy(xpath = "//input[@id='MP_link']")      // Marketplace
WebElement marketplace;
public void Marketplace()
{
	marketplace.click();
}
//********************Marketplace Page link***************
@FindBy(xpath = "//span[@id='notification' and @class='fa-lg fa-layers fa-fw']")      // notification
WebElement notification;
public void Notificationicon()
{
	notification.click();
}

//********************Question mark Page link***************
@FindBy(xpath = "//span[@id='notification' and @class='fa-lg fa-layers fa-fw']")      // questionmark
WebElement questionmark;
public void Questionmark()
{
	questionmark.click();
}

//********************welcome menu Page link***************
@FindBy(id = "welcome")      // welcome menu Page
WebElement welcomelist;
public void Welcome()
{
	welcomelist.click();
}
@FindBy(xpath = "//a[text()='Logout']")      // Logout click
WebElement logout;
public void Logout()
{
	logout.click();
}


//******************************JobTilesPages********************************
@FindBy(xpath = "//a[text()='Job Titles']") //click job titles
WebElement jobtitles;
public WebElement getJobtitles() 
{
	return jobtitles;
}
@FindBy(id = "menu_admin_viewJobTitleList") //click job titles
WebElement menu_admin_viewJobTitleList;
public void Menu_admin_viewJobTitleList()
{
	menu_admin_viewJobTitleList.click();
}














//................initElement....................
public HomePage(WebDriver dirver)
{
	PageFactory.initElements(dirver, this);
}




}