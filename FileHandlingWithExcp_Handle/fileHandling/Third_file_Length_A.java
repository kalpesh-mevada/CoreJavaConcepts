package fileHandling;

/* 	Example of Check length of file, 
 	if you change content in file , file 
 	size will be change*/ 
import java.io.File;

public class Third_file_Length_A {

	public static void main(String[] args) {
		try{
			File file = new File("D://kalpesh.txt");
			if(!file.exists()){
				file.createNewFile();
			}
			// length gives file size in byte
			System.out.println(file.getName()+" " +
					"file size is "+file.length()+" byte");
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
