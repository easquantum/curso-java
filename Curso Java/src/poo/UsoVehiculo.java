package poo;

//import javax.swing.*;

public class UsoVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Auto Renault = new Auto();
		//System.out.println("Este auto tiene "+Renault.ruedas+ "ruedas");
		//System.out.println(Renault.dimeLargo());
		
		/*Auto miauto=new Auto();
		miauto.estableceColor(JOptionPane.showInputDialog("Introduce Color"));
		
		System.out.println(miauto.dimeDatos());
		
		System.out.println("El color del auto es "+miauto.dimeColor());
		
		miauto.configuraAsientos(JOptionPane.showInputDialog("Tiene asientos de cuero si/no"));
		
		System.out.println(miauto.dimeAsientos());
		
		miauto.configuraAire(JOptionPane.showInputDialog("Tiene aire si/no"));
		
		System.out.println(miauto.dimeAire());
		
		System.out.println(miauto.dimePesoAuto());
		
		System.out.println(miauto.tipoMotor());
		
		System.out.println("El precio del auto es "+miauto.precioAuto()); */
		
		
		// Herencia
		Auto miauto1=new Auto();
		
		miauto1.estableceColor("Rojo");
		
		Furgoneta mifurgoneta1=new Furgoneta(7,580);
		
		mifurgoneta1.estableceColor("Azul");
		mifurgoneta1.configuraAsientos("Si");
		mifurgoneta1.configuraAire("Si");
		
		System.out.println(miauto1.dimeDatos()+" "+miauto1.dimeColor());
		System.out.println(mifurgoneta1.dimeDatos()+" "+mifurgoneta1.dimeDatosFurgoneta());
	}

}
