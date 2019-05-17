import java.util.Scanner;

/*Entrez x: 1
Entrez y: 2
Avant permutation:
x: 1
y: 2
Après permutation:
x: 2
y: 1*/
public class exercice7 {

	public exercice7() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args){
		Scanner userX = new Scanner(System.in); //Input pour S/s ou P/s
		Scanner userY = new Scanner(System.in);
		System.out.println("Entrez x :");
		String x = userX.nextLine();
		System.out.println("Entrez x :");
		String y = userY.nextLine();
		System.out.println("Avant permutation: \n x :"+x+"\n y :"+y);
		permutation(x,y);
	}
	
	static void permutation(String x,String y) {
		String p = x; //p pour permuteur
		x = y;
		y = p;
		System.out.println("Avant permutation: \n x :"+x+"\n y :"+y);
	}	

}
