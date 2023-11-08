package hilos;
public class UsaHilo extends Thread {
    public static void main(String[] args) {
        UsaHilo mihilo= new UsaHilo();
        mihilo.start();

        for (int i=0;i<5;i++){
            System.out.println("Estoy fuera del hilo... "+i);
        }

    }
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Estoy en el hilo...." +i);
        }
    }
}