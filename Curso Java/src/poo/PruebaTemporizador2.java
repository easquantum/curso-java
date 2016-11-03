package poo;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Reloj miReloj=new Reloj(3000,true);
		
		Reloj miReloj=new Reloj();
		
		miReloj.enMarcha(3000,true);
		
		JOptionPane.showMessageDialog(null, "Pulsa enter para Terminar");
		
		System.exit(0);
		

	}

}

class Reloj {
	
	/*public Reloj(int intervalo, boolean sonido){
		
		this.intervalo=intervalo;
		this.sonido=sonido;
		
	}*/
	
	public void enMarcha(int intervalo, final boolean sonido){
		
		// Clase interna Local
		class DameLaHora2 implements ActionListener{
			
			public void actionPerformed(ActionEvent ebento){
				
				Date ahora=new Date();
				System.out.println("Te pongoo la hora cada 3 seg "+ahora);
				
				if (sonido){
					Toolkit.getDefaultToolkit().beep();
					System.out.println("sonidOOOO....");
				}
				else {
					System.out.println("shhhhhh....");
				}
				
			}
		}
		
		ActionListener oyente=new DameLaHora2();
		
		Timer miTemporizador=new Timer(intervalo, oyente);
		
		miTemporizador.start();
	}
	//private int intervalo;
	//private boolean sonido;
	
	
	// Clase interna
	/*private class DameLaHora2 implements ActionListener{
		
		public void actionPerformed(ActionEvent ebento){
			
			Date ahora=new Date();
			System.out.println("Te pongoo la hora cada 3 seg "+ahora);
			
			if (sonido){
				Toolkit.getDefaultToolkit().beep();
				System.out.println("sonidOOOO....");
			}
			else {
				System.out.println("shhhhhh....");
			}
			
		}
	}*/
	
}