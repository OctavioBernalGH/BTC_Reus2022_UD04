package ejercicio1;

public class MainApp {

	public static void main(String[] args) {
		
		/* Asignación de valores */
		int valor1 = 50;
		int valor2 = 10;
		
		/* Manejo de datos */
		int suma = valor1 + valor2;
		int resta = valor1 - valor2;
		int division = valor1 / valor2;
		int multiplicacion = valor1 * valor2;
		int modulo = valor1 % valor2;
		
		/* Salida de datos */
		System.out.println("La suma de " + valor1 + " y " + valor2 + " es: " + suma);
		System.out.println("La resta de " + valor1 + " y " + valor2 + " es: " + resta);
		System.out.println("La división de " + valor1 + " y " + valor2 + " es: " + division);
		System.out.println("La multiplicación de " + valor1 + " y " + valor2 + " es: " + multiplicacion);
		System.out.println("El módulo de " + valor1 + " y " + valor2 + " es: " + modulo);

	}

}
