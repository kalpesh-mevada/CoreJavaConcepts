package runtime_array;

public class First_ObjectArray_A {
	
	public static void main(String[] args) {
		
		Object[] a = new Object[5];
		//a[0] = "test"; // String value
		a[0] = false;
		a[1] = 10;  // Integer Value
		a[2] = 10.4; // float value
		a[3] = true; // Boolean value
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}

}
