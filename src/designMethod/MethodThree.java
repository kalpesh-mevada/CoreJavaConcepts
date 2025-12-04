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
public class MethodThree {
    
    public static void main(String[] args) {
        MethodThree mt = new MethodThree();
        System.out.println("Main");
        mt.test1();
    }
    
    public void test1(){
        MethodThree mt2 = new MethodThree();
        mt2.test2();
        System.out.println("From Test 1");
    }
    public void test2(){
        System.out.println("From Test 2");
    }
}
