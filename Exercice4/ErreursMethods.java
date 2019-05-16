package Exercice4;

class ErreursMethodes {

	public static void main(String[] args)  { 
	    methode1();
	    methode2();
	    methode3();
	    methode4();
	    methode5();
	    methode6();
	    methode7();
	    methode8();
	  }

	  static int methode1() { //il manquait "()"
	    int a = 0;
	    System.out.println("Méthode 1");
	    return a;
	  }

	  static int methode2 () {
	    int a = 0;
	    //i1 = 10; 
	    System.out.println("Méthode 2");
	    return a;
	  }

	  static int methode3 () {//correction type du retour
	    int a = 0;
	    System.out.println("Méthode 3");
	    return a;//ajout du retour
	  }

	  static int methode4 () {
	    int a = 0; //changement du type de a en int car stocker dans un int
	    System.out.println("Méthode 4");
	    return a;
	  }

	  static double methode5 () {//correction type du retour
	    double a = 0;
	    System.out.println("Méthode 5");
	    return a;
	  }

	  static double methode6 () {//il manquait le type du retour
	    double a = 0;
	    System.out.println("Méthode 6");
	    return a;
	  }

	  static void methode7 () {
	    int a = 0;
	    double b = 5.5;
	    methodeSansErreur(a,b);//Ajout du second parametre "b"
	    System.out.println("Méthode 7");
	  }

	  static void methode8 () {
	    int a = 0;
	    double b = 5.5; //correction du type de b string -> double en accord à la méthode
	    methodeSansErreur(a, b);
	    System.out.println("Méthode 8");
	  }

	  static void methodeSansErreur (int a, double b) {
	    // Cette méthode ne fait rien du tout
	  }

}