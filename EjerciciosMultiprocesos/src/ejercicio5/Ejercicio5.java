package ejercicio5;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ProcessBuilder pb =new ProcessBuilder("java sumador ");
		Ejercicio5 l = new Ejercicio5();
		l.lanzarSuma(1, 51);
		l.lanzarSuma(51, 100);
		System.out.println("Sumas realizadas con exito");

	}

	private void lanzarSuma(Integer n1, Integer n2) {
		// TODO Auto-generated method stub
		String clase = "ejercicio5.sumador";
		ProcessBuilder pb;
		try {
			pb = new ProcessBuilder("java", "sumador.java", n1.toString(), n2.toString());
			pb.start();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
