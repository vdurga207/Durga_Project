package pack1;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Ex2 {
	@Before
	public  void method1()
	{
		System.out.println("method1");
	}
	@After
	public void method2()
	{
		System.out.println("method2");
	}
	@Test
	public  void method3()
	{
		System.out.println("method3");
	}
	@Test
	public  void method4()
	{
		System.out.println("method4");
	}
}
