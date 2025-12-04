package enum_class;

/*SIB will run only once*/
public class Seventh_SIB_A {
	enum Days{ // Inner Enum
		MON,TUE,WED,THU,FRI,SAT,SUN;
		//SIB
		static{
			System.out.println("FROM ENUM");
		}
	}
	public static void main(String[] args) {
		Days d = Days.FRI;
	}
	
}
