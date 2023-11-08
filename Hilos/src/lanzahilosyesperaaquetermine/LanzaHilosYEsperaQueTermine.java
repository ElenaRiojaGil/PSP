package lanzahilosyesperaaquetermine;



public class LanzaHilosYEsperaQueTermine {
    public static void main(String[] args) {
        Thread h1=new Thread(new hilo("H1"));
        Thread h2 = new Thread(new hilo("H2"));
        h1.start();
        h2.start();

        try {
            h1.join();
            h2.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println("Hilo principal ha terminado.");
    }
}
