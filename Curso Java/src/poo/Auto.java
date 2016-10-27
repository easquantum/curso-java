package poo;

public class Auto {

	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	
	private String color;
	private int pesoTotal;
	private boolean asientosCuero, aire;
	
	// Constructor: estado inicial
	public Auto(){
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		pesoPlataforma=500;
	}
	
	// Método Getter
	public String dimeLargo(){
		return "El largo es "+largo;
	}
	
	// Método Getter
	public String dimeDatos(){
		return "La plataforma del vehículo tiene "+ruedas+" ruedas "+" mide "+largo/1000 + 
				" metros con un ancho de "+ancho+" cm y un peso de plataforma de "+pesoPlataforma+" kg";
	}
	
	// Método Setter
	public void estableceColor(String colorAuto) {
		color=colorAuto;
	}
	
	// Método Getter
	public String dimeColor(){
		return "El color del auto es "+color;
	}
	
	// Método Setter
	public void configuraAsientos(String asientosCuero){
		if (asientosCuero.equalsIgnoreCase("si")){
			this.asientosCuero=true;
		}else{
			this.asientosCuero=false;
		}
	}
	
	// Método Getter
	public String dimeAsientos(){
		if(asientosCuero==true){
			return "El auto tiene asientos de cuero";	
		}else{
			return "El auto tiene asientos de serie";
		}
	}
	
	// Método Setter
	public void configuraAire(String aire){
		if (aire.equalsIgnoreCase("si")){
			this.aire=true;
		}else{
			this.aire=false;
		}
	}
	
	// Método Getter
	public String dimeAire(){
		if(aire==true){
			return "El auto tiene aire";	
		}else{
			return "El auto no tiene aire";
		}
	}
	
	public String dimePesoAuto(){
		
		int pesoCarroceria=500;
		pesoTotal=pesoPlataforma+pesoCarroceria;
		if(asientosCuero==true){
			pesoTotal=pesoTotal+50;
		}
		if(aire==true){
			pesoTotal=pesoTotal+20;
		}
		return "El Peso del auto es "+pesoTotal;
	}
	
	public int precioAuto(){
		int precioFinal=10000;
		if(asientosCuero==true){
			precioFinal+=2000;
		}
		if(aire==true){
			precioFinal+=1500;
		}
		return precioFinal;
	}
	
	public String tipoMotor(){
		return "El tipo de motor es "+motor; 
	}
}
