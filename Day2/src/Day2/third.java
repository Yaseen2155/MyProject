package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class third {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrsome.driver", "C:\\selenium drivers\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");	
	       ChromeDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com/login");
	       driver.findElement(By.id("email")).sendKeys("abcd");
	       driver.findElement(By.id("pass")).sendKeys("dhdhhdh");
	       driver.findElement(By.id("login button")).click();
	       Thread.sleep(3000);
	       driver.quit();
	

	}
}