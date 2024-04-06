package pe.senati.HashMap;

import java.util.HashMap;
import java.util.Map;

public class practica3 {
	 public static void main(String[] args) {
	        // Crear un HashMap
	        Map<String, Integer> mapa = new HashMap<>();

	        // Agregar elementos al HashMap
	        mapa.put("Manzana", 10);
	        mapa.put("Banana", 20);
	        mapa.put("Naranja", 15);

	        // Iterar sobre el HashMap
	        System.out.println("Elementos del HashMap:");
	        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	    }
}
