package mutableObject;
/*Mutable object are the one whose value keep changing.*/
public class First_Muttable_A {
	int age; //setAge() , getAge()
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		First_Muttable_A a = new First_Muttable_A();
		a.setAge(20);
		System.out.println(a.getAge());
	}
}
