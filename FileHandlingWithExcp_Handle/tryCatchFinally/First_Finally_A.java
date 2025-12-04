package tryCatchFinally;

/* 	Finally is extension of try catch block.
 * 	Anything kept in finally will execute regardless
 	of exception.
 * 	We use finally very often to perform close operation.*/
public class First_Finally_A {
	public static void main(String[] args) {
		try{
			int i = 10/0; // 10/10 still work
		}catch(Exception e){
			System.out.println(e);
		}finally{
			System.out.println("I will always run");
		}
	}
}
