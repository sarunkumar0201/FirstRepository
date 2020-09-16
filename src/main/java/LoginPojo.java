import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

	public class LoginPojo extends LibGlobal1
	{
		public LoginPojo() 
		{
			PageFactory.initElements(driver, this);
		}
		@CacheLookup
		@FindBys({
			@FindBy(xpath="//input[@id='username']"),
			@FindBy(xpath="//input[@name='username']")
		})
		private List<WebElement> uname;
		
		@FindAll({
			@FindBy(xpath="//input[@id='password']"),
			@FindBy(xpath="//input[@name='passwo']")
		})
		private List<WebElement> pass;
			
		@FindBys({
			@FindBy(xpath="//input[@id='login']"),
			@FindBy(xpath="//input[@name='login']")
		})
		private List<WebElement> btnLogin;

		public List<WebElement> getUname() 
		{
			return uname;
		}

		public List<WebElement> getPass() 
		{
			return pass;
		}

		public List<WebElement> getBtnLogin() 
		{
			return btnLogin;
		}


}
