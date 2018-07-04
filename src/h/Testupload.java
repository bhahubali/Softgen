package h;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;


	public class Testupload {

	    public static void main(String[] args) throws InterruptedException {
	        // TODO Auto-generated method stub
	        System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
	        WebDriver d = new FirefoxDriver();
	        d.get("http://gmail.com/");
	        d.findElement(By.xpath("//*[@name='identifier']")).sendKeys("reddyhemanth081");
	        d.findElement(By.className("CwaK9")).click();
	        Thread.sleep(5000);
	        d.findElement(By.xpath("//*[@name='password']")).sendKeys("h8147359220");
	        d.findElement(By.className("CwaK9")).click();
	        Thread.sleep(5000);
	        //d.findElement(By.id(":31")).click();
	        //WebElement  w = d.findElement(By.xpath("//*[@class='aSK J-J5-Ji aYr']"));
	        //w.click();
	        d.findElement(By.className("z0")).click();
	        Thread.sleep(5000);
	        d.findElement(By.xpath("//*[@alt='Pop-out']")).click();
	        Thread.sleep(5000);
	        d.findElement(By.xpath("//*[@name='to']")).sendKeys("reddyhemanth081@gmail.com");
	        d.findElement(By.xpath("//*[@name='subjectbox']")).sendKeys("resume");
	        Thread.sleep(5000);
	        d.findElement(By.xpath("//*[@class='a1 aaA aMZ']")).sendKeys("S:\\Project Folder\\sandeep Exp Resume Automation\\ResumeSandeep.doc");
	       
	      
	        //Thread.sleep(5000);
	        //d.findElement(By.xpath("//*[@id=':m1']")).click();
	        //d.findElement(By.partialLinkText("resume")).click();
	        //d.findElement()
	    }

	}


