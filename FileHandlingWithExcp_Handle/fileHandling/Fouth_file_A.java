package fileHandling;

import java.io.File;
// Creating Folder
public class Fouth_file_A {

	public static void main(String[] args) {
		try{
			// without extension folder will be created.
			File file = new File("D://kalpesh");
			file.mkdir(); // create directory
			//file.delete(); // delete directory
		}catch(Exception e){
			System.out.println(e);
		}
	}
}