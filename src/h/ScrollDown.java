package h;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScrollDown {
  @Test
  public void ScrollPage() {
	  WebDriver driver=new FirefoxDriver();
	  
	  driver.get("http://jqueryui.com/");
	  
	  ((JavascriptExecutor)driver).executeScript("scroll(400,1200)");
}
}