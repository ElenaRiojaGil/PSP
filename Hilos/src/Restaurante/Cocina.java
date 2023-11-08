package Restaurante;

import java.util.Random;

public class Cocina {

    public Cocina() {

    }

    static synchronized public String cocinaPlato() {
        Random azar= new Random();

        String PlatoAzar[]={"huevos","patatas","macarrones","spaguetti","judias verdes","chorizo","jamon","coliflor","brocoli",
                "cebolla","calabacin","aceitunas","panceta","pimiento","chami�ones","tofu","bacalao","merluza","salmon","gazpacho","pepino",
                "atun","tomate","remolacha","pollo","ternera","ternasco","leche","patatas a lo pobre","lechuga","albondigas","jamon york",
                "sanjacobos","salchichas","arroz","platano","pi�a","pizza","oregano","tomillo","guisantes"};

        return PlatoAzar[azar.nextInt(PlatoAzar.length)];
    }
}
