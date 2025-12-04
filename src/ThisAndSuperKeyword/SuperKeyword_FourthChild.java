package ThisAndSuperKeyword;
/* 
 * Using Super keyword, we can call constructor of parent class, but 
   then we should use super keyword in child class constructor and it 
   should be very first statement.
 */
public class SuperKeyword_FourthChild extends SuperKeyword_FourthParent {

	SuperKeyword_FourthChild() {
		super(); // Very first statement
	}
	public static void main(String[] args) {
		SuperKeyword_FourthChild b = new SuperKeyword_FourthChild();
	}
}
