package Day2;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class firsttestng {
  @Test
  public void f() {
	  System.out.println("hi");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("A");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("B");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("C");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("D");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("E");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("F");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("G");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("H");
  }

}
