package hrm.testcase;

import org.apache.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import hrm.base.HrmBaseClass;
import hrm.page.BuzzPage;
import hrm.page.HomePage;
import hrm.page.LoginPage;
import listener.TestNgListener;


@Listeners(TestNgListener.class)
public class BuzzTestScript4 extends HrmBaseClass {
	Logger log = Logger.getLogger(BuzzTestScript4.class);
	@Test(priority = 1)
public void Buzz() throws Exception
{
		
	log.info("****************************** Starting test execution Test  *****************************************");
	Reporter.log("Buzz", true);
	LoginPage lp=new LoginPage(driver); 			//create a object Login page
	lp.login();
	HomePage hp=new HomePage(driver); 				//create a object Home page
	hp.BuzzClick();
}
	@Test(priority = 2)
public void Buzz1() throws Exception
{
		
	log.info("****************************** Starting test execution Test  *****************************************");
	Reporter.log("Buzz1", true);
	LoginPage lp=new LoginPage(driver); 			//create a object Login page
	lp.login();
	HomePage hp=new HomePage(driver);   			//create a object home page
	hp.BuzzClick();
	BuzzPage buzzpage=new BuzzPage(driver); 			//create a object buzz page
	buzzpage.UpdateStatus();
	buzzpage.PostSubmitBtn();
	Thread.sleep(5000);
}
	@Test(priority = 3)
public void Buzz2() throws Exception
{
		
	log.info("****************************** Starting test execution Test  *****************************************");
	Reporter.log("Buzz2", true);
	LoginPage lp=new LoginPage(driver); 		 //create a object Login page
	lp.login();
	HomePage hp=new HomePage(driver);    		//create a object Home page
	hp.BuzzClick();
	BuzzPage buzzpage=new BuzzPage(driver); 		 //create a object Buzz page
	buzzpage.Video_label_link();
	buzzpage.CreateVideo_content();
	//buzzpage.BtnSaveVideo();
	Thread.sleep(1000);
}
}
