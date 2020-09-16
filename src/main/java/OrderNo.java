import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrderNo extends BookNow
{
	//public static WebDriver driver=new ChromeDriver();
	@Test
	public void tc5() throws InterruptedException 
	{
		Thread.sleep(5000);
		WebDriver driver=Login.driver;
		WebElement orderNo=driver.findElement(By.id("order_no"));
		String orderNum = orderNo.getAttribute("value");
		System.out.println("Order No: "+orderNum);
	}

}
