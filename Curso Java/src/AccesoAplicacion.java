import javax.swing.*;
public class AccesoAplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String clave="Juan";
		String pass="";
		
		while (clave.equals(pass)==false){
			pass=JOptionPane.showInputDialog("Introduce la clave");
			if (clave.equalsIgnoreCase(pass)==false){
				System.out.println("Clave incorrecta!!");
			}
		}
		
		System.out.println("Clave correcta, acceso permitido");
	}

}
