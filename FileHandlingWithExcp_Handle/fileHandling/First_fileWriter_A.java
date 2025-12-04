package fileHandling;

import java.io.File;
import java.io.FileWriter;

public class First_fileWriter_A {

	public static void main(String[] args) {
		try{
			String s = "Testing Hello";			
			File file = new File("D://kalpesh.txt");
			FileWriter fw = new FileWriter(file);
			System.out.println(s);
			fw.write(s);
			 // needs to be close after writing
			fw.close(); 
			System.out.println("Size of file is "+file.length()+" byte");
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
