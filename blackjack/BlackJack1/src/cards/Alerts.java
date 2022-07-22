package cards;

import print.Color;

public class Alerts {
	
	Color color = new Color();
	public void ass(int number) {
		if(number == 1) {
			System.out.println(color.YELLOW + " 🚨  Remember that the card with a syze of 1 can be used with the value of 1 point or 11 points 🚨 " + color.RESET);
		}
	}
}
