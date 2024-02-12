package Essai;
import java.util.Scanner;




public class HelloJava {

	public static void main(String[] args) {
		
		// Programme pour voter
		Scanner sc = new Scanner (System.in);
		System.out.println("Pour savoir si vous pouvez voter, entrez votre age");
		int age = sc.nextInt();
		System.out.println("Votre age : " + age + " ans");		
		if (age < 18) {
			System.out.println("Vous ne pouvez pas voter, quel dommage !");
		}else {
		System.out.println("Oui, tu peux voter.");
		System.out.println("Maintenant, as-tu la nationalité du pays ? Clique o pour oui et n pour non" );
		sc.nextLine();
		String reponse = sc.nextLine();
		if (reponse.equals("o")) {
			System.out.println("Votre réponse est : oui");
			System.out.println("Vous avez la nationalité" + " et vous avez " + age + " ans, donc vous pouvez voter");
		}else if (reponse.equals("n")){
			System.out.println("Votre réponse est : non");
			System.out.println("Vous n'avez pas la nationalité, alors vous ne pouvez pas voter");
		}else {
		System.out.println("Reponse inconnu, relancez le programme !");
		}
		}
	}
}


