package poo;

public class Furgoneta extends Auto {

	private int capacidadCarga;
	private int asientosExtra;
	
	public Furgoneta(int asientosExtra,int capacidadCarga){
		
		super(); // llamar constructor de la clase Auto;
		this.capacidadCarga=capacidadCarga;
		this.asientosExtra=asientosExtra;
		
	}
	
	// método getter
	
	public String dimeDatosFurgoneta(){
		
		return "La capacidad de carga es: "+capacidadCarga+" y los asientos son: "+asientosExtra;
	}
}
