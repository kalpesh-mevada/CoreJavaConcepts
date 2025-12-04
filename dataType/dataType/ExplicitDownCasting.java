/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataType;

/*
 - 2. Explicit Down Casting: Converting bigger datatype into smaller datatype is called explicit down casting.
   > During conversion if there is any loss of data, then regardless of memory size, we need to perform explicit down casting.

*/
public class ExplicitDownCasting {    
    
    public static void main(String[] args) {
        System.out.println("EXPLICIT DOWN CASTING\n");
        int ii = 10;
        byte jj = (byte) ii; // Error if you write long j = i;
        
        System.out.println("From Decimal Value of Int-10 to Byte Intger Type Value: "+jj);
        
        long h = 30;
        int k = (int) h; // Error if you write long j = i;
        
        System.out.println("From Decimal Value of long-10 to Int Intger Type Value: "+k);
        
        float i = 10.3f;
        long j = (long) i; // Error if you write long j = i;
        
        System.out.println("From Decimal Value of float-10.3 to Long Intger Type Value: "+j);
        
        float i1 = 10.3f;
        int j1 = (int) i1; // Error if you write long j1 = i1;
        System.out.println("From Decimal Value of float-10.3 to Integer Intger Type Value: "+j1);
        
        long i2 = 200;
        byte j2 = (byte) i2; // Error if you write long j2 = i2; and explicitly we loss the data
        System.out.println("From Decimal Value of long - 200 to Byte Intger Type Value: "+j2);
        
        int i3 = 200;
        long j3 = i3; // In this case no Error if you write long j3 = i3; and explicitly
        System.out.println("From Decimal Value of Int - 200 to Long Intger Type Value: "+j3);
        
        int i4 = 100;
        byte j4 = (byte)(int)i4; // In this case no Error if you write like this
        System.out.println("From Decimal Value of Int - 100 to Byte Integer Type Value: "+j3);
        
       
    }
    
}
