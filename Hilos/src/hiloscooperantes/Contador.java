package hiloscooperantes;

public class Contador {
    private int cuenta = 0;
   synchronized public int getCuenta() {
        return cuenta;
    }

     public int incrementarCuenta() {
         synchronized (this) {
             this.cuenta++;
             return cuenta;
         }


    }
}
