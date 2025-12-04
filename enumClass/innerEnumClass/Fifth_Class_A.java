package innerEnumClass;
/*	In Enum we IIB will run depending on number of 
  	constants in enum class, but then SIB 
 	will run only once.*/
public class Fifth_Class_A {
	
	enum Days{ // INNER ENUM
		MON,TUE,WED,THU,FRI,SAT,SUN;
		{
			System.out.println("FROM ENUM");
		}
	}
	
	public static void main(String[] args) {
		Days d = Days.FRI;
	}
}
