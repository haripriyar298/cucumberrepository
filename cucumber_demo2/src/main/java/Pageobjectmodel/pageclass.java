package Pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageclass {
WebDriver driver;
By lnc = By.linkText("Log in");
By uname=By.name("Email");
By pwd = By.name("Password");
By lin=By.xpath("//input[@value='Log in']");
public pageclass(WebDriver driver)
{
	this.driver=driver;
	
}
public void clicklink()
{
	driver.findElement(lnc).click();
	
}
public void typeuname(String username)
{
	driver.findElement(uname).sendKeys("aravind.guggilla57@gmail.com");
	
}
public void typepassword(String password)
{
	driver.findElement(pwd).sendKeys("aravind");
	
}
public void clickonloginlyn() {
	driver.findElement(lin).click();
}

}
