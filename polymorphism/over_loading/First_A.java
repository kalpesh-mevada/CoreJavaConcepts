package over_loading;

// Method Over loading (Compile time polymorphism)
/*	Here we create multiple methods with same name, but then 
 	they are differentiated based on number and type of arguments.*/
public class First_A {

	public void test(){
		System.out.println("Test Method");
	}
	public void test(int a){
		System.out.println(a);
	}
	public void test(int a, int b){
		System.out.println(a);
		System.out.println(b);
	}
	public void test(String s1, String s2){
		System.out.println(s1+" "+s2);
	}
	public static void main(String[] args) {		
		First_A a = new First_A();
		a.test();
		a.test(100);
		a.test(100, 200);
		a.test("Kalpesh" , "Mevada");
	}
}
