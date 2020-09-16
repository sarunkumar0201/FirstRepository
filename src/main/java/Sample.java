import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class Sample {
	
	public static WebDriver driver;
	@BeforeClass
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\JUnit\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/HotelAppBuild2/");
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public static void quitBrowser() {
		driver.quit();
	}
	@Before
	public void startTime() 
	{
		Date d=new Date();
		System.out.println(d);
	}
	@After
	public void endTime() 
	{
		Date d=new Date();
		System.out.println(d);
	}
	
	@Test
	private void tc1() 
	{
		String title = driver.getTitle();
		Assert.assertTrue("Check the title", title.contains("Adactin"));
		
		WebElement uname=driver.findElement(By.id("username"));
		uname.sendKeys("arun5050");
		
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys("6658G0");
		
		WebElement btnLogin=driver.findElement(By.id("login"));
		
		String attribute1 = btnLogin.getAttribute("value");
		Assert.assertEquals("Button Name mismatch", "Login", attribute1);
		
		btnLogin.click();
	}
	@Test
	public void tc2() 
	{
		String title = driver.getTitle();
		Assert.assertTrue("Check the title", title.contains("Search Hotel"));
		
		WebElement dpLoc=driver.findElement(By.id("location"));
		Select sloc=new Select(dpLoc);
		sloc.selectByIndex(5);
		
		WebElement dpHotels=driver.findElement(By.id("hotels"));
		Select shot=new Select(dpHotels);
		shot.selectByIndex(2);
		
		WebElement dpRoomType=driver.findElement(By.id("room_type"));
		Select sroom=new Select(dpRoomType);
		sroom.selectByIndex(1);
		
		WebElement dpAdultRoom=driver.findElement(By.id("adult_room"));
		Select sadu=new Select(dpAdultRoom);
		sadu.selectByIndex(1);
		
		WebElement dpChildRoom=driver.findElement(By.id("child_room"));
		Select schi=new Select(dpChildRoom);
		schi.selectByIndex(1);
		
		WebElement btnSearch=driver.findElement(By.id("Submit"));
		
		String attribute1 = btnSearch.getAttribute("value");
		Assert.assertEquals("Button Name mismatch", "Search", attribute1);
		btnSearch.click();
	}
	@Test
	public void tc3() 
	{
		String title = driver.getTitle();
		Assert.assertTrue("Check the title", title.contains("Select Hotel"));
		
		WebElement rbtn=driver.findElement(By.id("radiobutton_0"));
		rbtn.click();
		
		WebElement btnCont=driver.findElement(By.id("continue"));
		
		String attribute1 = btnCont.getAttribute("value");
		Assert.assertEquals("Button Name mismatch", "Continue", attribute1);
		
		btnCont.click();
	}
	@Test
	public void tc4()
	{
		String title = driver.getTitle();
		Assert.assertTrue("Check the title", title.contains("Book"));
		
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
		
		String attribute1 = btnBookNow.getAttribute("value");
		Assert.assertEquals("Button Name mismatch", "Book Now", attribute1);
		
		btnBookNow.click();
	}
	@Test
	public void tc5() throws InterruptedException 
	{
		Thread.sleep(5000);
		String title = driver.getTitle();
		Assert.assertTrue("Check the title", title.contains("Hotel Booking"));
		WebElement orderNo=driver.findElement(By.id("order_no"));
		String orderNum = orderNo.getAttribute("value");
		System.out.println("Order No: "+orderNum);
	}
}
