package pe.senati.controller;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import pe.senati.entity.Imagen;
import pe.senati.service.ImagenService;

@Controller
@RequestMapping("/imagen")
public class ImagenController {
	
	@Autowired
	private ImagenService imagenService;
	
	public ImagenController() {}
	
	@GetMapping("/listar")
	public String listar_GET(Map map)
	{
		map.put("bImagen", imagenService.findAll());
		
		return "Imagen/listar";
	}
	
	//Registrar
	@GetMapping("/registrar")
	public String registrar_GET(Model model)
	{
		Imagen imagenNull = new Imagen();
		model.addAttribute("imagen",imagenNull);
		
		return "Imagen/registrar";
	}
	
	@PostMapping("/registrar")
	public String registrar_POST(@RequestPart("picture") MultipartFile picture) throws IOException
	{
		Imagen imagen = new Imagen();
		imagen.setFile_name(picture.getOriginalFilename());
		imagen.setFile(picture.getBytes());
		
		imagenService.insert(imagen);
		
		return "redirect:/imagen/registrar";
	}
	
	//Editar
	@GetMapping("/editar/{imagenId}")
	public String editar_GET(Model model,@PathVariable Integer imagenId) {
		Imagen imagenDb=imagenService.findById(imagenId);
		model.addAttribute("imagen",imagenDb);
		
		return "Imagen/editar";
	}
	
	@PostMapping("/editar/{imagenId}")
	public String editar_POST(@RequestPart("picture") MultipartFile picture,@PathVariable Integer imagenId) throws IOException {
		Imagen imagen=new Imagen();
		imagen.setImagenId(imagenId);
		imagen.setFile_name(picture.getOriginalFilename());
		imagen.setFile(picture.getBytes());
		
		imagenService.update(imagen);
		
		return "redirect:/imagen/listar";
	}
	
	//Borar
	@GetMapping("/borrar/{imagenId}")
	public String borrar_GET(Model model,@PathVariable Integer imagenId) {

		int count = imagenService.isDelete(imagenId);
        
        Imagen imagenDb =imagenService.findById(imagenId);
        model.addAttribute("imagen",imagenDb);
        
        if(count == 0) {
            return "Imagen/borrar";
        } else {
            return "Imagen/warning";
        }
		
	}
	
	@PostMapping("/borrar/{imagenId}")
	public String borrar_POST(Imagen imagen)
	{
		imagenService.delete(imagen.getImagenId());		
		return "redirect:/imagen/listar";
	}
	
	@GetMapping("/detalle/{imagenId}")
	public String detalle_GET(Model model,@PathVariable Integer imagenId)
	{
		Imagen imagenDb=imagenService.findById(imagenId);
		model.addAttribute("imagen",imagenDb);
		
		return "Imagen/detalle";
	}
	
}
