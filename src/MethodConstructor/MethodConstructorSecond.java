/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodConstructor;

/**
 *
 * @author KM-003
 */
public class MethodConstructorSecond {
	
	public MethodConstructorSecond() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor");
	}
	
    public static void main(String[] args) {
    	    	
    	MethodConstructorSecond.test();
    	
    	// constructor will directly call when object is created.
		MethodConstructorSecond mcf = new MethodConstructorSecond();
		mcf.test();
		
		System.out.println("Main");
    }
    
    public static void test(){
    	System.out.println("Test Method");
    }
}
