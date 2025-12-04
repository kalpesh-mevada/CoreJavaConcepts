package anonymous_inner;
/*	Anonymous class can inherit the member of local 
 	inner class as well*/
public class Fourth_Anony_A {
	class B{
		int i = 10;
		public void testB(){			
			System.out.println("Test B");
		}
	}
	public static void main(String[] args) {
		
		Fourth_Anony_A a = new Fourth_Anony_A();
		B b = a.new B(){	
		};	
		System.out.println(b.i);
		b.testB();		
	}
}
