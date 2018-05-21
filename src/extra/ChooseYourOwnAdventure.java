package extra;

import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int task = JOptionPane.showOptionDialog(null,
				"You come to a bridge on your way to an important meeting. You see a troll\ntwice your height blocking the way across the bridge. What do you do?",
				"Move 1", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Talk to it.", "Try to kill it." },
				null);
		if (task == 0) {
			int task1 = JOptionPane.showOptionDialog(null,
					"The troll asks you to solve two riddles to cross the bridge safely or otherwise your die. Do you accept?",
					"Move 2", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Yes.", "No." }, null);
			if (task1 == 0) {
				String move3 = JOptionPane.showInputDialog(
						"                                                Move 3\nThe troll asks you the first riddle. It is 'What is the center of gravity?'");
				if (move3.equalsIgnoreCase("v")) {
					// next riddle
				} else {
					JOptionPane.showMessageDialog(null, "The troll kills you because you got it wrong. THE END.");
				}
				JOptionPane.showMessageDialog(null,"The troll gets angry that you refused his offer and kills you. THE END.");
			}
		} else {
			JOptionPane.showMessageDialog(null,
					"What were you thinking? The troll kills you easily and you die. THE END.");
		}

	}

}
