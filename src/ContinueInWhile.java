
public class ContinueInWhile {

	public static void main(String[] args) {
		int i=1;
		while(i<=10) {
			System.out.println("Test");
			if(i==3) {
				continue;
			}
			System.out.println(i);
			i++;
		}
		System.out.println("Out of loop");
	}

}
