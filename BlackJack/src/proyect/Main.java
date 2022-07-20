package proyect;



import cards.NumberGenerator;

public class Main {

	public static void main(String[] args) {
		
	NumberGenerator ng = new NumberGenerator();
	String cardType;
	
	cardType = Integer.toString((int)Math.round(Math.random()*1+1));
	
	cardTypeSelection ct = Enum.valueOf(cardTypeSelection.class, cardType);
	System.out.println(ct.getType());

	
	
	/*System.out.println("Starting...");
	System.out.println("Player1: Your first card is: ");	
	System.out.println("Plauer1: Your second card is: ");
	System.out.println("Machine1: His card is: ");
	*/
	}
}
enum cardTypeSelection{
	DIAMONDS(1), SPADES(2), HEARTS(3), CLUBS(4);
	private String type; 
	 private cardTypeSelection(int option) {
		
		 type = Integer.toString(option);
		 
		 
	 }
	 public String getType() {
		 return type;
	 }
}
