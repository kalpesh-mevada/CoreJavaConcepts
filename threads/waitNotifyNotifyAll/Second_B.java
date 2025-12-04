package waitNotifyNotifyAll;

public class Second_B extends Thread {
	int balance;
	public void run(){ // will notify
		for(int i=0; i<10000; i++){
			balance = balance + i;
		}
		notify(); // will call synchronized block
	}
}
