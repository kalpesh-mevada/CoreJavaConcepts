package fileHandling;

import java.io.FileInputStream;

/*	FileInputStream is Compile Type Exception
 	which come under FileNotFound Exception
 	if file not there,File not found exception happen.
 	-	try-catch block is mandatory.*/
public class First_fis_A {
	
	public static void main(String[] args) {
		try{
			// it converted file into byte(unicode used) and Read
			// File not exist, Exception will be FileNotFoundException			
			FileInputStream fis = new FileInputStream("D://testing.txt");
			for(int i=0; i<14;i++){ // static read
				//type casting by char otherwise display unicode (Number)
				System.out.print((char)fis.read());
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
