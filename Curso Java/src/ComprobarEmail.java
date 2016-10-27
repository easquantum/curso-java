import javax.swing.*;

public class ComprobarEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub mail=
		
		boolean arroba=true;
		 
		String mail=JOptionPane.showInputDialog("Introduce mail");
		
		for (int i=0;i<mail.length();i++){
			
			if (mail.charAt(i)=='@'){
				arroba=true;
			}
		}
		if (arroba) {
			System.out.println("Si contiene @");
		}
		else {
			System.out.println("No contiene @");
		}
	}

}
