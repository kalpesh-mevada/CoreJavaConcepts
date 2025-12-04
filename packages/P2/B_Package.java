package P2;

/*Package within package example.*/
import com.java.kalpesh.A_Package;

public class B_Package{

	public static void main(String[] args) {
		A_Package d1 = new A_Package();
		// Access member of A_Package Class we have to make it public
		System.out.println(d1.k);
	}
}
