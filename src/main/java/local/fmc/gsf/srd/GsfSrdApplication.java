package local.fmc.gsf.srd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import local.fmc.gsf.srd.dominio.ItemBuilder;
import local.fmc.gsf.srd.infra.ItemDeConsumoRepo;

@SpringBootApplication
public class GsfSrdApplication {
	
	private static ItemDeConsumoRepo itemRepo;
	
	public GsfSrdApplication(ItemDeConsumoRepo repo) {
		this.itemRepo =repo;
	}

	public static void main(String[] args) {
		SpringApplication.run(GsfSrdApplication.class, args);
	}

}
