package pe.senati.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.senati.entity.Pelicula;
import pe.senati.service.PeliculaService;

@Controller
@RequestMapping("/pelicula")
public class PeliculaController {
	
	@Autowired
	private PeliculaService peliculaService;

	public PeliculaController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/listar")
	public String listar_GET(Map map) {
		
		map.put("empresa", "NoldeCode");
		map.put("contacto", 972203511);
		map.put("correo", "socamezareswalter@gmail.com");
		
		map.put("bPeliculas", peliculaService.findAll());
		
		return "Pelicula/listar";
	}
	
	@GetMapping("/registrar")
	public String registrar_GET(Model model) {
		
		//pelicula null
		Pelicula peliculaNull=new Pelicula();
		model.addAttribute("pelicula",peliculaNull);
		return "Pelicula/registrar";
	}
	
	@PostMapping("/registrar")
	public String registrar_POST(Pelicula pelicula) {
		
		peliculaService.insert(pelicula);
		
		return "redirect:/pelicula/listar";
	}
}
