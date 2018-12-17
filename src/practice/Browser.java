package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Downloads\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","D:\\Downloads\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Google")) {
			System.out.println("Correct Title");
		}
		else {
			System.out.println("In-correct Title");
		}
		
		
		
		
		  
		
		

	}

}
