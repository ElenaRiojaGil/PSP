package EjemploHilosSencillo;

public class LanzaHilos {

    public static void main(String[] args) {
        Thread h1=new Thread(new hilo("H1"));
        Thread h2 = new Thread(new hilo("H2"));
        h1.start();
        h2.start();
        System.out.println("Hilo principal terminado.");
    }
}
