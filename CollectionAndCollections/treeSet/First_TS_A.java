package treeSet;
import java.util.TreeSet;

/*	Collections can't use because data is already \
 	sorted in tree set
 	-	Tree set contain unique element only like HasSet.
 	-	Maintain ascending order.
 	-	TreeSet contains only homogeneous data*/
public class First_TS_A {
	
	public static void main(String[] args) {
		TreeSet s = new TreeSet();
        s.add(10);
        s.add(5);
        s.add(50); 
        s.add(50);
        s.add(15);
     /*  tree set contain only homogeneous data.
         If Heterogeneous data, then it gives 
         ClassCastException: */
        System.out.println(s);
        TreeSet set = new TreeSet();
        set.add("xyz");
        set.add("abc");
        set.add("testing");
        set.add("test");
        System.out.println(set);
	}
}
