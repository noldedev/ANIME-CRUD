package pe.senati.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.senati.entity.Empleado;
import pe.senati.service.EmpleadoService;
import pe.senati.service.EstudioService;

@Controller
@RequestMapping("/empleado")
public class EmpleadoController {

	@Autowired
	private EmpleadoService empleadoService;
	
	@Autowired
	private EstudioService estudioService;
	
	public EmpleadoController() {}
	
	@GetMapping("/listar")
	public String listar_GET(Map map)
	{
		map.put("bEmpleado", empleadoService.findAll());
		
		return "Empleado/listar";
	}
	
	@GetMapping("/registrar")
	public String registrar_GET(Model model, Map map)
	{
		Empleado empleadoNull = new Empleado();
		model.addAttribute("empleado",empleadoNull);
		
		map.put("bEstudio", estudioService.findAll());
		
		return "Empleado/registrar";
	}
	
	@PostMapping("/registrar")
	public String registrar_POST(Empleado empleado)
	{
		
		empleadoService.insert(empleado);
		
		return "redirect:/empleado/registrar";
	}
	

	@GetMapping("/editar/{empleadoId}")
	public String editar_GET(Model model, Map map, @PathVariable Integer empleadoId) {
		
		Empleado empleadoDb = empleadoService.findById(empleadoId);
		
		model.addAttribute("empleado", empleadoDb);
		
		map.put("bEstudio", estudioService.findAll());

		
		return "Empleado/editar";
		
	}
	
	@PostMapping("/editar/{empleadoId}")
	public String editar_POST(Empleado empleado) {
		
		empleadoService.update(empleado);
		
		return "redirect:/empleado/listar";
	}
	
	@GetMapping("/borrar/{empleadoId}")
	public String borrar_GET(Model model,@PathVariable Integer empleadoId)
	{
		Empleado empleadoDb = empleadoService.findById(empleadoId);
		model.addAttribute("empleado",empleadoDb);
		
		return "Empleado/borrar";
	}
	
	@PostMapping("/borrar/{empleadoId}")
	public String borrar_POST(Empleado empleado)
	{
		empleadoService.delete(empleado.getEmpleadoId());		
		return "redirect:/empleado/listar";
	}
	
	@GetMapping("/detalle/{empleadoId}")
	public String detalle_GET(Model model,@PathVariable Integer empleadoId)
	{
		Empleado empleadoDb=empleadoService.findById(empleadoId);
		model.addAttribute("empleado",empleadoDb);
		
		return "Empleado/detalle";
	}
	
	
}
