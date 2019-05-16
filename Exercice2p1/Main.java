package Exercice2p1;


public class Main {
	  public static void main(final String[] args) {
	    final Staff myEmployees = new Staff();
	    myEmployees.add(new Salesman("Pierre", "Business", 45, "1995", 30000));
	    myEmployees.add(new Representant("Léon", "Ventout", 25, "2001", 20000));
	    myEmployees.add(new Producer("Yves", "Ahalouest", 28, "1998", 1000));
	    myEmployees.add(new Wharehouseman("Jeanne", "Stoktout", 32, "1998", 45));
	    myEmployees.add(new ProducerWithRisk("Jean", "Flippe", 28, "2000", 1000));
	    myEmployees.add(new WharehousemanWithRisk("Al", "Abordage", 30, "2001", 45));
	    
	    myEmployees.displaySalaries();
	    myEmployees.displayAverageSalary();
	  }
	}
/*Résultat attendu :

Liste des salaires des employés :
	L'employé Pierre Business a un salaire de 6400 €
	L'employé Léon Ventout a un salaire de 4800 €
	L'employé Yves Ahalouest a un salaire de 5000 €
	L'employé Jeanne Stoktout a un salaire de 2925 €
	L'employé Jean Flippe a un salaire de 5200 €
	L'employé Al Abordage a un salaire de 3125 €

Valeur du salaire moyen : 4575 €*/