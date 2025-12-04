package ThisAndSuperKeyword;
/*
 * We can’t use “this keyword” and “super keyword” in the same constructor to 
   call another constructor as either of the statement becomes second statement, 
   then we will get an error*/
public class SuperKeyword_EighthParent {
	
	SuperKeyword_EighthParent(){
		System.out.println("Default Constructor");
	}
	
	SuperKeyword_EighthParent(int i){
		System.out.println("Parameterized Constructor: "+i);
	}
}
