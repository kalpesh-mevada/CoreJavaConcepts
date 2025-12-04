package reflexction;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
//import java.lang.reflect.*;

public class Second_Example_Reflection_A {

	public static void main(String[] args) {
		try{
			Class cls = Class.forName("org.openqa.selenium.firefox.FirefoxProfile");
			Constructor[] c = cls.getDeclaredConstructors();
			System.out.println(c[0]);
			Method[] m = cls.getDeclaredMethods();
			System.out.println(m[0]);			
		}catch(Exception e){
			System.out.println(e);
		}	
	}
}
