package UniaryOperator;

public class MethodWithUnaryOperator {

	
	public static void main(String[] args) {
		MethodWithUnaryOperator n = new MethodWithUnaryOperator();
		int j = n.test();
		System.out.println("PRE INCREMENT METHOD RETURN VALUE: "+j);
		
		int k = n.test2();
		System.out.println("POST INCREMENT METHOD RETURN VALUE: "+k);
	}
	
	//PRE-INCREMENT RETURN USING METHOD
	public int test(){
		int i = 0;
		return ++i; //++0 return 1
	}
	//POST-INCREMENT RETURN USING METHOD
	public int test2(){
		int i = 0;
		return i++; //0++ return 0
		
	}

}
