package Exercice2p1;

public class Wharehouseman {

	public int turnover;
	public String firstname;
	public String lastname;
	public int age;
	public String entrer;
	public int salary;

	public Wharehouseman(String firstname,String lastname, int age, String entrer, int turnover) {
			this.turnover = turnover;
			this.firstname = firstname;
			this.lastname = lastname;
			this.age = age;
			this.entrer = entrer;
		}
	public int salaryCalc() {
		//Manutentionnaire : Son salaire est calculé avec le nombre d'heures effectuées dans le mois multiplié par un taux fixe de 65€
		salary = (int) (turnover*65);
		return salary;
	}

}
