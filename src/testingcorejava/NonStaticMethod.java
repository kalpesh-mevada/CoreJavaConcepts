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
public class NonStaticMethod {
    
     public static void main(String[] args) {
         NonStaticMethod d1 = new NonStaticMethod();
         d1.test();
     }
     
     public void test(){
         System.out.println("Non-static Method");
     }
}
