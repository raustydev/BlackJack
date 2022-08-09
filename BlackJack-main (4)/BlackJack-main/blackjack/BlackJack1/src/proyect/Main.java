package proyect;




import cards.NumberGenerator;
import cards.Alerts;
import print.Color;
import cards.Game;
import cards.Options;


public class Main {
	

	
	
	
	public static void main(String[] args) {

	Options opt = new Options();
	Color color = new Color();
	
	System.out.println(Color.PURPLE + "Welcome to the BlackJack Game!" + Color.RESET);
	opt.startMenu();
	boolean exit = false;
	
	do {
		exit = opt.matchMenu();
		
		
	}while(exit == false);
	System.out.println(color.GREEN + "The program finished correctly" + color.RESET);
	}
}


