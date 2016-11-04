package graficos;

import java.awt.*;
import javax.swing.*;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConTexto mimarco=new MarcoConTexto();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}

class MarcoConTexto extends JFrame{
	
	public MarcoConTexto(){
		
		setVisible(true);
		setSize(600,450);
		setLocation(200,100);
		setTitle("Primer Texto");
		Panel mipanel=new Panel();
		add(mipanel);
	}
}

class Panel extends JPanel{
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		g.drawString("Estamos aprendiendo Swing", 100, 100);
		
			
	}
}








