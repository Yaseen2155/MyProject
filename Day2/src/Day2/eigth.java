package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class eigth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrsome.driver", "C:\\selenium drivers\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");	
	       ChromeDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("http //omayo.blogspot.com/");
	       driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("tjjtj");

	}

}
