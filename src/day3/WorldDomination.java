package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {

		String response = JOptionPane.showInputDialog("Do you know how to write code?");

		if (response.equalsIgnoreCase("Yes")) {

			JOptionPane.showMessageDialog(null, "You will rule the world......after I do");
		}

		else {
			JOptionPane.showMessageDialog(null, "Good luck washing dishes.");
		}

	}
}
