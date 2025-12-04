package tryCatchFinally;

import java.io.FileInputStream;

/*	CASE 1: If File Input Stream object with file is Not found,
 			then finally will not execute in try block.
 	CASE 2: If File Input Stream object with file is not open,
 			then, how can finally will not execute in catch block.
 	CASE 3: If File Input Stream object is null, then how can finally 
 	        will execute. Example Below*/
public class Second_Finally_A {

	static FileInputStream fis;
	public static void main(String[] args) {
		try{
			fis = new FileInputStream("D://testing.txt");
			System.out.println(fis.read());
			//fis.close(); //Case 1
		}catch(Exception e){
			//fis.close(); //Case 2
			System.out.println(e);
		}finally{
			// Case 3:
			try{
				if(fis!=null){
					fis.close();
				}
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
}
