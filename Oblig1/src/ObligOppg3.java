
import java.util.Scanner;

public class ObligOppg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("tast inn ein verdi for n");
		
		int fakultet = 1;
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		if (n >= 1) {
		
		for (int i = 1 ; i <= n ; i++) {
			fakultet = fakultet*i;
		}
		System.out.println("Resultatet for fakultet av " + n + " = " + fakultet);
		}
		else {
			System.out.println("Ugyldig verdi. Tast inn ein verdi over 0");
		}
	}

}
