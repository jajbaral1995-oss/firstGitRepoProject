package day1_framework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationDemo {
	@BeforeSuite
	public void bsuite() {
		System.out.println("Before Suite Method");
	}
	@BeforeTest
	public void btest() {
		System.out.println("Before Suite Method");
	}
	@BeforeClass
	public void bclass() {
		System.out.println("Before class Methood ");
	}
	@BeforeMethod
	public void bMethod() {
		System.out.println("Before Method ");
	}
	@Test
	public void t1() {
		System.out.println("Test 1");
	}
	@Test
	public void t2() {
		System.out.println("Test 2");
	}
	@AfterMethod
	public void AfterMethod() {
		System.out.println("After Method");
	}
	@AfterClass
	public void AfterClass() {
		System.out.println("After Class");
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("After Test");
	}
	@AfterSuite
	public void AfterSuite() {
		System.out.println("After Suite");

}
	}
