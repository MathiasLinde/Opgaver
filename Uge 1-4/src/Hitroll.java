import java.util.Random;
import java.util.Scanner;

public class Hitroll {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Number of attacks?");
		int A = scan.nextInt();
		
		for (int i = 0; i < A ; i++) {
			Random r = new Random();
			int result = r.nextInt(6);
			result++;
			
			scan.close();
			
			System.out.println("You rolled " +result);
		
	}
}
}