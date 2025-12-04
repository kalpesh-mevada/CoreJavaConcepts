package waitNotifyNotifyAll;

public class First_A {
	
	public static void main(String[] args) {
		Second_B b1 = new Second_B();
		// complete execution
		b1.start(); // start will start run
		 
		synchronized(b1){
			try{
				// if encountered, it will halt main
				b1.wait();
			}catch(Exception e){
				System.out.println(e);
			}
		}
		System.out.println(b1.balance);
	}
}
