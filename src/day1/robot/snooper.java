package day1.robot;

import javax.swing.JOptionPane;

public class snooper {
	public static void main(String[] args) {
	String location=	JOptionPane.showInputDialog(null, "where do you live");
	String age=	JOptionPane.showInputDialog(null, "how old are you");
	String time=	JOptionPane.showInputDialog(null, "when will your house be empty");
	String car=	JOptionPane.showInputDialog(null, "what car do your parents drive");
	String number= JOptionPane.showInputDialog(null, "whats your phone number");
	JOptionPane.showMessageDialog(null, "i know where you live " + location);
	}


}
