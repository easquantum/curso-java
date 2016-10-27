package poo;

import java.util.*;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jefatura jefeRRHH=new Jefatura("Carlos",5500,2006,9,25);

		jefeRRHH.estableceIncentivo(250);
		
		Empleado[] misEmpleados=new Empleado[6];
		misEmpleados[0]=new Empleado("Sergio",3500,2016,9,20);
		misEmpleados[1]=new Empleado("Juan",2500,2015,5,12);
		misEmpleados[2]=new Empleado("Ana",2800,2014,8,26);
		misEmpleados[3]=new Empleado("Antonio"); // segundo constructor
		misEmpleados[4]=jefeRRHH; // Poliformismo en acción. Principio de sustitución
		misEmpleados[5]=new Jefatura("Maria",9500,1999,5,26);

		for(Empleado e: misEmpleados){
			e.subeSueldo(5);

		}
		
		for(Empleado e: misEmpleados){
			System.out.println("Nombre : "+e.dameNombre()+
					" Id : "+e.dameId()+
					" Sueldo : "+e.dameSueldo()+
		 		" Fecha de alta : "+e.dameFechaContrato());
		}
	}

}

class Empleado{
	
	public Empleado(String nom,double sue, int ano, int mes, int dia){
		
		nombre=nom;
		sueldo=sue;		
		GregorianCalendar calendario=new GregorianCalendar(ano, mes-1, dia);
		altaContrato=calendario.getTime();
		Id=IdSiguiente;
		IdSiguiente++;

	}
	
	
	public Empleado(String nom){
		
		//nombre=nom;
		this(nom,30000,2000,01,01); // llama al primer construcctor
	}
	
	
	// getter
	public String dameNombre(){
		return nombre;
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
	public double dameId(){
		return Id;
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente=1;
	private int Id;
	
}

// Herencia

class Jefatura extends Empleado{
	
	public Jefatura(String nom, double sue, int ano, int mes, int dia){
		
		super(nom,sue,ano,mes,dia);
		
	}
	
	public void estableceIncentivo(double b){
		
		incentivo=b;
		
	}
	
	// Sobreescritura de método
	
	public double dameSueldo(){
		
		double sueldoJefe=super.dameSueldo();
		
		return sueldoJefe + incentivo;
		
	}
	
	private double incentivo;	
	 
}




