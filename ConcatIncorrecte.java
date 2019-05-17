
public class ConcatIncorrecte {
		  public static void main(String[] args) {
		    String s = "China Blue";
		    System.out.println(s); //Affiche "China Blue"
		    concat(s, " Express"); //la modification n'est pas stocker
		    System.out.println(s); // s toujours égal à "China blue"
		  }

		  public static void concat(String s, String s2) {
		    s +=s2;
		  }
		}

