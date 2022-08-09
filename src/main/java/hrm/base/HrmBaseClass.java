package hrm.base;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;

import hrm.ScreenShot.ScreenShot;
import hrm.genric.Butil;
import hrm.genric.PropertyFile;


public class HrmBaseClass {
	
	ExtentReports extent;
	public  WebDriver driver;
	public PropertyFile pdata=new PropertyFile();
	public Butil Butil=new Butil();
	//public static WebEventListener eventListener;

	Logger log=Logger.getLogger(HrmBaseClass.class);
	
/*	@org.testng.annotations.BeforeTest
	public void BeforeTest()
	{
		extent = new ExtentReports(System.getProperty("user.dir")+"D:\\Eclip\\Orangehrm\\ExtendReportfolder/MyOwnReport.html",true);
		extent.addSystemInfo("Host Name", "LocalHost");
		extent.addSystemInfo("Environment", "QA");
		extent.addSystemInfo("USe name", "Surya");
		extent.loadConfig(new File(System.getProperty("user.dir")+"D:\\Eclip\\Orangehrm\\Resource\\testing.xml"));
	}*/
	
@BeforeMethod
public void oppApp() throws Exception
{
	log.info("****************************** Starting test cases execution BeforeMethod  *****************************************");
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\GLB-185\\\\eclipse-workspace\\\\automation\\\\driver\\\\chromedriver.exe");
			 log.info("****************************** Luaunching bowser  *****************************************");
			driver=new ChromeDriver();   //lu chrome
			
			driver.manage().window().maximize();	//window max
		
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			
			
			 log.info("****************************** getting url  *****************************************");
			driver.get(pdata.getpropertyData("url"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
			log.info("entering application URL");
			log.warn("Hey this just a warning message");
			log.fatal("hey this is just fatal error message");
			log.debug("this is debug message");
			
			 log.info("****************************** getting Title  *****************************************");
			String title = driver.getTitle();
			System.out.println(title);
			Assert.assertEquals("OrangeHRM",title);
			log.info("login page title is--->"+title);
		
			 log.info("******************************  getCurrentUrl  *****************************************");
			String getcurrentUrl = driver.getCurrentUrl();
			System.out.println(getcurrentUrl);
		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Implicitly waiting Statement
			
			
}


@AfterMethod
public void CloseApp(ITestResult res) throws Exception
{
	int status=res.getStatus();
	String name=res.getName();
	if(status==2)
	{
		 log.info("****************************** Taking a Screenshot  *****************************************");
		ScreenShot s = new ScreenShot();
		s.takeScreenshotAtEndOfTest(driver,name);
		
	
	}
	log.info("****************************** End test cases execution AfterMethod  *****************************************");
	driver.quit(); //quit all windows
}
}