package hrm.testcase;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import hrm.base.HrmBaseClass;
import hrm.page.HomePage;
import hrm.page.LoginPage;

public class QuickLuchTestScript2 extends HrmBaseClass {
	Logger log = Logger.getLogger(LoginPageTestScript1.class);
@Test(priority = 1)
public void Assignleave() throws Exception
{
	log.info("****************************** Starting test execution Test  *****************************************");
	LoginPage lp=new LoginPage(driver);
	lp.login();
	
	HomePage h=new HomePage(driver);
	h.Assignleavelink();
	
}
@Test(priority = 2)
public void Leavelist() throws Exception
{
	log.info("****************************** Starting test execution Test  *****************************************");
	LoginPage lp=new LoginPage(driver);
	lp.login();
	
	HomePage h=new HomePage(driver);
	h.Leavelistlink();
	
}
@Test(priority = 3)
public void Timesheet() throws Exception
{
	log.info("****************************** Starting test execution Test  *****************************************");
	LoginPage lp=new LoginPage(driver);
	lp.login();
	
	HomePage h=new HomePage(driver);
	h.Timesheetlink();
	
}
@Test(priority = 4)
public void Applyleave() throws Exception
{
	log.info("****************************** Starting test execution Test  *****************************************");
	LoginPage lp=new LoginPage(driver);
	lp.login();
	
	HomePage h=new HomePage(driver);
	h.Applyleavelink();
	
}
@Test(priority = 5)
public void Myleave() throws Exception
{
	log.info("****************************** Starting test execution Test  *****************************************");
	LoginPage lp=new LoginPage(driver);
	lp.login();
	
	HomePage h=new HomePage(driver);
	h.Myleavelink();
	
}
@Test(priority = 6)
public void Mytimesheet() throws Exception
{
	log.info("****************************** Starting test execution Test  *****************************************");
	LoginPage lp=new LoginPage(driver);
	lp.login();
	
	HomePage h=new HomePage(driver);
	h.Mytimesheetlink();
	
}

}
