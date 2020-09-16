import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login
{
	public static WebDriver driver;
	
	@Test
	public void tc1() 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\JUnit\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/HotelAppBuild2/");
		driver.manage().window().maximize();
		
		
		WebElement uname=driver.findElement(By.id("username"));
		uname.sendKeys("arun5050");
		
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys("6658G0");
		
		WebElement btnLogin=driver.findElement(By.id("login"));
		btnLogin.click();
	}

}
