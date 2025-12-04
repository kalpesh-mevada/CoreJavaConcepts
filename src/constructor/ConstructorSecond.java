/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author KM-003
 */
public class ConstructorSecond {
	
	public static void main(String[] args) {
		// Constructor only call only if we call by creating object / reference variable
		ConstructorSecond cs = new ConstructorSecond();		
	}
	
	/*The Return type of constructor is always by default void and hence then we can't return value.*/
	public ConstructorSecond() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor B");
		return; // only return keyword used but we can't return any value or string		
	}    
}
