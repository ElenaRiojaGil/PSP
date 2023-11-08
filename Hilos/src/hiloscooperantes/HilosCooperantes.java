package hiloscooperantes;


public class HilosCooperantes {
    private static final int NUM_HILOS = 10;
    private static final int CUENTA_TOTAL = 10000;

    public static void main(String[] args) {
        Contador c = new Contador();
        Thread[] hilos = new Thread[NUM_HILOS];
        for (int i = 0; i < NUM_HILOS; i++) {
            Thread th = new Thread(new Hilo(i, (CUENTA_TOTAL / NUM_HILOS), c));
            th.start();
            /*
             * Cuando termina un hilo pasa al siguiente y asi no se pierden
             * try {
                th.join();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
             */

            hilos[i] = th;
        }

        /*
         * Lanzas primero todos los hilos y luego dices que espere al programa principal lo cual hace que pierdas datos
         */
        for (Thread h :
                hilos) {
            try {
                h.join();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }

        }
        System.out.printf("Cuenta global: %s\n", c.getCuenta());
    }
}
