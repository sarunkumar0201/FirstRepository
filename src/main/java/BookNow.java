import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BookNow 
{
	//public static WebDriver driver=new ChromeDriver();
	@Test
	public void tc4()
	{
		WebDriver driver=Login.driver;
		WebElement fname=driver.findElement(By.id("first_name"));
		fname.sendKeys("Arun");
		
		WebElement lname=driver.findElement(By.id("last_name"));
		lname.sendKeys("Kumar");
		
		WebElement baddr=driver.findElement(By.id("address"));
		baddr.sendKeys("Coimbatore");
		
		WebElement ccno=driver.findElement(By.id("cc_num"));
		ccno.sendKeys("4567890123456789");
		
		WebElement ccType=driver.findElement(By.id("cc_type"));
		Select scctype=new Select(ccType);
		scctype.selectByIndex(2);
		
		WebElement ccExpMon=driver.findElement(By.id("cc_exp_month"));
		Select sccexpm=new Select(ccExpMon);
		sccexpm.selectByIndex(6);
		
		WebElement ccExpYr=driver.findElement(By.id("cc_exp_year"));
		Select sccexpy=new Select(ccExpYr);
		sccexpy.selectByIndex(8);
		
		WebElement ccCvv=driver.findElement(By.id("cc_cvv"));
		ccCvv.sendKeys("123");
		
		WebElement btnBookNow=driver.findElement(By.id("book_now"));
		btnBookNow.click();
	}
}
