package Exercice2p1;

public class WharehousemanWithRisk {

	public int turnover;
	public String firstname;
	public String lastname;
	public int age;
	public String entrer;
	public int salary;

	public WharehousemanWithRisk(String firstname,String lastname, int age, String entrer, int turnover) {
			this.turnover = turnover;
			this.firstname = firstname;
			this.lastname = lastname;
			this.age = age;
			this.entrer = entrer;
		}
		//Vendeur : Son salaire est calculé avec 20% du chiffre d'affaire qu'il a effectué dans le mois, plus une prime fixe de 400€
	public int salaryCalc() {
		salary = (int) ((turnover*65)+200);
		return salary;
	}


}
