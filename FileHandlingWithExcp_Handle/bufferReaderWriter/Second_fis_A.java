package bufferReaderWriter;

import java.io.FileInputStream;

public class Second_fis_A {

	public static void main(String[] args) {
		try{
			int i = 0; //counter variable
			FileInputStream fis = new FileInputStream("D:\\testing.txt");
			// loop till -1, if -1 value come it will exit.
			while((i = fis.read())!=-1){ 
				//System.out.println(i); // shows number 
				System.out.print((char)i);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
