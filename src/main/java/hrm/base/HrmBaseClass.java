package hrm.base;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import hrm.ScreenShot.ScreenShot;
import hrm.genric.Butil;
import hrm.genric.PropertyFile;

public class HrmBaseClass {
	
	public  WebDriver driver;
	public PropertyFile pdata=new PropertyFile();
	public Butil Butil=new Butil();
	//public static WebEventListener eventListener;

	Logger log=Logger.getLogger(HrmBaseClass.class);
	
@BeforeMethod
public void oppApp() throws Exception
{
	log.info("****************************** Starting test cases execution BeforeMethod  *****************************************");
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\GLB-185\\\\eclipse-workspace\\\\automation\\\\driver\\\\chromedriver.exe");
			 driver=new ChromeDriver();   //lu chrome
			driver.manage().window().maximize();	//window max
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			driver.get(pdata.getpropertyData("url"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			
}

@AfterMethod
public void CloseApp(ITestResult res) throws Exception
{
	int status=res.getStatus();
	String name=res.getName();
	if(status==2)
	{
		ScreenShot s = new ScreenShot();
		s.takeScreenshotAtEndOfTest(driver,name);
	
	}
	log.info("****************************** End test cases execution AfterMethod  *****************************************");
	driver.quit();
}
}