package bufferReaderWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class First_bufferedWriter_A {

	
	public static void main(String[] args) {
		try{
			FileWriter fw = new FileWriter("D://testing.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Hello");
			bw.newLine();
			bw.write("Hello");
			bw.newLine();
			bw.write("Hello");
			bw.newLine();
			bw.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
