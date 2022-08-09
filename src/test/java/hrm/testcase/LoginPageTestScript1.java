package hrm.testcase;

import org.apache.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

import org.testng.annotations.Test;

import hrm.base.HrmBaseClass;
import hrm.page.LoginPage;
import listener.TestNgListener;


@Listeners(TestNgListener.class)
public class LoginPageTestScript1 extends HrmBaseClass {
	Logger log = Logger.getLogger(LoginPageTestScript1.class);
	@Test
	public void LoginTestScript() throws Exception
	{
		Reporter.log("Login", true);
		log.info("****************************** Starting test execution Test  *****************************************");
		LoginPage lp=new LoginPage(driver); //create a object Login page
		lp.login();
		
	
	}
}
	
	

