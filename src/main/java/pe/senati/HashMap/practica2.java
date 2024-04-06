package pe.senati.HashMap;

import java.util.HashMap;
import java.util.Map;

public class practica2 {
	public static void main(String[] args) {
        // Crear un HashMap
        Map<String, Integer> mapa = new HashMap<>();

        // Agregar elementos al HashMap
        mapa.put("Carne Roja", 10);
        mapa.put("Pescado", 20);
        mapa.put("Huevos", 15);

        // Acceder a un elemento
        int cantidadHuevos = mapa.get("Huevos");
        System.out.println("Cantidad de Huevos: " + cantidadHuevos);

        // Actualizar un elemento
        mapa.put("Banana", 25);
        System.out.println("Nuevo HashMap: " + mapa);
    }
}
