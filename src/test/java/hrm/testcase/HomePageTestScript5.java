package hrm.testcase;

import org.apache.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import hrm.base.HrmBaseClass;
import hrm.page.HomePage;
import hrm.page.LoginPage;
import listener.TestNgListener;
@Listeners(TestNgListener.class)
public class HomePageTestScript5 extends HrmBaseClass {

	Logger log = Logger.getLogger(LoginPageTestScript1.class);
@Test(priority = 1)
public void Pim() throws Exception
{
	log.info("****************************** Starting @test execution Test  *****************************************");
	Reporter.log("Pim", true);
	LoginPage lp=new LoginPage(driver); //create a object Login page
	lp.login();
	
	HomePage h=new HomePage(driver); //create a object Home page
	h.PimClick();
	log.info("****************************** End @test execution Test  *****************************************");
}
@Test(priority = 2)
public void Leave() throws Exception
{
	log.info("****************************** Starting @test execution Test  *****************************************");
	Reporter.log("Leave", true);
	LoginPage lp=new LoginPage(driver); //create a object Login page
	lp.login();
	
	HomePage h=new HomePage(driver); //create a object Home page
	h.LeaveClick();
	log.info("****************************** End @test execution Test  *****************************************");
}
@Test(priority = 3)
public void Time() throws Exception
{
	log.info("****************************** Starting @test execution Test  *****************************************");
	Reporter.log("Time", true);
	LoginPage lp=new LoginPage(driver); //create a object Login page
	lp.login();
	
	HomePage h=new HomePage(driver); //create a object Home page
	h.TimeClick();
	log.info("****************************** End @test execution Test  *****************************************");

}
@Test(priority = 4)
public void Recruitment() throws Exception
{
	log.info("****************************** Starting @test execution Test  *****************************************");
	Reporter.log("Recruitment", true);
	LoginPage lp=new LoginPage(driver); //create a object Login page
	lp.login();
	
	HomePage h=new HomePage(driver); //create a object Home page
	h.RecruitmentClick();
	log.info("****************************** End @test execution Test  *****************************************");
}
@Test(priority = 5)
public void Myinfo() throws Exception
{
	log.info("****************************** Starting @test execution Test  *****************************************");
	Reporter.log("Myinfo", true);
	LoginPage lp=new LoginPage(driver); //create a object Login page
	lp.login();
	
	HomePage h=new HomePage(driver); //create a object Home page
	h.MyinfoClick();
	log.info("****************************** End @test execution Test  *****************************************");
}
@Test(priority = 6)
public void Performance() throws Exception
{
	log.info("****************************** Starting @test execution Test  *****************************************");
	Reporter.log("Performance", true);
	LoginPage lp=new LoginPage(driver); //create a object Login page
	lp.login();
	
	HomePage h=new HomePage(driver); //create a object Home page
	h.PerformanceClick();
	log.info("****************************** End @test execution Test  *****************************************");
}
@Test(priority = 7)
public void Directory() throws Exception
{
	log.info("****************************** Starting @test execution Test  *****************************************");
	Reporter.log("Directory", true);
	LoginPage lp=new LoginPage(driver); //create a object Login page
	lp.login();
	
	HomePage h=new HomePage(driver); //create a object Home page
	h.DirectoryClick();
	log.info("****************************** End @test execution Test  *****************************************");
}
@Test(priority = 8)
public void Maintenance() throws Exception
{
	log.info("****************************** Starting @test execution Test  *****************************************");
	Reporter.log("Maintenance", true);
	LoginPage lp=new LoginPage(driver); //create a object Login page
	lp.login();
	
	HomePage h=new HomePage(driver); //create a object Home page
	h.MaintenanceClick();
	log.info("****************************** End @test execution Test  *****************************************");
}
@Test(priority = 9)
public void Buzz() throws Exception
{
		
	log.info("****************************** Starting @test execution Test  *****************************************");
	Reporter.log("Buzz", true);
	LoginPage lp=new LoginPage(driver); 			//create a object Login page
	lp.login();
	HomePage hp=new HomePage(driver); 				//create a object Home page
	hp.BuzzClick();
	log.info("****************************** End @test execution Test  *****************************************");
}
@Test(priority = 10)
public void Marketplace() throws Exception
{
	log.info("****************************** Starting @test execution Test  *****************************************");
	Reporter.log("Marketplace", true);
	LoginPage lp=new LoginPage(driver); //create a object Login page
	lp.login();
	
	HomePage h=new HomePage(driver); //create a object Home page
	h.Marketplace();
	log.info("****************************** End @test execution Test  *****************************************");
}
@Test(priority = 11)
public void Notification() throws Exception
{
	log.info("****************************** Starting @test execution Test  *****************************************");
	Reporter.log("Notification", true);
	LoginPage lp=new LoginPage(driver); //create a object Login page
	lp.login();
	
	HomePage h=new HomePage(driver); //create a object Home page
	Thread.sleep(1000);
	h.Notificationicon();
	log.info("****************************** End @test execution Test  *****************************************");
	Thread.sleep(3000);
}
@Test(priority = 12)
public void Questionmarklink() throws Exception
{
	log.info("****************************** Starting @test execution Test  *****************************************");
	Reporter.log("Questionmark", true);
	LoginPage lp=new LoginPage(driver); //create a object Login page
	lp.login();
	
	HomePage h=new HomePage(driver); //create a object Home page
	h.Questionmark();
	log.info("****************************** End @test execution Test  *****************************************");

}
@Test(priority = 13)
public void WelcomeMenuTologout() throws Exception
{
	log.info("****************************** Starting @test execution Test  *****************************************");
	Reporter.log("WelcomeMenuTologout", true);
	LoginPage lp=new LoginPage(driver); //create a object Login page
	lp.login();
	
	HomePage h=new HomePage(driver); //create a object Home page
	h.Welcome();
	Thread.sleep(1000);
	h.Logout();
	log.info("****************************** End @test execution Test  *****************************************");

}
}
