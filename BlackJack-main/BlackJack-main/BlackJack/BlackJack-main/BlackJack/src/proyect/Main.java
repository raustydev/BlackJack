package proyect;




import cards.NumberGenerator;
import cards.Options;
import print.Color;


public class Main {

	public static void main(String[] args) {
	
	
	NumberGenerator ng = new NumberGenerator();
	Options opt = new Options();
	Color color = new Color();
	
	
	
	int[] sizePlayer = new int[5];
	String[] typePlayer = new String[5];
	int[] sizeMachine = new int[5];
	String[] typeMachine = new String[5];
	String of = " of ";
	
	
	System.out.println("Starting...");
	
	sizePlayer[0] = ng.randomNumberSize();
	typePlayer[0] = ng.randomType();
	System.out.println(color.GREEN + "Player:" + color.RESET + " Your first card is: " + sizePlayer[0] + of + typePlayer[0]);
	opt.assAlert(sizePlayer[0]);

	sizePlayer[1] = ng.randomNumberSize();
	typePlayer[1] = ng.randomType();
	System.out.println(color.GREEN + "Player:" + color.RESET + " Your second card is: " + sizePlayer[1] + of + typePlayer[1]);
	opt.assAlert(sizePlayer[1]);

	
	sizeMachine[0] = ng.randomNumberSize();
	typeMachine[0] = ng.randomType();
	System.out.println(color.CYAN + "Machine:" + color.RESET + " His card is: " + sizeMachine[0] + of + typeMachine[0]);

	}
}


