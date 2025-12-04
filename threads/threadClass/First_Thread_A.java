package threadClass;
/*	Here we inherit the run method from thread class and then 
 	we override in user defined class. 
 -	To start run thread we use start method of thread class.
 -	Run method is user define thread, whereas main method is 
	default thread, it always main method thread runs first and 
	then the user defined thread.
-	Which thread will execute for how much time can’t be predicted 
	by programmer as it is decided by the processor depending 
	on its availability.
 		*/
public class First_Thread_A extends Thread {
	
	@Override
	public void run(){
		for(int i=0; i < 1000; i++){
			System.out.println("Tast 1");
		}
	}
	
	public static void main(String[] args) {
		First_Thread_A a = new First_Thread_A();
		a.start();
		
		for(int i=0; i < 1000; i++){
			System.out.println("Tast 2");
		}
	}
}
