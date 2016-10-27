package poo;

public class Prueba {
// Uso de constantes => final
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados trab1=new Empleados("Paco");
		
		Empleados trab2=new Empleados("Ana");
		
		Empleados trab3=new Empleados("Antonio");
		
		Empleados trab4=new Empleados("María");
		
		trab1.cambiaDepartamento("RRHH");
	
		System.out.println(trab1.devuelveDatos()+"\n"+
				trab2.devuelveDatos()+"\n"+
				trab3.devuelveDatos()+"\n"+
				trab4.devuelveDatos()+"\n"
				);
		System.out.println(Empleados.devuelveIdSiguiente());
		
	}
}

class Empleados{
	private final String nombre; // variable o constante final
	private String departamento;
	private int id;
	private static int idSiguiente=1; // variable static
	
	public Empleados(String nom){
		
		nombre=nom;
		departamento="Administración";
		id=idSiguiente;
		idSiguiente++;
	}
	
	public void cambiaDepartamento(String departamento){
		this.departamento=departamento;
	}
	
	public String devuelveDatos(){
		return "El nombre es:"+nombre + " y el departamento es:" +departamento+" Id: "+id;
	}
	
	// método static
	public static String devuelveIdSiguiente(){
		return "El idSiguiente es: "+idSiguiente;
	}
}