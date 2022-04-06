package ejercicio_2;

public class MainApp {

	public static void main(String[] args) {
		
		/* Definición y asignación */
		int N = 5;
		double A = 3.14;
		char C = 'A';

		/* Mostrar valores */
		System.out.println("Valor A " + A);
		System.out.println("Valor N " + N);
		System.out.println("Valor C " + C);
		System.out.println("La suma de N + A es: " + (N + A));
		System.out.println("La diferencia entre A y N es: " + (A - N));
		System.out.println("El valor numerico de C es: " + Character.getNumericValue(C));
	}

}
