package cards;

import print.Color;

public class NumberGenerator {
	
	
	public int randomNumberSize() { //Random size of the cards except 8 & 9
		int number;
		do{

		number = (int)Math.round(Math.random()*9 + 1); //+ 1 for desprecate the 0
				
		}while(number == 8 || number == 9);
		
		return number;
	}
	public String randomType() {
		int cardTypeNumber;
		String cardType = null;
		
		cardTypeNumber = (int)Math.round(Math.random()*3+1);
		switch(cardTypeNumber){
		case 1:
			cardType = "D";
			break;
		case 2:
			cardType = "S";
			break;
		case 3:
			cardType = "H";
			break;
		case 4: 
			cardType = "C";
			
			break;
		}
		cardTypeSelection ct = Enum.valueOf(cardTypeSelection.class, cardType);
		
		return ct.getType();
		
	}

 enum cardTypeSelection{
	D("💎"), S("⚔️"), H("❤️"), C("☘️");
	 private String type; 
	 private cardTypeSelection(String option) {
		 
		 type = option;
		 
	 }
	 public String getType() {
		 
		 switch(type) {
		 case "💎" : //DIAMONDS
			 return Color.CYAN + type + Color.RESET;
		 case "⚔️" : //SWORDS
			 return Color.CYAN + type + Color.RESET;
		 case "❤️" : //HEARTS
			 return Color.RED + type + Color.RESET;
		 case "☘️" : //SWORDS
			 return Color.GREEN + type + Color.RESET;
			 
			 
		 }
		 
		 
		 return type;
	 }
 }
}


