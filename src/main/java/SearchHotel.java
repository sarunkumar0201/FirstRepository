import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchHotel
{
	//public static WebDriver driver=new ChromeDriver();
	@Test
	public void tc2() 
	{
		WebDriver driver=Login.driver;
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
		btnSearch.click();
	}
}
