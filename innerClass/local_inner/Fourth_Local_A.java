package local_inner;
/*Static member can’t be used inside local inner class.*/
public class Fourth_Local_A {
	static int j = 20;
	class B{
		//Error:
		//static int i = 10;
		/*public static void test(){
			System.out.println("test static method");
		}*/
	}
	public static void main(String[] args) {
		Fourth_Local_A a = new Fourth_Local_A();
		B b = a.new B();
		//ERROR:
		//System.out.println(b.i);		
		//b.test();		
	}
}
