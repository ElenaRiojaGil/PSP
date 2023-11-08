package AdivinarNumero;

import java.util.Random;

public class HiloAdivinador extends Thread {

    NumeroDesoconocido juego;

    public HiloAdivinador(NumeroDesoconocido n) {
        this.juego = n;
    }

    public void run() {
        Random r = new Random();
        int resultado;

        while (true) {

            int numero = r.nextInt(101);
            resultado = this.juego.candidato(numero, this.getId());


            if (resultado == 1) {
                //System.out.println("El hilo "+this.getId()+" ha adivinado el numero");
                return;

            }
            if (resultado == -1) {
                System.out.printf("El hilo %d ha finalizado\n", this.getId());
                return;
            }
        }
    }
}
