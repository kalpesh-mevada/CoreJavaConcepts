package runTime;

public class FirstNumberFormat_B {	
		
	public static void main(String[] args) {
		String s = "10.4";
		
		float f = Float.parseFloat(s);
		System.out.println("String as float to Float: "+f);		
		try{
			/* string as float can't not possible
			   to convert in integer*/
			int i = Integer.parseInt(s);
			System.out.println("String as float to Integer: "+i);
		}catch(NumberFormatException e){
			System.out.println(e);
		}
		System.out.println("Completed");
	}
}
