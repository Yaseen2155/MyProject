package Day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class second {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrsome.driver", "C:\\selenium drivers\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");	
	       ChromeDriver driver = new ChromeDriver();
	       driver.get("https://www.wikipedia.org/");
	       System.out.println ("Hello");
	       driver.manage().window().maximize();
	       
	       org.openqa.selenium.Dimension ele = driver.manage().window().getSize();
	       System.out.println(ele);
	       Thread.sleep(3000);
	       System.out.println("closed");
	       
	}

}
