package Encuestas;

import java.util.Random;

public class EncuestadorZona implements Runnable {
    private final String idZona;
    private final ResultadosEncuesta resultados;
    EncuestadorZona(String idZona,ResultadosEncuesta resultados){
        this.idZona=idZona;
        this.resultados = resultados;
    }

    @Override
    public void run() {
        System.out.printf(">>Encuesttador para zona %s comienza.\n", this.idZona);
        Random r = new Random();
        int numRespuestas = 100 + r.nextInt(200 - 100) + 1;
        for (int i = 0; i < numRespuestas; i++) {// Respuesta 0 a 9, 0 NS/NC
            int numRespuesta = r.nextInt(10);
            String respuesta = null;
            if (numRespuesta > 0) {
                respuesta = "respuesta_" + numRespuesta;
            }
            this.resultados.anotaRespuesta(this.idZona, respuesta);
        }
        System.out.printf("##Encuestador zona %s termina.\n", this.idZona);
    }

}
