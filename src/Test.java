import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		
		arr2[0] = 4;
		arr2[1] = 5;
		arr2[2] = 6;
		arr2[6] = 7;
		
		System.out.println("arr1: " + Arrays.toString(arr1));
		System.out.println("arr2: " + Arrays.toString(arr2));

	}

}
