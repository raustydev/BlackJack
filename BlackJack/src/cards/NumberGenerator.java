package cards;




public class NumberGenerator {
	
	public int randomNumberSize() { //Random size of the cards except 8 & 9
		int number;
		do{

		number = (int)Math.round(Math.random()*10 + 1); //+ 1 for desprecate the 0
				
		}while(number == 8 || number == 9);
		
		return number;
	}
	public String randomType() {
		String cardType;
		
		cardType = Integer.toString((int)Math.round(Math.random()*4+1));
		cardTypeSelection ct = Enum.valueOf(cardTypeSelection.class, cardType);
		
		return ct.getType();
		
	}
	
	
}
 enum cardTypeSelection{
	DIAMONDS("1"), SPADES("2"), HEARTS("3"), CLUBS("4");
	private String type; 
	 private cardTypeSelection(String option) {
		 type = option;
	 }
	 public String getType() {
		 return type;
	 }
 }
