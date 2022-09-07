
import java.util.Scanner;

public class ObligoppgEin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner input = new Scanner(System.in)){
			System.out.println("kor mykje tener du?");
			int brutto = input.nextInt();
			double sats = 0;
			double resultat = 0;
			if (brutto <= 164100 && brutto >= 0) {
				sats = 1;
				resultat = brutto*sats;
			}
			else if(brutto >= 164101 && brutto <= 230950) {
				sats = 0.9907;
				resultat = brutto*sats;
			}
			else if(brutto >= 230951 && brutto <= 580650) {
				sats = 0.9769;
				resultat = brutto*sats;
			}
			else if(brutto >= 580651 && brutto <= 934050) {
				sats = 0.8848;
				resultat = brutto*sats;
			}
			else if (brutto >= 934051) {
				sats = 0.8548;
				resultat = brutto*sats;
			}
			else if (brutto < 0) {
				System.out.println("Ugyldig verdi.");
				}
			//resultat = brutto*sats;
			System.out.printf("resultat: %.2f", resultat);
		}
		catch(Exception e) {
			//handle exception
			System.out.println("test");
			
		}
	}

}
