package graficos;

import java.awt.*;
import javax.swing.*;

public class PruebaDibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConDibujos mimarco=new MarcoConDibujos();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
		

	}

}

class MarcoConDibujos extends JFrame{
	
	public MarcoConDibujos(){
		
		setTitle("Prueba de Dibujo");
		setSize(400,400);
		PanelConDibujos mipanel=new PanelConDibujos();
		add(mipanel);
		
	}
	
}

class PanelConDibujos extends JPanel{
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		g.drawRect(100, 100, 200, 200);
		g.drawOval(150, 150, 100, 100);
		g.drawArc(25, 100, 100, 100, 120, 150);
		g.drawLine(200, 200, 250, 270);
		
	}
}






