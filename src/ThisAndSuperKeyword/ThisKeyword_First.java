package ThisAndSuperKeyword;

public class ThisKeyword_First {

	int i = 10;
	
	public static void main(String[] args) {
		ThisKeyword_First a = new ThisKeyword_First();
		System.out.println(a.i);
		
		System.out.println(a);  // here object "a" will give the current memory address of object, both memory address will be same
		a.test();
	}
	
	public void test(){
		System.out.println(this.i);
		System.out.println(this); // here "this" will give the current memory address of object
	}

}
