package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.cssSelector("#highlight-addons"))).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("SpiceMax")).click();
	}

}
