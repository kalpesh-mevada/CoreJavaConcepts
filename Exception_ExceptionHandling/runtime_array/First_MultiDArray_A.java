package runtime_array;
// THREE DIMENSIONAL ARRAY
public class First_MultiDArray_A {

	public static void main(String[] args) {
		int[][][] a = new int[20][30][40];
		a[0][0][0] = 10;
		a[0][0][1] = 100;
		a[0][0][2] = 100;
		
		System.out.println(a.length);
		System.out.println(a[0].length);
		// it can't possible to get z axis.
		System.out.println(a[1].length); 
		System.out.println(a[5].length);
				
	}

}
