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
		
		Jefatura jefa=(Jefatura) misEmpleados[5]; // Casting
		
		jefa.estableceIncentivo(550); // Ahora si tiene el metodo estableceIncentivo

		System.out.println(jefa.tomarDecisiones("Dar dos dias mas de vacaciones a los empleados"));
		
		System.out.println("El jefe "+jefa.dameNombre()+" tiene un bonus de: "+jefa.estableceBonus(500));
		
		System.out.println("El empleado "+misEmpleados[3].dameNombre()+" tiene un bonus de: "+misEmpleados[3].estableceBonus(20));
		
		for(Empleado e: misEmpleados){
			e.subeSueldo(5);

		}
		
		Empleado directorComercial=new Jefatura("Sandra",8500,2012,05,05);
		
		Comparable ejemplo=new Empleado("Elisabeth",9500,2011,06,07);
		
		if (directorComercial instanceof Empleado){
			System.out.println("Es de tipo Jefatura");
		}
		
		if (ejemplo instanceof Comparable){
			System.out.println("Es de tipo Comparable");
		}
		
		Arrays.sort(misEmpleados);
		
		for(Empleado e: misEmpleados){
			System.out.println("Nombre : "+e.dameNombre()+
					" Id : "+e.dameId()+
					" Sueldo : "+e.dameSueldo()+
		 		" Fecha de alta : "+e.dameFechaContrato());
		}
	}

}

class Empleado implements Comparable, Trabajadores { // Uso de interface Comparable
	
	public Empleado(String nom,double sue, int ano, int mes, int dia){
		
		nombre=nom;
		sueldo=sue;		
		GregorianCalendar calendario=new GregorianCalendar(ano, mes-1, dia);
		altaContrato=calendario.getTime();
		id=idSiguiente;
		idSiguiente++;

	}
	
	public double estableceBonus(double gratificacion){
		
		return Trabajadores.bonusBase+gratificacion;
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
	public int dameId(){
		return id;
	}
	
	
	// Sobre escribir método de la interface Comparable
	
	public int compareTo(Object miObjeto){
		
		Empleado otroEmpleado=(Empleado) miObjeto;
		if (this.id<otroEmpleado.id){
			return -1;
		}
		if (this.id>otroEmpleado.id){
			return 1;
		}
		return 0 ;
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private static int idSiguiente=1;
	private int id;
	
}

// Herencia

// final class Jefatura extends Empleado{ // Uso de final
	class Jefatura extends Empleado implements Jefes {
	
	public Jefatura(String nom, double sue, int ano, int mes, int dia){
		
		super(nom,sue,ano,mes,dia);
		
	}
	
	public String tomarDecisiones(String decision){
		
		return("Un miembro de Jefatura a tomado la decisión "+decision);
	}
	
	public double estableceBonus(double gratificacion){
		
		double prima=200;
		return Trabajadores.bonusBase+gratificacion+prima;
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

/*// No puede heredar de una clase final
class Director extends Jefatura {
	
	public Director (String nom, double sue, int ano, int mes, int dia){
		
		super(nom,sue,ano,mes,dia);
		
	}
}
*/

