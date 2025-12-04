package fileHandling;
import java.io.File;
import java.io.FileReader;
/*	
 * 	File Class help us to count the number of character in
 	a given file whereas FileReader will help us to read the 
 	content of file
 *	File Class in this example helps to build for loop 
 	dynamically.*/
public class First_file_fileReader_A {

	public static void main(String[] args) {
		try{
			File file =  new File("D://kalpesh.txt");
			//check length
			//System.out.println(file.length()); 
			FileReader fr =  new FileReader(file);
			for(int i = 0; i < file.length(); i++){
				System.out.print((char)fr.read());
			}
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
