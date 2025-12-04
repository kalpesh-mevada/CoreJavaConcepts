package threadSynchronization;
/*	When two threads are operating on a common data in a non-synchronized 
 	manner, then the data will get corrupted*/
public class First_ThreadSynch_A {
	int balance;
	
	public static void main(String[] args) {
		First_ThreadSynch_A a = new First_ThreadSynch_A();
		a.account();
		System.out.println(a.balance);
	}
	private void account() {
		/* Anonymous inner class Runnable which helps us to create 
		multiple thread. */
		Thread t1 = new Thread(new Runnable() {			
			@Override
			public void run() {
				add();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				sub();
			}			
		});
		t1.start();
		t2.start();
		try{
			t1.join();
			t2.join();
		}catch(Exception e){
			System.out.println(e);
		}
	}

	private void add() {
		for(int i = 0; i<=10000; i++){
			balance = balance + i;
		}
	}
	private void sub() {
		for(int i = 0; i<=10000; i++){
			balance = balance - i;
		}
	}
}
