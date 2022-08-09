package hrm.ScreenShot;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import hrm.genric.AutoConstastant;
									//********************** Screenshot Location***********************
public class ScreenShot {
	public void takeScreenshotAtEndOfTest(WebDriver driver, String name) throws IOException 
	{
		Date d=new Date(1);
		
		String CurrrntDate=d.toString().replace(" ","-").replace(":", "-");
		System.out.println(CurrrntDate);
		TakesScreenshot ts = (TakesScreenshot) driver;
			
				File src=ts.getScreenshotAs(OutputType.FILE);
				File dest=new File(AutoConstastant.photoPath+" "+CurrrntDate+name+".png");
						FileUtils.copyFile(src,dest);
				
}

}
