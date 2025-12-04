/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designMethod;

/**
 *
 * @author KM-003
 */
public class MethodFourth {
    public static void main(String[] args) {
        /* static method will get loaded in common memory of class, so it can't access using object*/
        MethodFourth.test1(); 
        //Non-Static method
        MethodFourth mf = new MethodFourth();
        mf.test2();
        System.out.println("Hello");                
       
    }
    public static void test1(){
        System.out.println("From Static Method Test 1");
    }
    public void test2(){
        System.out.println("From Method Test 2");
    }
}
