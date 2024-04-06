package pe.senati.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.senati.entity.Anime;
import pe.senati.service.AnimeService;
import pe.senati.service.AutorService;
import pe.senati.service.EstudioService;
import pe.senati.service.ImagenService;

@Controller
@RequestMapping("/anime")
public class AnimeController {

	@Autowired
	private AnimeService animeService;
	
	@Autowired
	private AutorService autorService;
	
	@Autowired
	private EstudioService estudioService;
	
	@Autowired
	private ImagenService imagenService;

	@GetMapping("/listar")
	public String listar_GET(Map map) {
		map.put("bAnimes", animeService.findAll());
		map.put("precio", animeService.sumar());

		return "Anime/listar";
	}

	// REGISTRAR
	@GetMapping("/registrar")
	public String registrar_GET(Model model, Map map) {

		Anime animeNull = new Anime();
		model.addAttribute("anime", animeNull);
		
		map.put("bAutor", autorService.findAll());
		map.put("bEstudio", estudioService.findAll());
		map.put("bImagen", imagenService.findAll());
		
		return "Anime/registrar";
	}

	@PostMapping("/registrar")
	public String registrar_POST(Anime anime) {

		animeService.insert(anime);

		return "redirect:/anime/listar";
	}

	// EDITAR
	@GetMapping("/editar/{animeId}")
	public String editar_GET(Model model, Map map, @PathVariable Integer animeId) {

		Anime animeDb = animeService.findById(animeId);

		model.addAttribute("anime", animeDb);
		
		map.put("bAutor", autorService.findAll());
		map.put("bEstudio", estudioService.findAll());
		map.put("bImagen", imagenService.findAll());

		return "Anime/editar";
	}

	@PostMapping("/editar/{animeId}")
	public String editar_GET(Anime anime) {

		animeService.update(anime);

		return "redirect:/anime/listar";
	}

	// ELIMINAR
	@GetMapping("/eliminar/{animeId}")
	public String eliminar_GET(@PathVariable Integer animeId) {
		animeService.delete(animeId);

		return "redirect:/anime/listar";
	}
	
	
	// DETALLE
	@GetMapping("/detalle/{animeId}")
	public String detalle_GET(Model model, @PathVariable Integer animeId) {

		Anime animeDb = animeService.findById(animeId);

		model.addAttribute("anime", animeDb);

		return "Anime/detalle";

	}
}
