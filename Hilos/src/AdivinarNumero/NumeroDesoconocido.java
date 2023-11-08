package AdivinarNumero;

import java.util.Random;

public class NumeroDesoconocido {

    private boolean adivinado = false;
    private int numero;

    public NumeroDesoconocido() {
        Random r = new Random();
        this.numero = r.nextInt(101);
    }


    public synchronized int candidato(int propuesta, long numHilo) {
        if (this.adivinado) {
            return -1;

        }
        if (this.numero == propuesta) {
            System.out.println("El hilo "+numHilo+" ha encontrado el número.");
            this.adivinado = true;
            return 1;
        }
        return 0;
    }
}
