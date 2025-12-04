package P1;


//Inheritance using static import
public class B_SI_Inheritance extends com.java.kalpesh.A_SI_Inheritance {
	
	public static void main(String[] args) {	
		// k is non-static member which can't access in static context 
		//System.out.println(k);
		System.out.println(i);
	}
	public void test(){
		System.out.println(k);
	}

}
