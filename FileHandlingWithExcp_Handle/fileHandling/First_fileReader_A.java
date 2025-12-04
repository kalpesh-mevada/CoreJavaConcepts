package fileHandling;

import java.io.FileReader;

// FilReader Example of Reading character from file.
public class First_fileReader_A {
	public static void main(String[] args) {
		try{
			FileReader fr = new FileReader("D://testing.txt");
			// type casting is required for number to char
			//System.out.println((char)fr.read()); // read one char
			
			/* 	hard coded because it's static size 15.
			 * 	if file size extends, then it will skip reading
			 	after 15 char. for that length method use with 
			  	File class only*/
			for(int i = 0; i < 15; i++){
				System.out.print((char)fr.read());
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
