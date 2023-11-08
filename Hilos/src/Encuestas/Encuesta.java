package Encuestas;

import java.util.Set;

public class Encuesta {
    private static final int NUM_ZONAS = 20;

    public static void main(String[] args) {
        ResultadosEncuesta resultados = new ResultadosEncuesta();
        Thread[] encuestadores = new Thread[NUM_ZONAS];

        for (int i = 0; i < NUM_ZONAS; i++) {
            Thread encuestador = new Thread(new EncuestadorZona("zona" + (i + 1), resultados));
            encuestadores[i] = encuestador;

        }
        for (Thread encuestador :
                encuestadores) {
            encuestador.start();

        }
        for (Thread encuestador :
                encuestadores) {
            try {
                encuestador.join();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }

        }
        System.out.println("Encuestados por zonas");
        Set<String> zonas = resultados.obtenZonas();

        int totalZonas = 0;
        for (String zona :
                zonas) {
            int totalParaZona = resultados.obtenNumRespuestasZona(zona);
            System.out.printf("%s: %d\n", zona, totalParaZona);
            totalZonas += totalParaZona;
        }
        System.out.printf("Total: %d\n", totalZonas);
        System.out.println("Resultados por cada respuesta posible:");
        Set<String> respuestas = resultados.obtenRespuestas();
        int totalPorCadaRespuesta = 0;
        for (String respuesta :
                respuestas) {
            int totalPorRespuesta = resultados.obtenNumRespuestas(respuesta);
            System.out.printf("%s: %d\n", respuesta != null ? respuesta : "NS/NC", totalPorRespuesta);

            totalPorCadaRespuesta += totalPorRespuesta;
        }
        System.out.printf("Total: %d\n", totalPorCadaRespuesta);
    }
}
