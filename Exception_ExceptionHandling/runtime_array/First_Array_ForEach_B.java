package runtime_array;
/*Exception with Array index out of bound*/
public class First_Array_ForEach_B {
	
	public static void main(String[] args) {
		
		First_Array_ForEach_B a = new First_Array_ForEach_B();
		int[] b = a.test();
		
		for(int x:b){						
			System.out.println(x);			
		}
	}
	
	public int[] test(){
		int[] a = new int[3];
		try{	
			a[0] = 10;
			a[1] = 20;
			a[2] = 30;
			a[3] = 40;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		return a;
	}
}
