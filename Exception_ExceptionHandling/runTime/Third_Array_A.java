package runTime;

/* 	Array by default get same value when we don't
	initialize*/
public class Third_Array_A {
	public static void main(String[] args) {
		int[] a = new int[4];
		a[0] = 10;
		a[1] = 100;
		a[2] = 1000;
		/* here we use length for get value 
		dynamically if size change
		,in static way i < 4 */
		for(int i = 0; i<a.length;i++){			
			System.out.println(a[i]);			
		}
	}
}
