package Inheritance;

public class Fourth2_Child extends Fourth1_Child {
	
	public void testFourth2_Child(){
		System.out.println("Test Fourth2_Child");
	}
	public static void main(String[] args) {
		
		Fourth2_Child c = new Fourth2_Child();		
		System.out.println("Parent Class: "+c.i); 	
		System.out.println("Fourth1_Child Class: "+c.j); 	
		
		c.testFourth_Parent();
		c.testFourth1_Child();
		c.testFourth2_Child();
	}
}
