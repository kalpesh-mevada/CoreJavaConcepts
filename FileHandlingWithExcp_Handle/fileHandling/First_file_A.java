package fileHandling;

// For creating file, File Class is used
import java.io.File;
import java.io.IOException;
public class First_file_A {

	public static void main(String[] args) {
		// Try catch mandatory for IOException 
		try{
			File file = new File("D://kalpesh.txt");
			//create File in directory or folder
			file.createNewFile(); 
		}catch(IOException e){
			System.out.println(e);
		}
	}
}
