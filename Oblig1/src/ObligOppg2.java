
import java.util.Scanner;

public class ObligOppg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Karakter = 0;
		Scanner input = new Scanner(System.in);
		
		for (int i = 1 ; i <= 10 ; i++) {
			System.out.println("Kor mykje poeng fikk du?");
			Karakter = input.nextInt();
			

		if (Karakter <= 100 && Karakter >= 90) {
			System.out.println("Karakteren er A");
		}
		else if (Karakter <= 89 && Karakter >= 80) {
			System.out.println("Karakteren er B");
		}
		else if (Karakter <= 79 && Karakter >= 60) {
			System.out.println("Karakteren er C");
		}
		else if (Karakter <= 59 && Karakter >= 50) {
			System.out.println("Karakteren er D");
		}
		else if (Karakter <= 49 && Karakter >= 40) {
			System.out.println("Karakteren er E");
		}
		else if (Karakter <= 39 && Karakter >= 0) {
			System.out.println("Karakteren er F");
		}
		else {
			i--;
			System.out.println("feil input.");
		}
		}

	}

}
