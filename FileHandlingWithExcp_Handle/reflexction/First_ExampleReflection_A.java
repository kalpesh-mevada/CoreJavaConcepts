package reflexction;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/*	The major drawback of reflection is it reduce the
 	security of the program.*/
public class First_ExampleReflection_A {

	public static void main(String[] args) {
		try{
			Class cls = Class.forName("reflection.Class_A");
			Field[] f = cls.getDeclaredFields();
			System.out.println(f[0]);
			Method[] m = cls.getDeclaredMethods();
			System.out.println(m[0]);
			Constructor[] c = cls.getDeclaredConstructors();
		}catch(ClassNotFoundException e){
			System.out.println(e);
		}		
	}
}
