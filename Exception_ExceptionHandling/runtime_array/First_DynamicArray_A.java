package runtime_array;
/*	“If you want memory to dynamically increase 
	and decrease, then we create DYNAMIC ARRAY 
	below example.”*/
public class First_DynamicArray_A {
	
	public static void main(String[] args) {
		Object[] a = {10, false
				, 30.2, true};
		for(int i = 0; i < 5; i++){
			try{
				System.out.println(a[i]);
			}catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			
		}
	}
}
