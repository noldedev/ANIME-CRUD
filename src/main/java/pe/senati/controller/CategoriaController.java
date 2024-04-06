package pe.senati.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.senati.entity.Categoria;
import pe.senati.service.CategoriaService;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {
		
	@Autowired
	private CategoriaService categoriaService;
	
	public CategoriaController() {}
	
	@GetMapping("/listar")
	public String listar_GET(Map map)
	{
		map.put("bCategoria", categoriaService.findAll());
		
		return "Categoria/listar";
	}
	
	@GetMapping("/registrar")
	public String registrar_GET(Model model)
	{
		Categoria categoriaNull = new Categoria();
		model.addAttribute(categoriaNull);
		
		return "Categoria/registrar";
	}
	
	@PostMapping("/registrar")
	public String registrar_POST(Categoria categoria)
	{
		
		categoriaService.insert(categoria);
		
		return "redirect:/categoria/registrar";
	}
	
	
	@GetMapping("/editar/{categoriaId}")
	public String editar_GET(Model model, Map map, @PathVariable Integer categoriaId) {
		
		Categoria categoriaDb = categoriaService.findById(categoriaId);
		
		model.addAttribute("categoria", categoriaDb);
		
		return "Categoria/editar";
		
	}
	
	@PostMapping("/editar/{categoriaId}")
	public String editar_POST(Categoria categoria) {
		
		categoriaService.update(categoria);
		
		return "redirect:/categoria/listar";
	}
	
	@GetMapping("/borrar/{categoriaId}")
	public String borrar_GET(Model model,@PathVariable Integer categoriaId)
	{
		Categoria categoriaDb = categoriaService.findById(categoriaId);
		model.addAttribute("categoria",categoriaDb);
		
		return "Categoria/borrar";
	}
	
	@PostMapping("/borrar/{categoriaId}")
	public String borrar_POST(Categoria categoria)
	{
		categoriaService.delete(categoria.getCategoriaId());		
		return "redirect:/categoria/listar";
	}
	
	@GetMapping("/detalle/{categoriaId}")
	public String detalle_GET(Model model,@PathVariable Integer categoriaId)
	{
		Categoria categoriaDb=categoriaService.findById(categoriaId);
		model.addAttribute("categoria",categoriaDb);
		
		return "Categoria/detalle";
	}
	
	
	
}
