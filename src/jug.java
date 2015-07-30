
import java.io.IOException;

import javax.swing.JOptionPane;

public class jug {

	// 1. make a main method and put steps 2, 3 & 4 inside it
	public static void main(String[] args) {
		for (int i = 0; i < 15; i++) {String question = JOptionPane.showInputDialog(null, "input a sentince, plese");
		speak(question);
			
		}
		String question = JOptionPane.showInputDialog(null, "input a sentince, plese");

		
	}

	// 4. repeat steps 2 and 3 a lot of times

	/* Don’t change this…. */
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
