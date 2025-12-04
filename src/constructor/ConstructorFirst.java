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
/*
 * ==== CONSTRUCTOR ====
 - Constructor should have same name as that Class Name
 - Constructor will execute when an object is created.
 - We can create multiple constructor in the same class provided they are differentiated based on the number of argument and type of argument.

 - We can't write constructor in main method.
 - We can't write constructor inside Constructor.
 - The return type of Constructor is always void and hence we can use only return keyword in it but the we can't return value.
   whereas method can be void or it can be return value.
*/
public class ConstructorFirst {

    ConstructorFirst() { // Default Constructor 
        // ConstructorOne conO = new ConstructorOne(); StackOverFlowError we can't initialize object in Constructor
        System.out.println("ConstructorOne");
        // return 30; we can't, by default it is void
        // return; we can only write return keyword
    }
    ConstructorFirst(int x) { // parameterized Constructor 
        System.out.println("Parameterized Constructor with One Argument" +x);
        // return;
    }
    
    ConstructorFirst(int x, int y) { // we can overloading parameterized Constructor with different argument.
        
        System.out.println("Parameterized Constructor with Two Argument as Integer : "+x+" , "+y);
    }
    ConstructorFirst(String st, int k) { // we can overloading parameterized Constructor with different argument.
        
        System.out.println("Parameterized Constructor with Two Argument String and Integer : "+st+" , "+k);
    } 
    public static void main(String[] args) {
        //Number of object created constructor will call.
        ConstructorFirst co = new ConstructorFirst();
        ConstructorFirst co1 = new ConstructorFirst();
        ConstructorFirst co2 = new ConstructorFirst();
        
        ConstructorFirst co3 = new ConstructorFirst(100);
        ConstructorFirst co4 = new ConstructorFirst(100,200);
        
        ConstructorFirst co5 = new ConstructorFirst("Test String",200);
    }
   
    
}
