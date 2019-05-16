package Exercice2p1;

public class ProducerWithRisk {

	public int turnover;
	public String firstname;
	public String lastname;
	public int age;
	public String entrer;
	public int salary;

	public ProducerWithRisk(String firstname,String lastname, int age, String entrer, int turnover) {
			this.turnover = turnover;
			this.firstname = firstname;
			this.lastname = lastname;
			this.age = age;
			this.entrer = entrer;
		}
		
	public int salaryCalc() {
		//porducteur avec prime de risque
		salary = (int) ((turnover*5)+200);
		return salary;
	}

}
