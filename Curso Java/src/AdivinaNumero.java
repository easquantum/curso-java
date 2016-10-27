import java.util.*;
public class AdivinaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aleatorio=(int)(Math.random()*100);
		System.out.println("Aleatorio:"+aleatorio);
		
		Scanner entrada=new Scanner(System.in);
		int numero=0;
		int intentos=0;
		while (numero!=aleatorio){
			aleatorio++;
			System.out.println("Introduce un número:");
			numero=entrada.nextInt();
			if (aleatorio<numero){
				System.out.println("Más bajo");
			}
			else if (aleatorio>numero){
				System.out.println("Más alto");
			}
		}
		System.out.println("Correcto! lo haz conseguido en "+intentos+" intentos");

	}

}
