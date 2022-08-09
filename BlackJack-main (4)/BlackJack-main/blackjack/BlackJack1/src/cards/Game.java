package cards;

import print.Color;

public class Game {
	
	private final int[] sizePlayer = new int[10];
	private final String[] typePlayer = new String[10];
	private final int[] sizeMachine = new int[10];
	private final String[] typeMachine = new String[10];
	private final String of = " of ";
	private static int cardPositionNext = 2;
	private int sum = 0;
	private int sumWithAces = 0;
	private int totalValue;
	private int totalValueWithAce;
	private boolean ace = false;
	private int totalAces = 0;
	
	
	NumberGenerator ng = new NumberGenerator();
	Alerts alerts = new Alerts();
	Color color = new Color(); 
	
	public void start() {
	

		sizePlayer[0] = ng.randomNumberSize();
		typePlayer[0] = ng.randomType();
		System.out.println(color.GREEN + "Player:" + color.RESET + " Your first card is: " + sizePlayer[0] + of + typePlayer[0]);
		alerts.ass(sizePlayer[0]);

		sizePlayer[1] = ng.randomNumberSize();
		typePlayer[1] = ng.randomType();
		System.out.println(color.GREEN + "Player:" + color.RESET + " Your second card is: " + sizePlayer[1] + of + typePlayer[1]);
		alerts.ass(sizePlayer[1]);

		
		sizeMachine[0] = ng.randomNumberSize();
		typeMachine[0] = ng.randomType();
		System.out.println(color.CYAN + "Machine:" + color.RESET + " His first card is: " + sizeMachine[0] + of + typeMachine[0]);


		sizeMachine[1] = ng.randomNumberSize();
		typeMachine[1] = ng.randomType();
		System.out.println(color.CYAN + "Machine:" + color.RESET + " His second card is: secret " + Color.PURPLE + "🃏" + Color.RESET);
	}
	public void giveCard() {
		int cardPosition = cardPositionNext;
		sizePlayer[cardPosition] = ng.randomNumberSize();
		typePlayer[cardPosition] = ng.randomType();
		System.out.println(color.GREEN + "Player:" + color.RESET + " Your next card is: " + sizePlayer[cardPosition] + of + typePlayer[cardPosition]);
		alerts.ass(sizePlayer[cardPosition]);
		cardPositionNext++;
		
	}
	public void cardsSum() {
	
		for(int i = 0; i<cardPositionNext; i++) {
			if(sizePlayer[i]==1) {
				ace = true;
				totalAces++;
			}
		}
		
		if(ace==false) {
			for(int i = 0; i<cardPositionNext; i++) {
				
				
				sum = sum + sizePlayer[i];
			}
			System.out.println("The sum of your cards is: " + sum +  Color.PURPLE + " 🃏" + Color.RESET);
			sum = 0;
		}else {
			for(int i = 0; i<cardPositionNext; i++) {
				
				
				sum = sum + sizePlayer[i];
				
			}
			sumWithAces = (sum - totalAces) + (totalAces*11);
			System.out.println("The sum of your cards is: " + sum +  Color.PURPLE + " 🃏" + Color.RESET);
			
			if(totalAces==1) {
				System.out.println("The sum of your cards is with " + totalAces + " ace: "  + sumWithAces +  Color.PURPLE + " 🃏" + Color.RESET);
			}else 
				System.out.println("The sum of your cards is with " + totalAces + " aces:"  + sumWithAces +  Color.PURPLE + " 🃏" + Color.RESET);
			totalValue = sum;
			totalValueWithAce = sumWithAces;
			sum = 0;
			sumWithAces = 0;	
					
			}			
			
		}
	public void plant() {
		
		}
	
	public void acesFounder() {
		for(int i = 0; i<cardPositionNext; i++) {
			if(sizePlayer[i]==1) {
				ace = true;
				totalAces++;
			}
		}
	}
	
	public boolean comprobateSum(int sizeArray) {
		
		int totalValue = 0;
		for (int i = 0; i < sizeArray; i++) {
			totalValue = totalValue + sizePlayer[i]; 
		}
		if(totalValue>21) {
		
		System.out.println("You need to have 21 points or less");
		System.out.println("Sorry you lost!");
		return true;
		}else
			return false;
	}
	public int getSizePlayer() {
		
		return 1;
	}
		
		
		

	public boolean gameExit() {
		
		return true;
	}
}
