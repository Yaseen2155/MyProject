package Day2;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) throws InterruptedException  {
	  
		System.setProperty("webdriver.chrsome.driver", "C:\\selenium drivers\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");	
       ChromeDriver driver = new ChromeDriver();
       System.out.println ("please provide Url name");
       driver.get("https://www.wikipedia.org/");
       Thread.sleep(5000);
       Navigation nav = driver.navigate();
       
     nav.to("https://en.wikipedia.org/wiki/Gmail");
     Thread.sleep(5000);
     	 nav.back();
     Thread.sleep(5000);
     nav.forward();
     Thread.sleep(5000);
     nav.refresh();
     Thread.sleep(5000);
     driver.quit();
     System.out.println ("closed");
	}

}
