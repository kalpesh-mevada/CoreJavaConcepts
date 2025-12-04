package runtime_array;
/*Class name with Array*/
public class First_ClassArray_A {
	public static void main(String[] args) {
		First_ClassArray_A[] a = new First_ClassArray_A[3];
		
		First_ClassArray_A a1 = new First_ClassArray_A();
		First_ClassArray_A a2 = new First_ClassArray_A();
		First_ClassArray_A a3 = new First_ClassArray_A();
		
		a[0] = a1;
		a[1] = a2;
		a[2] = a3;
		
		System.out.println("--For Each Loop--");
		for(First_ClassArray_A b:a){
			System.out.println(b);
		}
		
		System.out.println("--For Loop--");
		for(int i = 0; i<a.length; i++){
			System.out.println(a[i]);
		}
		
	}
}
