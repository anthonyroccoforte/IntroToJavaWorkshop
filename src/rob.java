import java.util.Random;

import javax.swing.JOptionPane;

public class rob {

	
	public static void main(String[] args) {
	
		
	
	int random = new Random().nextInt(4);
	
	
		System.out.println(random);
 
	 	String randomquestion= JOptionPane.showInputDialog(null, "question here");
	
	 	if (random==0) {
	 		JOptionPane.showMessageDialog(null, "yes");
	 	}
	

	

	 	if (random==1) { 
	 		JOptionPane.showMessageDialog(null, "no");
	 	}
	
	 	if (random==2) {
	 		JOptionPane.showMessageDialog(null, "maybe you should ask google");
	 	}
	
	 	if (random==3) {
	 		JOptionPane.showMessageDialog(null, "idk go ask your friends");
	 	}

	

	}
	
}


