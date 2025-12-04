package enum_class;
/*ACCESS ALL VALUE OF ENUM CLASS USING VALUES METHOD*/
public class Third_Class_B {
	public static void main(String[] args) {
		//Enum value store in array
		Third_Enum_Month_A[] m = Third_Enum_Month_A.values();
		for(int i=0; i<m.length; i++){
			System.out.println(m[i]);
		}
		System.out.println("---------FOR EACH LOOP--------");
		for (Third_Enum_Month_A month : m) {
			System.out.println(month);
		}
	}
}
