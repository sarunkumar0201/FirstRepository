import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectHotel 
{
	@Test
	public void tc3() 
	{
		WebDriver driver=Login.driver;
		WebElement rbtn=driver.findElement(By.id("radiobutton_0"));
		rbtn.click();
		
		WebElement btnCont=driver.findElement(By.id("continue"));
		btnCont.click();
	}
	
}
