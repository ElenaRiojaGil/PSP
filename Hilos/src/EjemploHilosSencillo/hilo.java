package EjemploHilosSencillo;

public class hilo implements Runnable{
    private String nombre;
    hilo(String nombre){
        this.nombre = nombre;

    }
    @Override
        public void run(){
        System.out.printf("Hola, soy el hilo: %s.\n", this.nombre);
        System.out.printf("Hilo %s terminado. \n",this.nombre);
        }


}
