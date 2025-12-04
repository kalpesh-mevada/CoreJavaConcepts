package local_inner;
/*	we can't access member of outer class, by creating object of 
 	inner class with reference of outer class*/ 
public class First_Local_A {
	// outer class member
	int j = 10; 
	//Local Inner Class
	class B{
		int i = 20;
	}
	public static void main(String[] args) {
		//Error:
		//B b = new B();
		First_Local_A a =new First_Local_A();
		B b = a.new B();
		System.out.println(b.i);		
	}
}
