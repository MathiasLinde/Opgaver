import java.util.Random;

public class D6_rolls {
	public static void main(String[] args) {
		
		
		
		for (int i = 0; i <50; i++) {
			Random r = new Random();        // importer Random command fra java.util
			int result2 = r.nextInt(6);        //generer et tal mellem 0-5
			int result1 = r.nextInt(6);        //generer et tal mellem 0-5
			result2++;      // incrementer result2 for at få et tal mellem 1-6 som simulere de 6 sider på en D6
			result1++;      // incrementer result1 for at få et tal mellem 1-6 som simulere de 6 sider på en D6
			System.out.println("You rolled a " +result1);
			// System.out.println printer de to 6-sidet tegninger
			System.out.println("You rolled a " +result2);
			int sum = result1+result2;      // Laver en sum af de to tegninger, dette simulerer de to tegninger der rolles i en tur
			System.out.println("You rolled a sum of "+sum);         // printer summen af de to, altså hvor meget spilleren har slået til sammen




		}
}
}