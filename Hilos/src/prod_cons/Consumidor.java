package prod_cons;

public class Consumidor extends Thread {
    private Cola cola;
    private int n;

    public Consumidor(Cola c, int n) {
        cola = c;
        this.n = n;
    }

    public void run() {
        int valor = 0;
        for (int i = 0; i < 5; i++) {
            valor = cola.get();
            System.out.println(i + "=> Consumidor " + n
                    + ": consume: " + valor);

			/*try {
                sleep(100);
            } catch (InterruptedException e) { }
			*/
        }
    }
}


