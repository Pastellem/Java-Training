import java.util.Scanner;  // Import the Scanner class

public class exercice1 {
	public static void main(String[] args) {
		
		 Scanner myInt = new Scanner(System.in);  // Create a Scanner object
		 Scanner myExit = new Scanner(System.in);
		 System.out.println("Veuillez entrer un nombre"); // Le programme doit demander à l'utilisateur de saisir un nombre
		 // Read user input
		 String userNumber = myInt.nextLine(); 
		 String userEnter = myExit.nextLine();
		 //Tant que l'utilisateur ne saisi pas 'exit' :
		 if(userEnter.length()!="exit".length()) {
			 try {//Analyser la saisie et vérifier qu'elle correspond à un nombre entier
				 int i = Integer.parseInt(userNumber);
				 System.out.println("C'est un entier");//  Si c'est ok, afficher des informations sur le nombre saisi
				 userEnter = myExit.nextLine();
				 //  Afficher si le nombre est positif, négatif ou zéro
				 if(userEnter.length()!="exit".length()) {
					 if(i >= 0) {
						 System.out.println("Votre chiffre est positivement positif");
			        }
					 else if(i==0) {
						 System.out.println("Votre chiffre est 0");

					 }
					 else {
						 System.out.println("Votre chiffre est négativement négatif");
					 }
				 }
				 else {
					 System.out.println(userEnter);
					 System.exit(0); 
				 }
				 userEnter = myExit.nextLine();
				//Afficher si le nombre est pair ou impair (zéro est pair)
				 if(userEnter.length()!="exit".length()) {
					 if(i%2==0){
					 System.out.println("Votre chiffre est pair");
					 }
				 else {// Si ce n'est pas le cas, afficher un message d'erreur
					 System.out.println("Error : Oh non, le nombre n'est pas pair =<");
					 System.exit(0); 
				 	}
				 }
				 
			 }
			 catch (Exception e) {
				 System.out.println("Je ne suis pas un entier, et alors ca te derange ?");
				 System.exit(0); 
			 }
		 }
		 else {
			 System.exit(0); 
		 }
		 myExit.close();
		 myInt.close();
	}
}


