package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.cfm?CFID=2044386&CFTOKEN=50316935&jsessionid=3e302b16e75a1b0d7c735463e71763d2d351");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("umadeshpande");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("");
		driver.switchTo().frame("mainpanel");
		driver.findElement(arg0)
		
	}

}
