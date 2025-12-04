package Inheritance;

public class First_Child extends First_Parent {

		
	public static void main(String[] args) {
		First_Child b1 = new First_Child();
		System.out.println(b1.i);
		
		/* Static member don't get inherited but 
		   then they give us feel of inheritance
		   - Not inheritance happen for static member.
		   - it's share common memory of class*/
		
		System.out.println(First_Child.j);
	}
}
