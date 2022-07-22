package cards;
import java.util.*;
import print.Color;
import java.math.*;


public class Options {
	Scanner sc = new Scanner(System.in);
	Game game = new Game();
	Color color = new Color();
	
	private int option;
	
	public void startMenu() {
		
		do {
		System.out.println("Select one options introducing his respective number: ");
		System.out.println("  1-Play a new hand");
		System.out.println("  2-Exit");
		System.out.print("Select the option: ");
		option = Math.abs(sc.nextInt());
		if(option < 0 && option >3 ) {
			System.out.println(Color.RED + "ERROR, SELECT A CORRECT NUMBER" + Color.RESET);
		}
		
		}while(option < 0 && option >3);
			
		switch(option) {
		case 1: 
			game.start();
			break;
			
		case 2:
			
			break;
			
		}
	}
	public boolean matchMenu() {
		do {
		System.out.println("Select one options introducing his respective number: ");
		System.out.println("  1-Give one more card");
		System.out.println("  2-Do the sum of your cards");
		System.out.println("  3-Plant");
		System.out.println("  4-Exit");
		System.out.print("Select the option: ");
		option = Math.abs(sc.nextInt());
		if(option < 0 && option < 5) {
			System.out.println(Color.RED + "ERROR, SELECT A CORRECT NUMBER" + Color.RESET);
		}
		
		}while(option < 0 && option < 5);
		
		switch(option) {
		case 1 : 
			game.giveCard();
			break;
		case 2:
			game.cardsSum();
			
			break;
		case 3:
			
			break;
		case 4:
			
			return true;
		}
		return false;
	}
}
