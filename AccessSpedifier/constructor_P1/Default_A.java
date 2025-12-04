package constructor_P1;
/* 	“If you create constructor as DEFAULT, then it’s object 
 	can be created anywhere in same package, but then different 
 	package its object cannot be created.”*/
public class Default_A {

	Default_A(){
		System.out.println("Default Constructor A");
	}
	public static void main(String[] args) {
		Default_A a = new Default_A();
	}
}
