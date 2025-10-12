package day1_framework;

import org.testng.annotations.Test;

public class GroupDemo {

	
		@Test(groups={"Smoke"})
		public void test1() {
			System.out.println("Test 1 {\"Smoke\"}");

	}
		@Test(groups= {"Smoke","Sanity"})
		public void test2() {
			System.out.println("Test 2{\"Smoke\"},{\"Sanity\"})");
		}
		@Test(groups= {"linux.Regression"})
		public void test3() {
			System.out.println("Test 3{\"Regression\"}");
		}
		@Test(groups= {"Regression","Sanity"})
		public void test4() {
			System.out.println("Test 4{\"Regression\",\"Sanity\"})");
		}
		@Test(groups= {"Regression","Smoke"})
		public void test5() {
			System.out.println("Test 5{\"Regression\",\"Smoke\"}");
		}
		@Test(groups= {"Sanity"})
		public void test6() {
			System.out.println("Test 6{\"Sanity\"}");
		}

}
