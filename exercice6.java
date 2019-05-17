
import java.util.Scanner;  // Import the Scanner class
import java.util.Locale;


public class exercice6 {
	static Double height; //Hauteur
	static Double width;//Largeur
	static Scanner userChoose = new Scanner(System.in); //Input pour S/s ou P/s
	static Scanner myHeight = new Scanner(System.in);// Input pour hauteur
	static Scanner myWidth = new Scanner(System.in);// Input pour Largeur
	
	
	public static void main(String[] args){
		width = askUserWidth();
		height = askUserHeight();
		int i = insistance(width,height);
		if (i==0) {
			System.exit(0);
		}
		myWidth.close();
		myHeight.close();
		userChoose.close();
	}
	//Fonction recursive pour le choix
	public static int insistance(double width,double height) {
		String c = askUserChoose();
		if(c.equalsIgnoreCase("p")) {
			System.out.println("La perimetre est de :"+perimetreCalc(width, height));
		}
		else if(c.equalsIgnoreCase("s")) {
			System.out.println("La surface est de :"+surfaceCalc(width, height));
		}
		else {
			insistance(width,height);
		}
		return 0;
	}
	
	//Demander les valeurs
	public static String askUserChoose() {
		System.out.println("Surface S ou perimètre P ?:");
		String choose = userChoose.nextLine();
		return choose;
	}
	
	public static double askUserHeight() {
		System.out.println("Entrez la hauteur:");
		height = myHeight.nextDouble();
		return height;
	}
	
	public static Double askUserWidth() {
		System.out.println("Entrez la largeur:");
		width = myWidth.nextDouble();
		return width;
	}
	
	//Calculate
	
	static double surfaceCalc(double hauteur,double largeur) {
		double surface = hauteur*largeur;
		return surface;
	}
	
	static double perimetreCalc(double hauteur, double largeur) {
		double peripherique = (hauteur+largeur)*2;
		return peripherique;
	}

}
