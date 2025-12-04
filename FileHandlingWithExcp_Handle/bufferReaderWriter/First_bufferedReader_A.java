package bufferReaderWriter;
import java.io.BufferedReader;
import java.io.FileReader;

/*	File class can be used with file reader and FileWriter but then
 	it can not be used with BufferedReader and BufferedWriter directly.
 	
*	Buffered Reader is used to increase the performance and can also 
	read the data line by line.*/
public class First_bufferedReader_A {
	
	public static void main(String[] args) {
		try{
			FileReader fr = new FileReader("D://testing.txt");
			BufferedReader br = new BufferedReader(fr);
			System.out.println(br.readLine());
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
