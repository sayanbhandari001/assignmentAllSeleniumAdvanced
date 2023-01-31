import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test(priority = 1)
  public void testngChecka() {
	  System.out.println("Test part    -----------------");
  }
  
  @Test(priority = 2)
  private void testngCheckb() {
	System.out.println("Test part      /////////////////");
}
  @Test(priority = 3)
  private void testngCheckd() {
	System.out.println("Test part    !!!!!!!!!!!!!!!!!!!");
}
  @Test(priority = 4)
  private void testngCheckc() {
	System.out.println("Test part    >>>>>>>>>>>>>>>>>>>");
}
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method testing");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After test lol");
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method test2");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class test na");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class test karo");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before test ok");
  }

  @BeforeGroups
  public void BeforeGroup() {
  	  System.out.println("Before Group");
  }
  @AfterGroups
  public void AfterGroup() {
  	  System.out.println("After Group");
  }
  
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before suite test");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite lol");
  }
  
 

}
