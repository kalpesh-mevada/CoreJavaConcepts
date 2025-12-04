package fileHandling;

//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
/* 	FileOutPutStream requires the content to be converted into
	number using getByte method. */
public class First_fos_A {
	
	public static void main(String[] args) {
		String s = "testing campus";
		// convert string into byte(number)
		byte[] data = s.getBytes();
		try{
		/*	Try Catch mandatory for and FileOutPutStream, 
			if not write, and file not be available it will 
			throw error.*/
		FileOutputStream fos = new FileOutputStream("D://testing.txt");
		System.out.println("Writing into file");
		//System.out.println(data);
		fos.write(data);
		System.out.println("Operation Completed");
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
