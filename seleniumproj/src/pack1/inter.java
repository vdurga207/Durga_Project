package pack1;

public interface inter {
	
abstract public  void me();
public default void met()
{
	System.out.println("hello");
}
public static void method2()
{
	System.out.println("hi");
}


	

public static void main(String[] args) {
	inter.method2();
	
}
}
