package Driven;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(priority=1, groups= {"smoke"})
	public void Testcase1()
	{
		System.out.println("Smoke 1 testcase");
	}
	@Test(groups="smoke")
	public void Testcase2()
	{
		System.out.println("Smoke 2 testcase");
	}
	@Test(groups="smoke")
	public void Testcase3()
	{
		System.out.println("Smoke 3 testcase");
	}
	@Test(groups="smoke")
	public void Testcase4()
	{
		System.out.println("Smoke 4 testcase");
	}
	@Test(priority=5, groups= {"sanity"})
	public void Testcase5()
	{
		System.out.println("Smoke 5 testcase");
	}
	@Test(priority=2, groups= {"sanity"})
	public void Testcase6()
	{
		System.out.println("sanity 1  testcase");
	}
	@Test(priority=3, groups= {"sanity"})
	public void Testcase7()
	{
		System.out.println("sanity 2 testcase");
	}
	@Test(priority=4, groups= {"sanity"})
	public void Testcase8()
	{
		System.out.println("sanity 3 testcase");
	}
	@Test(priority=0, groups= {"sanity"})
	public void Dead()
	{
		System.out.println("sanity 4 testcase");
	}

}
