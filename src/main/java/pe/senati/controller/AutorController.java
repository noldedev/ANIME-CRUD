package pe.senati.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.senati.entity.Autor;
import pe.senati.service.AutorService;

@Controller
@RequestMapping("/autor")
public class AutorController {

	@Autowired
	private AutorService autorService;

	public AutorController() {
	}

	@GetMapping("/listar")
	public String listar_GET(Map map) {
		map.put("bAutor", autorService.findAll());

		return "Autor/listar";
	}

	// Registrar
	@GetMapping("/registrar")
	public String registrar_GET(Model model) {
		Autor autorNull = new Autor();
		model.addAttribute(autorNull);

		return "Autor/registrar";
	}

	@PostMapping("/registrar")
	public String registrar_POST(Autor autor) {

		autorService.insert(autor);

		return "redirect:/autor/registrar";
	}

	// Editar
	@GetMapping("/editar/{autorId}")
	public String editar_GET(Model model, Map map, @PathVariable Integer autorId) {

		Autor autorDb = autorService.findById(autorId);

		model.addAttribute("autor", autorDb);

		return "Autor/editar";

	}

	@PostMapping("/editar/{autorId}")
	public String editar_POST(Autor autor) {

		autorService.update(autor);

		return "redirect:/autor/listar";
	}

	// Borrar
	@GetMapping("/borrar/{autorId}")
	public String borrar_GET(Model model, @PathVariable Integer autorId) {
		Autor autorDb = autorService.findById(autorId);
		model.addAttribute("autor", autorDb);

		return "Autor/borrar";
	}

	@PostMapping("/borrar/{autorId}")
	public String borrar_POST(Autor autor) {
		autorService.delete(autor.getAutorId());
		return "redirect:/autor/listar";
	}

	// Detall
	@GetMapping("/detalle/{autorId}")
	public String detalle_GET(Model model, @PathVariable Integer autorId) {
		Autor autorDb = autorService.findById(autorId);
		model.addAttribute("autor", autorDb);

		return "Autor/detalle";
	}

}
