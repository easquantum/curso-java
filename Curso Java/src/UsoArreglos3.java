
public class UsoArreglos3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int  matrizAleatorios[]=new int[150];
		
		for (int i=0;i<matrizAleatorios.length;i++){
			
			matrizAleatorios[i]=(int)Math.round(Math.random()*100);
		}
		
		for (int numeros:matrizAleatorios){
			
			System.out.print(numeros+" ");
		}
	}

}
