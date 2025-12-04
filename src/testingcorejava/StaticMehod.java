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
public class StaticMehod {
    
    
     public static void main(String[] args) {
        
         // Static member and method will get loaded in class common memory
         StaticMehod.staticMethod();
     }
     
     public static void staticMethod(){
         System.out.println("Static Method");
     }
}
