package threadLifeCycle;

public class ThreadSleepState_A {
	public static void main(String[] args) {
		try{
			// sleep will display after 5000
			Thread.sleep(5000);		
			
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Testing");
	}
}
