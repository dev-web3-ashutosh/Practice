import java.util.Scanner;

public class StudlyCaps {

	public static void main(String[] args) {
		
		String input, output = "";
		int ascii;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter input string");
		input = sc.nextLine();
		
		for(int i=0; i<input.length(); i++) {
			ascii = input.charAt(i);
			
			if(i%2 == 0) {
				if(ascii>=65 && ascii<=90) {
					ascii += 32;
					output += (char) ascii;
				}
				else {
					output += (char) ascii;
				}
			} //end if
			else {
				if(ascii>=97 && ascii<=122) {
					ascii -= 32;
					output += (char) ascii;
				}
				else {
					output += (char) ascii;
				}
			} //end else
		} //end for
		
		System.out.println("Input string in studly caps is:");
		System.out.println(output);
		
		sc.close();

	}

}
