package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

/*	Linked list is providing dynamic array. and it 
 	stores the data in doubly linked list.
 	-	Iterator can be used for read data from collection.
 	-	hasNext() method of iterator is check weather data
 		is present or not(then null).
 	-	Next() will increment pointer and gives the data, if 
 		not data, then condition false in list.
*/
public class First_LL_A {
	public static void main(String[] args) {
		LinkedList al = new LinkedList();
		// Heterogeneous data
		al.add(10);
		al.add("kalpesh");
		al.add(10.3);
		Iterator itr = al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}		
		System.out.println(al);
	}
}
