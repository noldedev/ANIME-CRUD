package pe.senati.HashMap;

import java.util.HashMap;
import java.util.Map;

public class practica1 {
    public static void main(String[] args) {
        // Crear un HashMap
        Map<String, Integer> mapa = new HashMap<>();

        // Agregar elementos al HashMap
        mapa.put("Manzana", 10);
        mapa.put("Banana", 20);
        mapa.put("Naranja", 15);

        // Imprimir el HashMap
        System.out.println("HashMap: " + mapa);
    }
}
