package hrm.testcase;

import org.apache.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.Test;

import hrm.base.HrmBaseClass;
import hrm.page.HomePage;
import hrm.page.LoginPage;
import hrm.page.PayGrade;

public class PayGradeTestScript7 extends HrmBaseClass
{
	Logger log = Logger.getLogger(PayGradeTestScript7.class);

	@Test(priority = 1)
	public void HomePagetoPayGrade() throws Exception
	{
		log.info("****************************** Starting test execution Test  *****************************************");
		Reporter.log("HomePagetoPayGrade", true);
		LoginPage lp=new LoginPage(driver);  							  //create a object Login page
		lp.login();
		HomePage hp=new HomePage(driver);   								  //create a object Home page
		Butil.MouseOver(driver, hp.getAdimin());
		Thread.sleep(1000);
		Butil.MouseOver(driver, hp.getMenu_admin_Job());
		Thread.sleep(1000);
		PayGrade PayGrade=new PayGrade(driver);
		Butil.MouseOver(driver,PayGrade.getMenu_admin_viewPayGrades());
		PayGrade.PayGrades();
		PayGrade.PayGradesbtnAdd();
		PayGrade.PayGradeName();
		PayGrade.PayGradebtnSave();
		Butil.MouseOver(driver, hp.getMenu_admin_Job());
		Butil.MouseOver(driver,PayGrade.getMenu_admin_viewPayGrades());
		PayGrade.PayGrades();
		PayGrade.PayGradecheckList();
		PayGrade.PayGradebtnDelete();
		Thread.sleep(1000);
		PayGrade.PayGradedialogDeleteBtn();
		
	}
		
}
