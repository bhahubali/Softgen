package h;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewTest {
	public WebDriver d;
  @Test(priority =1)
  public void statr1() {
	  d= new FirefoxDriver();
	  d.get("https://www.fincart.com");
	  }
  @Test(priority =2)
  public void sinup() throws InterruptedException{
	  Thread.sleep(5000);
	  d.findElement(By.xpath(".//*[@id='topdiv']/header/div/div[1]/div[3]/div/div[1]/a[1]")).click();
	  Thread.sleep(5000);
	  d.findElement(By.xpath(".//*[@type='email']")).sendKeys("reddysandeep356@gmail.com");
	  d.findElement(By.xpath(".//*[@id='mobilectrl']")).sendKeys("9035422431");
	  d.findElement(By.xpath(".//*[@id='passwordctrl']")).sendKeys("9035422431");
	  d.findElement(By.xpath(".//*[@id='topdiv']/div/header/div/div[2]/div/div/div/div[1]/div[2]/div[7]/div/div[2]")).click();
  }
  @Test(priority =3)
  public void afterregesteration() throws InterruptedException{
	  Thread.sleep(5000);
	Select s1 = new Select(  d.findElement(By.xpath("//*[@id='categoryctrl']")));
	s1.selectByIndex(2);
  }
}