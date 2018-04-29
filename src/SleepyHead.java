
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		/*
		 * Ask the user for these values using JOptionPane.showConfirmDialog(null,
		 * "is it a weekday?", "", JOptionPane.YES_NO_OPTION);
		 */
		int weekday = JOptionPane.showConfirmDialog(null, "Is it a weekday?");
		if (weekday == 0) {
			int vacation = JOptionPane.showConfirmDialog(null, "Is it a vacation?");
if(vacation==1) {
	JOptionPane.showMessageDialog(null, "Get up lazybones.");
}else {
	JOptionPane.showMessageDialog(null, "Sleep In.");
	}

		} else {
			JOptionPane.showMessageDialog(null, "Sleep in.");
		}

		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday, print
		 * “get up lazybones!” If it is a weekday, and we are on vacation, print “sleep
		 * in”.
		 */
	}
}
