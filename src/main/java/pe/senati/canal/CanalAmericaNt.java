package pe.senati.canal;

import org.springframework.stereotype.Component;

@Component("beanCanalAmericaNt")
public class CanalAmericaNt implements Canal{

	public CanalAmericaNt() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void Subir() {
		System.out.println("Canal America Noticias: En vivo");
	}

}
