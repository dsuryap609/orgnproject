package hrm.testcase;

import org.apache.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.Test;

import hrm.base.HrmBaseClass;
import hrm.page.LeavePage;
import hrm.page.LoginPage;

public class LeaveListTestScript8 extends  HrmBaseClass {
	
	Logger log = Logger.getLogger(LeaveListTestScript8.class);

	
@Test(priority = 1)
public void Leavelist() throws Exception
{
	log.info("****************************** Starting @test execution Test  *****************************************");
	Reporter.log("Leavelist", true);
	LoginPage lp=new LoginPage(driver); //create a object Login page
	lp.login();
	LeavePage LeavePage=new LeavePage(driver);
	Thread.sleep(1000);
	LeavePage.Leavelist();
	Thread.sleep(1000);
	LeavePage.CalFromDate();
	Thread.sleep(1000);
	LeavePage.CalToDate();
	Thread.sleep(1000);
	
	Thread.sleep(1000);
	LeavePage.LeaveList_txtEmployee_empName();
	Thread.sleep(1000);
	LeavePage.BtnSearchLeavelist();
	Thread.sleep(2000);
	
}
}
