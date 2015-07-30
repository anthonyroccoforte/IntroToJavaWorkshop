package day1.robot;

import java.io.FileOutputStream;

import javax.swing.JOptionPane;

public class world {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
	String Question = JOptionPane.showInputDialog("can you wright code?");
		// 2. If they say "yes", tell them they will rule the world.
       	if (Question.equals ("yes" )){JOptionPane.showMessageDialog(null, "you will rull the world");
       	
       	}
       	else{ JOptionPane.showMessageDialog(null, "i wish you good luck");
       	}
       
	}
}




