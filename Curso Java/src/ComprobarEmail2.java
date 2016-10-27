import javax.swing.*;

public class ComprobarEmail2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub mail=
		
		int arroba=0;
		 
		String mail=JOptionPane.showInputDialog("Introduce mail");
		
		for (int i=0;i<mail.length();i++){
			
			if (mail.charAt(i)=='@'){
				arroba++;
			}
		}
		if (arroba==1) {
			System.out.println("Si contiene @");
		}
		else {
			System.out.println("No contiene @");
		}
	}

}
