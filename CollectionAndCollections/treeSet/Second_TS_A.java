package treeSet;

import java.util.TreeSet;
// TreeSet contain only homogeneous data
public class Second_TS_A {

	public static void main(String[] args) {
		TreeSet s = new TreeSet();
		// Heterogeneous Data
        s.add(10);
        s.add("testing");
        s.add(50); 
        s.add(50);
        s.add(15);
        System.out.println(s);
	}
}
