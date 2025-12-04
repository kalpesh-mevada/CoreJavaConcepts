package fileHandling;

import java.io.File;

// File Class is used for delete file.
// Delete File, for that check whether file exist or Not.
public class Second_file_A {
	public static void main(String[] args) {
		try{
		File file = new File("D://kalpesh.txt");
		// Gives Boolean Value if exist, true or else false.
		System.out.println("Exist: " +file.exists());
		//file.delete();
		System.out.println("Delete: "+file.delete());
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
}
