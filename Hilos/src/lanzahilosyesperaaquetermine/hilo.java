package lanzahilosyesperaaquetermine;

import java.util.Random;

public class hilo implements Runnable{
    private String nombre;
    hilo(String nombre){
        this.nombre = nombre;

    }
    @Override
    public void run() {
        System.out.printf("Hola, soy el hilo ");
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int pausa = 10 + r.nextInt(500 - 10);
            System.out.printf("El hilo %s hace una pausa de %d ms\n", this.nombre, pausa);

            try {
                Thread.sleep(pausa);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
        System.out.printf("Hilo %s terminado.\n",this.nombre);
    }
}
