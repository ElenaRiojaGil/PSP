package hiloscooperantes;

public class Hilo implements Runnable {
    int numHilo, miParte, miCuenta;
    private Contador cont;

    public int getMiCuenta() {
        return miCuenta;
    }

    Hilo(int numHilo, int miParte, Contador c) {
        this.numHilo = numHilo;
        this.miParte = miParte;
        this.cont = c;
    }

    public void run() {
        for (int i = 0; i < miParte; i++) {
            this.cont.incrementarCuenta();
            miCuenta++;
        }

        System.out.printf("Hilo %d terminado, cuenta: %d\n", numHilo,getMiCuenta());
    }
}
