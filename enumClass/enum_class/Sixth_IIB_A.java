package enum_class;

public class Sixth_IIB_A {
	
	enum Days{ // Inner Enum
		MON,TUE,WED,THU,FRI,SAT,SUN;
		//IIB
		{
			System.out.println("FROM ENUM");
		}
	}
	public static void main(String[] args) {
		Days d = Days.FRI;
	}
	
}
