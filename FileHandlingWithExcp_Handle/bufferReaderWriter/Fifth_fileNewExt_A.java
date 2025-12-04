package bufferReaderWriter;

import java.io.File;
/*We can create file with different extension */
public class Fifth_fileNewExt_A {
	
	
	public static void main(String[] args) {
		try{
			File file = new File("D:\\testing.html");
			file.createNewFile();
			File file2 = new File("D:\\testing.png");
			file2.createNewFile();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
