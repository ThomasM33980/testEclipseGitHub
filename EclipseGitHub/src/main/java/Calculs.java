
public class Calculs {
	private int valeur1;
	private int valeur2;
	
	//Constructor
	   //@param message to be printed
	   public Calculs(int valeur1, int valeur2){
	      this.valeur1 = valeur1;
	      this.valeur2 = valeur2;
	   }
	   
	   public int additionner() {
		   System.out.println(valeur1 + valeur2);
		   return valeur1 + valeur2;
	   }
	   
	   public int soustraire() {
		   System.out.println(valeur1 - valeur2);
		   return valeur1 - valeur2;
	   }
	   
	   public int diviser() {
		   System.out.println(valeur1 / valeur2);
		   return valeur1 / valeur2;
	   }
	   
	   public int multiplier() {
		   System.out.println(valeur1 * valeur2);
		   return valeur1 * valeur2;
	   }
}
