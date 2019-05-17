package Exercice9;
//import java.util.InputMismatchException;
import java.util.Scanner;

/*
 Écrivez un petit programme Java, Degre3.java, vous permettant d'évaluer un polynôme du3ème 
 degré de la forme: ((a+b)/2)x^3 + (a+b)^2 * x^2 + a + b + c

Exemple d'exécution:

Entrez a (int) : 1
Entrez b (int) : 2
Entrez c (int) : 3
Entrez x (double) : 3.5
La valeur du polynôme est : 180.5625

Utilisez Math.pow(a, b) pour calculer des puissances.*/
public class Degre3 {
	
	public Degre3() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[] args){
		Scanner userX = new Scanner(System.in);
		Scanner userA = new Scanner(System.in);
		Scanner userB = new Scanner(System.in);
		Scanner userC = new Scanner(System.in);
		
		System.out.println("Entrez x (double) :");
		Double x = userX.nextDouble();
		System.out.println("Entrez a (int) :");
		int a = userA.nextInt();
		System.out.println("Entrez b (int) :");
		int b = userB.nextInt();
		System.out.println("Entrez c (int) :");
		int c = userC.nextInt();

		//((a+b)/2)x^3 + (a+b)^2 * x^2 + a + b + c
		double valeurPolynome = ((a+b)/2.)*Math.pow(x,3) + Math.pow(a+b,2) * Math.pow(x,2) + a + b + c;
		System.out.println("La valeur du polynôme est :"+ valeurPolynome);
		userX.close();
		userA.close();
		userB.close();
		userC.close();
	}

}
