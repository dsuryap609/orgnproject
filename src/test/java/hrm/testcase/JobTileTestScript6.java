package hrm.testcase;

import org.apache.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.Test;

import hrm.base.HrmBaseClass;
import hrm.page.HomePage;
import hrm.page.JobTitlePagesss;
import hrm.page.LoginPage;

public class JobTileTestScript6 extends HrmBaseClass{
	Logger log = Logger.getLogger(JobTileTestScript6.class);

	@Test(priority = 1)
	public void AdimtouserToJobTile() throws Exception
	{
		log.info("****************************** Starting test execution Test  *****************************************");
		Reporter.log("AdimtouserToJobTile", true);
		LoginPage lp=new LoginPage(driver);  							  //create a object Login page
		lp.login();
		HomePage hp=new HomePage(driver);   								  //create a object Home page
		Butil.MouseOver(driver, hp.getAdimin());
		Thread.sleep(1000);
		Butil.MouseOver(driver, hp.getMenu_admin_Job());
		Thread.sleep(1000);
		Butil.MouseOver(driver, hp.getJobtitles());
		hp.Menu_admin_viewJobTitleList();
		
		
		JobTitlePagesss JobTitlePag=new JobTitlePagesss(driver);
		
		JobTitlePag.BtnAdd();
		JobTitlePag.Jobtitlename();
		JobTitlePag.jobDescription();
		JobTitlePag.JobTitle_jobSpec();
		JobTitlePag.Note();
		JobTitlePag.btnSave();
		Thread.sleep(5000);
		
		
		
		
}
}
