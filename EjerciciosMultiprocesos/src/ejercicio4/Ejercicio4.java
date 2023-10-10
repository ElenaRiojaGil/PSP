package ejercicio4;
/**
import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.util.Scanner;
**/
import java.io.IOException;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubpackage ejercicio3;
		
		if(args.length<1) {
			System.out.println("Debes introducir el comando a ejecutar");
		}else {
			ProcessBuilder pb= new ProcessBuilder(args[0]);
			try {
				pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
				pb.start();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
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
		**/

	}

}
