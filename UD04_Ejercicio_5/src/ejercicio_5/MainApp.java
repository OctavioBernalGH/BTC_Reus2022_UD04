package ejercicio_5;

public class MainApp {

	public static void main(String[] args) {
		
		int A = 10;
		int B = 20;
		int C = 30;
		int D = 40;
		
		System.out.println("A: " + A);
		System.out.println("B: " + B);
		System.out.println("C: " + C);
		System.out.println("D: " + D);
		
		B = C;
		System.out.println("B vale: " + B + " y C vale: " + C);
		C = A;
		System.out.println("C vale: " + C + " y A vale: " + A);
		A = D;
		System.out.println("A vale: " + A + " y D vale: " + D);
		D = B;
		System.out.println("D vale: " + D + " y B vale: " + B);

	}

}
