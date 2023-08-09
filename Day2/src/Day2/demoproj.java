package Day2;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class demoproj {
public static void main(String[] args) throws InterruptedException {}
public WebDriver driver=null; //common for all method to access
@BeforeTest
public void befortest() { // 1st method
System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\drivers\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
}
@Test(priority = 1)
public void test() throws InterruptedException
{
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.get("https://demo.nopcommerce.com/");
driver.manage().window().maximize();
System.out.println(driver.findElement(By.xpath("//h2")).getText());
Thread.sleep(3000);
driver.findElement(By.linkText("Register")).click();
WebElement cr = driver.findElement(By.id("customerCurrency"));
Select select4 = new Select(cr);
select4.selectByVisibleText("Euro");
driver.findElement(By.xpath("//input[@id='gender-male']")).click();
driver.findElement(By.name("FirstName")).sendKeys("Yaseen");
driver.findElement(By.name("LastName")).sendKeys("M");
WebElement ele = driver.findElement(By.name("DateOfBirthDay"));
Select select = new Select(ele);
select.selectByValue("16");
WebElement ele1 = driver.findElement(By.name("DateOfBirthMonth"));
Select select1 = new Select(ele1);
select1.selectByValue("08");
WebElement ele2 = driver.findElement(By.name("DateOfBirthYear"));
Select select2 = new Select(ele2);
select2.selectByValue("1997");
driver.findElement(By.id("Email")).sendKeys("yaseenmomin2155@gmail.com");
driver.findElement(By.id("Company")).sendKeys("abcd");
driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
driver.findElement(By.id("Password")).sendKeys("Password");
driver.findElement(By.id("ConfirmPassword")).sendKeys("Password");
driver.findElement(By.id("register-button")).click();
driver.findElement(By.linkText("Log in")).click();
}
@Test(priority = 2)
public void login() throws InterruptedException
{
driver.findElement(By.id("Email")).sendKeys("yaseenmomin2155@gmail.com");
driver.findElement(By.id("Password")).sendKeys("Password");
driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
Thread.sleep(3000);
}
@Test(priority = 2)
public void serach() throws InterruptedException
{
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
WebElement cr = driver.findElement(By.id("customerCurrency"));
Select select5 = new Select(cr);
select5.selectByVisibleText("Euro");
Thread.sleep(3000);
}
@Test(priority = 3)
public void addproduct() throws InterruptedException
{
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.findElement(By.xpath("//a[contains(@title,'Show products in category Electronics')]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//a[contains(@title,'Show products in category Cell phones')]")).click();
Thread.sleep(3000);
driver.findElement(By.linkText("HTC One Mini Blue")).click();
Thread.sleep(3000);
driver.findElement(By.id("add-to-wishlist-button-19")).click();
Thread.sleep(3000);
System.out.println(driver.findElement(By.xpath("//p[contains(text(),'The product has been added to your')]")).getText());

Thread.sleep(3000);
}
@Test(priority = 4)
public void wishlist() throws InterruptedException
{
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.findElement(By.xpath("//span[@class='wishlist-label']")).click();
Thread.sleep(3000);
driver.findElement(By.name("addtocart")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//button[@class='button-2 wishlist-add-to-cart-button']")).click();
Thread.sleep(3000);
String product = driver.findElement(By.linkText("HTC One Mini Blue")).getText();
System.out.println(product);
driver.findElement(By.linkText("HTC One Mini Blue")).click();
Thread.sleep(3000);
String cart = driver.findElement(By.linkText("HTC One Mini Blue")).getText();
System.out.println(cart);
Thread.sleep(3000);
Assert.assertEquals(product, cart);
}
@Test(priority = 5)
public void shipping() throws InterruptedException
{
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.findElement(By.xpath("//span[@class='cart-label']")).click();
Thread.sleep(5000);
WebElement str = driver.findElement(By.xpath("//input[@class='qty-input']"));
str.clear();
str.sendKeys("2");
System.out.println(driver.findElement(By.xpath("//strong[text()='Discount Code']")).getText());
Thread.sleep(5000);
System.out.println(driver.findElement(By.xpath("//div[text()='Enter your coupon here']")).getText());
driver.findElement(By.name("discountcouponcode")).sendKeys("abcds");
 Thread.sleep(5000);
driver.findElement(By.id("applydiscountcouponcode")).click();
 Thread.sleep(5000);
System.out.println(driver.findElement(By.xpath("//div[text()='Enter gift card code']")).getText());
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@name=\"giftcardcouponcode\"]")).sendKeys("ashfg");
Thread.sleep(5000);
driver.findElement(By.xpath("//button[@name=\"applygiftcardcouponcode\"]")).click();
Thread.sleep(5000);
driver.findElement(By.id("termsofservice")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//button[@id='checkout']")).click();
 Thread.sleep(5000);
}
@Test(priority = 6)
public void checkout() throws InterruptedException
{
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.findElement(By.xpath("//input[@type='checkbox']")).click();
driver.findElement(By.xpath("//input[@id='BillingNewAddress_Company']")).sendKeys("abcd");
Thread.sleep(5000);
WebElement el = driver.findElement(By.xpath("//select[@data-trigger='country-select']"));
Thread.sleep(5000);
Select sel = new Select(el);
Thread.sleep(5000);
sel.selectByVisibleText("India");
Thread.sleep(5000);
WebElement el1 = driver.findElement(By.xpath("//select[@id=\"BillingNewAddress_StateProvinceId\"]"));
Thread.sleep(5000);
Select sel1 = new Select(el1);
Thread.sleep(5000);
sel1.selectByVisibleText("Other");
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@id=\"BillingNewAddress_City\"]")).sendKeys("Bengalore");
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@id=\"BillingNewAddress_Address1\"]")).sendKeys("#100");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id=\"BillingNewAddress_Address2\"]")).sendKeys("2nd Street");
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@id=\"BillingNewAddress_ZipPostalCode\"]")).sendKeys("4563890");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id=\"BillingNewAddress_PhoneNumber\"]")).sendKeys("90182375");
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@id=\"BillingNewAddress_FaxNumber\"]")).sendKeys("90182375");
Thread.sleep(6000);
driver.findElement(By.xpath("//button[@onclick=\"Billing.save()\"]")).click();
Thread.sleep(6000);
}
@Test(priority = 7)
public void orderconfirm() throws InterruptedException
{
driver.findElement(By.xpath("//button[@onclick=\'Billing.save()\']")).click();
Thread.sleep(5000);
System.out.println(driver.findElement(By.xpath("//label[contains(text(),'Select a billing address fromyouraddress bookor enter a new address.')]")).getText());

Thread.sleep(5000);
Thread.sleep(5000);
driver.findElement(By.xpath("//button[@onclick=\"ShippingMethod.save()\"]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//button[@onclick=\"PaymentMethod.save()\"]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//button[@onclick=\"PaymentInfo.save()\"]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//button[@onclick=\"ConfirmOrder.save()\"]")).click();
Thread.sleep(5000);
System.out.println(driver.findElement(By.xpath("//h1")).getText());
Thread.sleep(5000);
System.out.println(driver.findElement(By.xpath("//strong[text()='Your order has been successfullyprocessed!']")).getText());

Thread.sleep(5000);
}
@AfterTest
public void qut()
{
driver.quit();
}
}

}