import javax.swing.JOptionPane;

public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String score=JOptionPane.showInputDialog("What did you get on the test?");
	double score2=Double.parseDouble(score);
	if(score2>95.1) {
		JOptionPane.showMessageDialog(null, "Good Job, you either got lucky or are smart.");
	}else if(score2>85.1) {
		JOptionPane.showMessageDialog(null, "You almost did good BUT you didn't.");
	}else if(score2>75.1) {
		JOptionPane.showMessageDialog(null, "You almost failed but you didn't. But wait, now get ready for your parents to yell at you at home. ");
	}else {
		JOptionPane.showMessageDialog(null, "You are bad. Here's a job application for McDonalds-https://www.mcdonalds.com/us/en-us/careers.html ");
	}
	}

}
