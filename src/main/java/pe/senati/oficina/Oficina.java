package pe.senati.oficina;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import pe.senati.canal.CanalATV;
import pe.senati.canal.CanalAmericaNt;
@Component("beanOficina")
public class Oficina {
	
	@Autowired
	@Qualifier("beanNoticiaATV")
	private CanalATV canalATV;
	
	public Oficina() {
		// TODO Auto-generated constructor stub
	}
	
	public void reproducirCanal() {
		canalATV.Subir();
	}
}
