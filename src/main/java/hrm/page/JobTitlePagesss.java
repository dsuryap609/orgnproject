package hrm.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hrm.base.HrmBaseClass;

public class JobTitlePagesss {
	HrmBaseClass HrmBaseClass = new HrmBaseClass();
	//******************************JobTilesPages*******************************
	@FindBy(id = "btnAdd")	
	WebElement btnAdd;
	public void BtnAdd()
	{
		btnAdd.click();
	}
		

	@FindBy(id = "jobTitle_jobTitle")
	WebElement jobTitle_jobTitlename;

	@FindBy(id = "jobTitle_jobDescription")
	WebElement jobTitle_jobDescription;

	@FindBy(id = "jobTitle_jobSpec")
	WebElement jobTitle_jobSpec;

	@FindBy(id = "jobTitle_note")
	WebElement jobTitle_note;
	public void Note()
	{
		jobTitle_note.sendKeys("sdfnskfn");
	}

	@FindBy(id = "btnSave")
	WebElement btnSave;

	public void Jobtitlename() throws Exception
	{
		jobTitle_jobTitlename.sendKeys(HrmBaseClass.pdata.getpropertyData("jobtitlename")); /// Getting jobtitlename
		
		
	}
	public void jobDescription() throws Exception
	{
		try {
			jobTitle_jobDescription.sendKeys(HrmBaseClass.pdata.getpropertyData("jobDescription"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} /// Getting password
	}
	
	public void JobTitle_jobSpec() throws Exception
	{
		jobTitle_jobSpec.sendKeys("C:\\Users\\GLB-185\\Downloads\\2022-8-8-18-43-31.html");
	}
	public void btnSave() throws Exception
	{
		btnSave.click();
	}
	public JobTitlePagesss(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
