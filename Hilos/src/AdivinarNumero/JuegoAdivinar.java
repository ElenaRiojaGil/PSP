package AdivinarNumero;

public class JuegoAdivinar {

    public static void main(String[] args) {

        HiloAdivinador[] arrayHilos = new HiloAdivinador[10];
        NumeroDesoconocido n = new NumeroDesoconocido();
        for (int i = 0; i < 10; i++) {
            HiloAdivinador h = new HiloAdivinador(n);
            arrayHilos[i] = h;
            h.start();
        }
        for (HiloAdivinador ha :
                arrayHilos) {
            try {
                ha.join();
            } catch (InterruptedException ignored) {

            }

        }
        System.out.println("El programa principal ha finalizado");

    }
}
