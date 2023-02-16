import java.util.Scanner;

public class InputDemo {

	public static void main(String[] args) {
		int num1;
		float num2;
		char character;
		boolean bool;
		String str;
		double num3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter integer value");
		num1=sc.nextInt();
		
		System.out.println("Enter float value");
		num2=sc.nextFloat();
		
		System.out.println("Enter character value");
		character=sc.next().charAt(0);
		
		System.out.println("Enter boolean value");
		bool=sc.nextBoolean();
		
		System.out.println("Enter string value");
		str=sc.nextLine();
		
		System.out.println("Enter double value");
		num3=sc.nextDouble();
		
		System.out.println("Integer value is" + num1);
		System.out.println("Float value is" + num2);
		System.out.println("Character value is" + character);
		System.out.println("Boolean value is" + bool);
		System.out.println("String value is" + str);
		System.out.println("Double value is" + num3);
		
		sc.close();

	}

}
