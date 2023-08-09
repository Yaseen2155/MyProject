package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrsome.driver", "C:\\selenium drivers\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");	
	       ChromeDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com/login");
	       driver.findElement(By.cssSelector("input[Placeholder=\"Email.address or Phone number\"]")).sendKeys("scghsh");
	       

}
}
