/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataType;

/**
 *
 * @author KM-003
 */

/*
DataType : 
 - Type Casting - converting a perticular datatype into required datatype is called as TypeCasting.
 - 1. Auto Up Casting - "Converting smaller datype into bigger datatype without any lose of data 
    is called Auto Up Casting"
    -> Whenever there is loss of data during conversion regardless of memory size up casting can’t happen.
 - 2. Explicit Down Casting
*/
public class AutoUpCasting {
    
     public static void main(String[] args) {
         int i = 10;
         long j = i; // here auto type-casting in integer type long - 8 memory size, int - 4 memory size
         System.out.println("Auto Type Casting From Integer to long Integer: "+j);
         
         byte i1 = 30;
         short j1 = i1;
         System.out.println("Auto Type Casting From Integer type byte to short Integer: "+j1);
         
         /*Whenever there is loss of data during conversion regardless of memory size up casting can't happen.
         */
         long i2 = 1000;
         byte j2 = (byte) i2; // Error if you write like this byte j2 = i2;
         System.out.println("Auto Type Casting From long type long(8) to byte(1) Integer: "+j2);
                  
         
         
         
     }
}
