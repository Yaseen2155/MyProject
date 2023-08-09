package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fifth {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrsome.driver", "C:\\selenium drivers\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");	
	       ChromeDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://demo.actitime.com/login.do");
	       driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("tjjtj");
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//input[@name=\"username\"]")).clear();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("qjqjqjq");
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//input[@name=\"absmiddle\"]")).clear();
	       System.out.println("closed");
	       

	}

}
