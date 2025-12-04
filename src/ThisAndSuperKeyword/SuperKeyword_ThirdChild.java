package ThisAndSuperKeyword;

/*
 * Using super keyword we can access non-static and static member both inside 
   non-static context.
 * Using super keyword we can't access non-static and static member both inside 
   Static context.*/
public class SuperKeyword_ThirdChild extends SuperKeyword_ThirdParent {
	
	public static void main(String[] args) {
		SuperKeyword_ThirdChild b1 = new  SuperKeyword_ThirdChild();
		b1.test();
	}	
	
	public void test(){
		System.out.println("Non-static member of parent: \n"+super.i);
		System.out.println("Static member of parent: \n"+super.j);
	}
}
