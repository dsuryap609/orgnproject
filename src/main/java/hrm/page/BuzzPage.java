package hrm.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hrm.base.HrmBaseClass;

public class BuzzPage extends HrmBaseClass{
	///////*********************************update Status**********************
	@FindBy(name = "createPost[content]")  //update status
	WebElement upadeStatus;
	
	public void UpdateStatus() throws Exception
	{
		upadeStatus.sendKeys(pdata.getpropertyData("updateStatus"));
	}
	
	@FindBy(id = "postSubmitBtn")			//submit Button
	WebElement postSubmitBtn;
	public void PostSubmitBtn() throws Exception
	{
		postSubmitBtn.click();
	}
	
	
	@FindBy(id = "video-tab-label")  // video label
	WebElement video_label;
	public void Video_label_link() throws Exception
	{
		video_label.click();
	}
	
	@FindBy(id = "createVideo_content")			// video create
	WebElement createVideo_content;
	public void CreateVideo_content() throws Exception
	{
		createVideo_content.sendKeys("https://www.youtube.com/watch?v=QYnEcmUpv0E");
		createVideo_content.click();
	}
	
	@FindBy(xpath = "//input[@class='submitBtn btnSaveVideo']") //submit button
	WebElement btnSaveVideo;
/*	public void BtnSaveVideo() throws Exception
	{
		
		btnSaveVideo.click();
	}*/
	/////**********************initElement**********************
	public BuzzPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
