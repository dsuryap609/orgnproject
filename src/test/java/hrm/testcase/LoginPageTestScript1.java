package hrm.testcase;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import hrm.base.HrmBaseClass;
import hrm.page.LoginPage;

public class LoginPageTestScript1 extends HrmBaseClass {
	Logger log = Logger.getLogger(LoginPageTestScript1.class);
	@Test
	public void LoginTestScript() throws Exception
	{
		log.info("****************************** Starting test execution Test  *****************************************");
		LoginPage lp=new LoginPage(driver);
		lp.login();
		
	
	}
}
	
	

