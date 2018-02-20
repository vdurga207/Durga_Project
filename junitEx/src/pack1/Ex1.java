package pack1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Ex1 {
@BeforeClass
public static void method1()
{
	System.out.println("method1");
}
@AfterClass
public static void method2()
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
