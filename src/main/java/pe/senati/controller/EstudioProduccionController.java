package pe.senati.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.senati.entity.Estudioproduccion;
import pe.senati.service.EstudioService;

@Controller
@RequestMapping("/estudio")
public class EstudioProduccionController {

	
	@Autowired
	private EstudioService estudioService;
	
	public EstudioProduccionController() {}
	
	@GetMapping("/listar")
	public String listar_GET(Map map)
	{
		map.put("bEstudio", estudioService.findAll());
		
		return "Estudio/listar";
	}
	
	@GetMapping("/registrar")
	public String registrar_GET(Model model)
	{
		Estudioproduccion estudioNull = new Estudioproduccion();
		model.addAttribute("estudios", estudioNull);
		
		return "Estudio/registrar";
	}
	
	@PostMapping("/registrar")
	public String registrar_POST(Estudioproduccion estudioproduccion)
	{
		
		estudioService.insert(estudioproduccion);
		
		return "redirect:/estudio/registrar";
	}
	
	@GetMapping("/editar/{estudioId}")
	public String editar_GET(Model model, Map map, @PathVariable Integer estudioId) {
		
		Estudioproduccion estudioDb = estudioService.findById(estudioId);
		
		model.addAttribute("estudios", estudioDb);
		
		return "Estudio/editar";
		
	}
	
	@PostMapping("/editar/{estudioId}")
	public String editar_POST(Estudioproduccion estudioproduccion) {
		
		estudioService.update(estudioproduccion);
		
		return "redirect:/estudio/listar";
	}
	
	@GetMapping("/borrar/{estudioId}")
	public String borrar_GET(Model model,@PathVariable Integer estudioId)
	{
		Estudioproduccion estudioDb = estudioService.findById(estudioId);
		model.addAttribute("estudios",estudioDb);
		
		return "Estudio/borrar";
	}
	
	@PostMapping("/borrar/{estudioId}")
	public String borrar_POST(Estudioproduccion estudioproduccion)
	{
		estudioService.delete(estudioproduccion.getEstudioId());		
		return "redirect:/estudio/listar";
	}
	
	@GetMapping("/detalle/{estudioId}")
	public String detalle_GET(Model model,@PathVariable Integer estudioId)
	{
		Estudioproduccion estudioDb=estudioService.findById(estudioId);
		model.addAttribute("estudios",estudioDb);
		
		return "Estudio/detalle";
	}
	
}
