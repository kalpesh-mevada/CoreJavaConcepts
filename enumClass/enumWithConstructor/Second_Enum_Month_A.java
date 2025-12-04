package enumWithConstructor;

public enum Second_Enum_Month_A {
	JAN(31),FEB(28),MAR(31),APR(30);
	
	int days;
	//Constructor with Enum
	Second_Enum_Month_A(int days){
		this.days = days;
	}
}
