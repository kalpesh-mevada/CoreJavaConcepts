package ThisAndSuperKeyword;

public class ThisKeyword_Seventh {

	int i =10 ; //Non-static variable
	
	ThisKeyword_Seventh() {
		this(100); // Call parameterized constructor using this keyword from constructor.
		System.out.println("DEFAULT CONSTRUCTOR");
	}	
	
	
	ThisKeyword_Seventh(int i){
		this.i = i;
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		ThisKeyword_Seventh a = new ThisKeyword_Seventh();
		
	}

}
