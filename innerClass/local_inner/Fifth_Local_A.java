package local_inner;
/*we can create constructor inside local inner class
 	-	outer class object exist for reference of inner class, 
 		we can access outer class constructor */
public class Fifth_Local_A {
	Fifth_Local_A(){
		System.out.println("Outer class constructor");
	}
	class B{
		B() {
			System.out.println("Default inner class constructor");
		}
	}
	public static void main(String[] args) {
		Fifth_Local_A a = new Fifth_Local_A();
		B b = a.new B(); // outer class reference 
	}
}
