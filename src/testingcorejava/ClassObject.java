/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingcorejava;

/**
 *
 * @author KM-003
 */
/* "Class is factory which generate an Object"
-  To request a class to generate object size use new key followed by class name with paranthesis : new ClassObject()

"Object is instance of class"
-  Everytime an object is created only non-static member gets loaded into the object or goto the ob.
-  To access the object we store it's memory address in the reference variable.
-  Syntax: ClassName ReferenceVariable = new ClassName();
-  Example: ClassObject co = new ClassObject();
-  Object creation is mandatory to access non-static member.
- Every object created - it creates different address like there is not same one visiting for all building address, so we can use address to go to object*/
public class ClassObject {

    int i = 10; // non-static variable - it can be accessible if object created in memory
    static int j = 20; // static variable - static member created in memory within class and its refer to class
    int k = 40;
    
    public static void main(String[] args) {
        // TODO code application logic here
    	// Non-static member can only be accessible by object
        ClassObject co = new ClassObject();
        System.out.println(co.i);
        System.out.println(co.k);
        
        System.out.println(new ClassObject().j);
        System.out.println(co.j);
        
        // Static member is refer to class and it's loaded within class
        System.out.println(ClassObject.j);
        
        // Memory Address of RefenceVaraible / Object
        System.out.println("Memory Adress of ReferenceVarible: "+co);
        //Memory address of refernce varible is in ClassName@HexadecimalCode
    }
    
}
