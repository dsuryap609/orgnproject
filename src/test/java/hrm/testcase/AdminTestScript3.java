package hrm.testcase;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import hrm.base.HrmBaseClass;
import hrm.page.AdminPages;
import hrm.page.HomePage;
import hrm.page.LoginPage;
import listener.TestNgListener;

@Listeners(TestNgListener.class)
public class AdminTestScript3 extends HrmBaseClass {
	Logger log = Logger.getLogger(AdminTestScript3.class);

	@Test(priority = 1)
	public void Adimtouser() throws Exception
	{
		log.info("****************************** Starting test execution Test  *****************************************");
		Reporter.log("Adimtuser", true);
		LoginPage lp=new LoginPage(driver); 							//create a object Login page
		lp.login();
		HomePage hp=new HomePage(driver);  									//create a object Home page
		Butil.MouseOver(driver, hp.getAdimin());
		Butil.MouseOver(driver, hp.getUserManagement());
		hp.Systemuserclick();
	}
	@Test(priority = 2)
	public void User_System() throws Exception
	{
		log.info("****************************** Starting test execution Test  *****************************************");
		Reporter.log("User_System", true);
		LoginPage lp=new LoginPage(driver);  							  //create a object Login page
		lp.login();
		HomePage hp=new HomePage(driver);   								  //create a object Home page
		Butil.MouseOver(driver, hp.getAdimin());
		Thread.sleep(1000);
		Butil.MouseOver(driver, hp.getUserManagement());
		Thread.sleep(1000);
		hp.Systemuserclick();
		Thread.sleep(1000);
		AdminPages AdminPage=new AdminPages(driver); 						  //create a object Admin page
		AdminPage.AdUsername();
		AdminPage.getAddropdown();
		AdminPage.AdEmployee_name();
		AdminPage.SearchBtn();
		
	}
	@Test(priority = 3 )
	public  void CheckBox() throws Exception
	{
		Reporter.log("CheckBox", true);
		log.info("****************************** Starting test execution Test  *****************************************");
		LoginPage lp=new LoginPage(driver);   										//create a object Login page
		lp.login();
		HomePage hp=new HomePage(driver);    										//create a object Home page
		Butil.MouseOver(driver, hp.getAdimin());
		Butil.MouseOver(driver, hp.getUserManagement());
		hp.Systemuserclick();
		AdminPages AdminPage=new AdminPages(driver);  								 //create a object Admin page
		
		List<WebElement> list = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(list.size());
		for(WebElement li : list)
		{
			System.out.println(li.getText());
		}
		AdminPage.ChkSelectAll();
		
		
	}
	
}
