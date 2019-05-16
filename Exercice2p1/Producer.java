package Exercice2p1;

public class Producer {

	public int turnover;
	public String firstname;
	public String lastname;
	public int age;
	public String entrer;
	public int salary;

	public Producer(String firstname,String lastname, int age, String entrer, int turnover) {
			this.turnover = turnover;
			this.firstname = firstname;
			this.lastname = lastname;
			this.age = age;
			this.entrer = entrer;
		}

	public int salaryCalc() {
		//Producteur : Son salaire est calculé avec le nombre d'unités produites dans le mois multiplié par un taux fixe de 5
		salary = (int) ((turnover*5));
		return salary;
	}

}
