package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona[] lasPersonas=new Persona[2];
		lasPersonas[0]=new Empleado2("Luis",5000,2009,02,25);
		lasPersonas[1]=new Alumno("Ana","Biología");
		
		for (Persona p: lasPersonas){
			System.out.println(p.dameNombre()+" "+p.dameDescripcion());
		}
	}

}

abstract class Persona {
	
	private String nombre;
	
	public Persona(String nom){
		
		nombre=nom;
	}
	
	public String dameNombre(){
		
		return nombre;
	}
	
	public abstract String dameDescripcion();
}

class Empleado2 extends Persona{
	
	public Empleado2(String nom,double sue, int ano, int mes, int dia){
		
		super(nom); // Constructor de la superclase (Persona)
		
		sueldo=sue;		
		GregorianCalendar calendario=new GregorianCalendar(ano, mes-1, dia);
		altaContrato=calendario.getTime();
		Id=IdSiguiente;
		IdSiguiente++;

	}
	
	public String dameDescripcion(){
		
		return "Este empleado tiene un Id= "+" con un sueldo= "+sueldo;
	}
	
	// getter
	public double dameSueldo(){
		return sueldo;
	}
	
	// getter
	public Date dameFechaContrato(){
		return altaContrato;
	}
	
	// setter
	public void subeSueldo(double porcentaje){
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	
	// getter
	public int dameId(){
		return Id;
	}
	
	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente=1;
	private int Id;
	
}

class Alumno extends Persona{
	
	public Alumno(String nom, String car){
		
		super(nom);
		carrera=car;
		
	}
	
	public String dameDescripcion(){
		
		return "Este alumno esta estudiando la carrera de: "+carrera;
	}
	
	private String carrera;
}