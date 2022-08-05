package hrm.genric;



import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Butil  {
	 public WebDriver driver;
	

public void DropDown(WebElement sele,String text)
{
	Select s=new Select(sele);
	s.selectByVisibleText(text);
	
}

public void MouseOver(WebDriver driver , WebElement MovE)
{
	Actions a=new Actions(driver);
	a.moveToElement(MovE).build().perform();
}
public void DoubleClick(WebDriver driver,WebElement douclk)
{
	Actions a=new Actions(driver);
	a.doubleClick(douclk).build().perform();
}
public void RightClick(WebDriver driver,WebElement rigclk)
{
	Actions a=new Actions(driver);
	a.contextClick(rigclk).build().perform();
}


public  void Frame0 (WebDriver driver)
{
	driver.switchTo().frame(0);

}
public  void Frame1 (WebDriver driver)
{
	driver.switchTo().frame(1);

}
public  void Frameback (WebDriver driver)
{
	driver.switchTo().defaultContent();

}
public void DragDrop(WebDriver driver, WebElement source, WebElement target)
{
Actions a= new Actions(driver);
a.dragAndDrop(source, target).build().perform();
}
public void AlertPopup(WebDriver driver)
{
	driver.switchTo().alert().accept();
}
public void SwitchingTabs(WebDriver driver)
{
Set<String> child = driver.getWindowHandles();
	for(String b:child)
	{
		driver.switchTo().window(b);
	}
}
	public void ScrollBar(int x, int y)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}


}

