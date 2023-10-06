package pruebas;

public class Operaciones {

	public int sum(String S, int ... numeros ) {
		
		int suma = 0; 
		for( int num:numeros) {
			suma+=num;
		}
		return suma;
	}
}
