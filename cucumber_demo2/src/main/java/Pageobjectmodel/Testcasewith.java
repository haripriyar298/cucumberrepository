package Pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Testcasewith {
	@Test
	public void func()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Haripriya\\Selinum jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		pompagefactory locateElements=PageFactory.initElements(driver, pompagefactory.class);
		locateElements.loginMethod("aravind.guggilla57@gmail.com", "aravind");
	}

}
