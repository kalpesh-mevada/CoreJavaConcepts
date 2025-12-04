package genericClass;
/*	Generic class helps us to create a variable such that any 
 	kind of value can be store in the variable as the datatype
  	of the variable is decided based on the kind of value is 
 	stored in it.”*/
public class First_A <Z> {
	Z i; // generic type value can store any datatype value
	public static void main(String[] args) {
		First_A a = new First_A();
		a.i = 10.3; // decimal
		a.i = 10; // integer
		a.i = 10.7f; // float
		
		System.out.println(a.i);
	}
}
