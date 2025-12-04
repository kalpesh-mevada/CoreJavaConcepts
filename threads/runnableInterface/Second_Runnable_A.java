package runnableInterface;
/*	creating a thread using Runnable Interface. 
- 	Which thread will execute for how much time can’t be predicted 
	by programmer as it is decided by the processor depending 
	on its availability.*/
public class Second_Runnable_A implements Runnable {

	// it should be override incomplete method
	@Override
	public void run() { 
		for(int i = 0; i<1000; i++){
			System.out.println("Tast 1");
		}
	}
	
	public static void main(String[] args) {
		Second_Runnable_A a = new Second_Runnable_A();
		// argument as runnable object
		Thread thread = new Thread(a); 
		thread.start();
		
		for(int i=0; i<1000; i++){
			System.out.println("Task 2");
		}
	}	
}
