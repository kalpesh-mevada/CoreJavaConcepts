package enum_class;
/*	Enum is group of constants (final)
 *	Every constant in enum is by default public, static and final.
 *	Enum constant must be in similar types
 * 	we can’t create object of enum class.*/
public class First_Class_B {
	public static void main(String[] args) {
		//First_Enum_Days_A days = new First_Class_B();
		First_Enum_Days_A day = First_Enum_Days_A.FRI;
		System.out.println(day);
	}
}
