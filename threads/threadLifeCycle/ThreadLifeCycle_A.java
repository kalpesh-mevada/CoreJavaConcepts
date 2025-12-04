package threadLifeCycle;
// Thread life cycle:
/* 	Thread concept are use for server side implementation 
 	to build application.
 	-	To see current state of thread we use get state method
 		of Thread class.*/
public class ThreadLifeCycle_A extends Thread{
	
	public void run(){
		System.out.println("Running");
	}
	
	public static void main(String[] args) {
		ThreadLifeCycle_A a = new ThreadLifeCycle_A();
		System.out.println(a.getState()); // NEW
		a.start(); // RUNNING but 5000 ms, thread stop
		System.out.println(a.getState()); // RUNNABLE
		try{
		// after 5000 milliseconds,thread will be terminate.
			Thread.sleep(5000);
			
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println(a.getState()); // TERMINATE
	}
}