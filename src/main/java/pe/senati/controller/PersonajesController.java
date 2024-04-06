package pe.senati.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.senati.entity.Personajes;
import pe.senati.service.AnimeService;
import pe.senati.service.PersonajesServices;

@Controller
@RequestMapping("/personaje")
public class PersonajesController {
	
	
	@Autowired
	private PersonajesServices personajesServices;
	
	@Autowired
	private AnimeService animeService;
	
	public PersonajesController() {}
	
	@GetMapping("/listar")
	public String listar_GET(Map map)
	{
		map.put("bPersonaje", personajesServices.findAll());
		
		return "Personaje/listar";
	}
	
	@GetMapping("/registrar")
	public String registrar_GET(Model model, Map map)
	{
		Personajes personajesNull = new Personajes();
		model.addAttribute("personajes",personajesNull);
		
		map.put("bAnimes", animeService.findAll());
		
		return "Personaje/registrar";
	}
	
	@PostMapping("/registrar")
	public String registrar_POST(Personajes personajes)
	{
		
		personajesServices.insert(personajes);
		
		return "redirect:/personaje/registrar";
	}
	
		
	@GetMapping("/editar/{personajeId}")
	public String editar_GET(Model model, Map map, @PathVariable Integer personajeId) {
		
		Personajes personajesDb = personajesServices.findById(personajeId);
		
		model.addAttribute("personajes", personajesDb);
		
		map.put("bAnimes", animeService.findAll());

		
		return "Personaje/editar";
		
	}
	
	@PostMapping("/editar/{personajeId}")
	public String editar_POST(Personajes personajes) {
		
		personajesServices.update(personajes);
		
		return "redirect:/personaje/listar";
	}
	
	@GetMapping("/borrar/{personajeId}")
	public String borrar_GET(Model model,@PathVariable Integer personajeId)
	{
		Personajes personajesDb = personajesServices.findById(personajeId);
		model.addAttribute("personajes",personajesDb);
		
		return "Personaje/borrar";
	}
	
	@PostMapping("/borrar/{personajeId}")
	public String borrar_POST(Personajes personajes)
	{
		personajesServices.delete(personajes.getPersonajeId());		
		return "redirect:/personaje/listar";
	}
	
	@GetMapping("/detalle/{personajeId}")
	public String detalle_GET(Model model,@PathVariable Integer personajeId)
	{
		Personajes personajesDb=personajesServices.findById(personajeId);
		model.addAttribute("personajes",personajesDb);
		
		return "Personaje/detalle";
	}
	
	
}
