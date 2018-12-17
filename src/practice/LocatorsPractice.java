package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorsPractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://reg.ebay.com/reg/PartialReg?acntType=personal");
		//driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Uma");
		//driver.findElement(By.cssSelector("#lastname")).sendKeys("Deshpande");
		//driver.findElement(By.name("email")).sendKeys("umadeshpande31@gmail.com");
		//driver.findElement(By.id("PASSWORD")).sendKeys("pass@123");
		//driver.findElement(By.xpath("//li[@role='presentation']")).click();
		//driver.findElement(By.linkText("Sign in")).click();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail&hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		Select select = new Select(driver.findElement(By.xpath("//div[@class='MocG8c B9IrJb LMgvRb KKjvXb']")));
		select.selectByVisibleText("Dansk");

	}

}
