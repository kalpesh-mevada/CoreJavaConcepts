package businessCondtion;
/*	Assert helps us to check the business condition only 
 	if the business condition is true, assert will continue 
 	the program execution. but if condition is false, 
 	then assert is not going to continue.
 	-	Run Dropdown > Run Configration > Argument > VM Argument 
 		by applying -ea and -da check the result*/
public class First_Assert_A {
	
	public static void main(String[] args) {
		int age = 10;
		assert age>20;
		System.out.println("Register your self");
	}
}
