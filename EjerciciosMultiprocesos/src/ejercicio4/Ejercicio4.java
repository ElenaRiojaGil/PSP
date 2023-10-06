package ejercicio4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubpackage ejercicio3;

		
		String comando;
		System.out.println("Comando a ejecutar: ");
		Scanner teclado = new Scanner(System.in);
		comando = teclado.nextLine();
// Determinar comando Windows o Linux
		
		try {
			Process process = new ProcessBuilder(comando).start();
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line = "";
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("Error: " + e);
		}
		teclado.close();

	}

}
