package pe.senati;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import pe.senati.canal.CanalATV;
import pe.senati.oficina.Oficina;

@SpringBootApplication
public class SocaMezaresApplication implements CommandLineRunner {

	@Autowired
	private ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(SocaMezaresApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Oficina  oficina = (Oficina)context.getBean("beanOficina");
		oficina.reproducirCanal();
	}
	
	@Bean(name = "beanNoticiaATV")
	public CanalATV canalATV() {
		return new CanalATV();
	}

}
