package MethodConstructor;


/*
 * Method can have same name as that of ClassName
 * A Constructor can never have return type- (return keyword only used without any value.)*/
public class MethodConstructorForth {

		
	public int MethodConstructorForth() {
		// TODO Auto-generated constructor stub
		return 30; // if return any value, then only possible Method same name as class name
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MethodConstructorForth h = new MethodConstructorForth();
			System.out.println("Main");
			
			h.MethodConstructorForth();
	}

}
