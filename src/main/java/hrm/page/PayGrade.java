package hrm.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayGrade {
	//**************************Pay Grades*****************************
	
	@FindBy(id = "menu_admin_viewPayGrades")
	WebElement menu_admin_viewPayGrades;

	public WebElement getMenu_admin_viewPayGrades() {
		return menu_admin_viewPayGrades;
	}
	
	@FindBy(xpath = "//a[text()='Pay Grades']")
	WebElement payGrades;
	public void PayGrades()
	{
		payGrades.click();
	}
	
	@FindBy(id = "btnAdd")
	WebElement paygradebtnAdd;
	public void PayGradesbtnAdd()
	{
		paygradebtnAdd.click();
	}
	
	@FindBy(name = "payGrade[name]")
	WebElement payGradename;
	public void PayGradeName()
	{
		payGradename.sendKeys("ramsam");
	}
	
	@FindBy(name = "btnSave")
	WebElement payGradebtnSave;
	public void PayGradebtnSave()
	{
		payGradebtnSave.click();
	}
	@FindBy(name = "chkSelectAll")
	WebElement payGradecheckList;
	public void PayGradecheckList()
	{
		payGradecheckList.click();
	}
	@FindBy(name = "btnDelete")
	WebElement paygradebtnDelete;
	public void PayGradebtnDelete()
	{
		paygradebtnDelete.click();
	}
	
	@FindBy(xpath = "//input[@id='dialogDeleteBtn' and @value='Ok']")
	WebElement paygradedialogDeleteBtn;
	public void PayGradedialogDeleteBtn()
	{
		paygradedialogDeleteBtn.click();
	}
	
	
	
	//*********************************intiElement******************
	public PayGrade(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
