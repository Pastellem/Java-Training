package Exercice2p1;
import java.util.ArrayList;

public class Staff {
	public ArrayList<Integer> allSalary = new ArrayList<Integer>();
	public ArrayList<String> lastname = new ArrayList<String>();
	public ArrayList<String> firstname = new ArrayList<String>();
	
	public Staff() {}
	public void afficherClasse() {
		System.out.println("Classe A");
	}
	public void displaySalaries() {
		//exemple: L'employé Pierre Business a un salaire de 6400 €
		System.out.println("Liste des salaires des employés :");
		int size = allSalary.size();
		for (int i = 0; i < size; i++) {
		System.out.println("\tL'employé "+firstname.get(i)+" "+lastname.get(i)+" a un salaire de "+allSalary.get(i)+"€");
		}
	}
	
	public void displayAverageSalary() {
		//Affiche le salaire moyen
		int totalSalary=0;
		int size = allSalary.size();
		for (int i = 0; i < size; i++) {
			totalSalary += allSalary.get(i);
		}
			
		System.out.println("\nValeur du salaire moyen :" + totalSalary/size+"€");
	}
	
	//Ajout des salaires à la liste Salaire pour chaque poste
	public void add(Salesman salesman) {
		allSalary.add(salesman.salaryCalc());
		lastname.add(salesman.lastname);
		firstname.add(salesman.firstname);
	}

	public void add(Representant representant) {
		allSalary.add(representant.salaryCalc());
		lastname.add(representant.lastname);
		firstname.add(representant.firstname);
		
	}

	public void add(Producer producer) {
		allSalary.add(producer.salaryCalc());
		lastname.add(producer.lastname);
		firstname.add(producer.firstname);
		
	}

	public void add(Wharehouseman wharehouseman) {
		allSalary.add(wharehouseman.salaryCalc());
		lastname.add(wharehouseman.lastname);
		firstname.add(wharehouseman.firstname);
	}

	public void add(ProducerWithRisk producerWithRisk) {
		allSalary.add(producerWithRisk.salaryCalc());
		lastname.add(producerWithRisk.lastname);
		firstname.add(producerWithRisk.firstname);
		
	}

	public void add(WharehousemanWithRisk wharehousemanWithRisk) {
		allSalary.add(wharehousemanWithRisk.salaryCalc());
		lastname.add(wharehousemanWithRisk.lastname);
		firstname.add(wharehousemanWithRisk.firstname);	
	}

}
