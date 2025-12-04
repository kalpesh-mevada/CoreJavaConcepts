package compileTime;

import java.io.FileInputStream;

/*Compile Time Exception*/
public class Second_A {

	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("D://kalpesh.txt");
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Completed");
		

	}

}
