package runTime;

public class FirstNumberFormat_A {
	
	public static void main(String[] args) {		
		
		String s1 = "12"; // String as number
		int j = Integer.parseInt(s1);
		System.out.println(j);
		
		String s = "test"; // String as string		
		try{			
			int i = Integer.parseInt(s);
			//Number format Exception
			System.out.println(i); 	
		}catch(NumberFormatException e){
			System.out.println(e);
		}		
	
		System.out.println("Completed");
	}
}
