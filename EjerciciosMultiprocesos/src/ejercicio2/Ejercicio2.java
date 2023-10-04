package ejercicio2;

public class Ejercicio2 {
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		int procesadores = runtime.availableProcessors();
		System.out.println("Numero de procesadores disponibles: " + procesadores);
	}

}
