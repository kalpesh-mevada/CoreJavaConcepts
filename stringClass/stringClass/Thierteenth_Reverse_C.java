package stringClass;
/*Reverse “run” from given string “Testing time run”.*/
public class Thierteenth_Reverse_C {
	static String reverse = " ";
	static String temp = null;
	public static void main(String[] args) {
		String s1 = "run Time call";// Time call run
		String[] d = s1.split(" ");

		if(d[0].equals("run")){
			for(int i = d[0].length()-1; i >=0; i--){
				reverse = reverse + d[0].charAt(i);
			}
			temp = reverse + " "+ d[1] + " "+d[2];
		}
		if(d[1].equals("run")){
			for(int i = d[1].length()-1; i >=0; i--){
				reverse = reverse + d[1].charAt(i);
			}
			temp = d[0] + " "+ reverse + " "+d[2];
		}
		if(d[2].equals("run")){
			for(int i = d[2].length()-1; i >=0; i--){
				reverse = reverse + d[2].charAt(i);
			}
			temp = d[0] + " "+ d[1] + " "+reverse;
		}
		System.out.println(temp);
	}
}
