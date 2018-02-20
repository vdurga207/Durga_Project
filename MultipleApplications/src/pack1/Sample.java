package pack1;
enum seson2{winter,summer,rainy,spring,fall,cold}
public class Sample {
	static {System.out.println("static2");}
public void method1()
{
	System.out.println("method1");}


Sample()
{
	System.out.println("Constructor");
}
 
static {System.out.println("static1");}




{System.out.println("instance block1");}

{System.out.println("instance blok2");}



		public static void main(String[] args) {
			Sample s=new Sample();
		
			for (seson2 s1:seson2.values())
				System.out.println(s1);
			s.method1();

		}

		
	}


