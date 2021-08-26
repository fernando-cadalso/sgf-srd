package local.fmc.gsf.srd.infra;

import org.springframework.data.jpa.repository.JpaRepository;

import local.fmc.gsf.srd.dominio.ListaModelo;

public interface ListaModeloRepo extends JpaRepository<ListaModelo, Integer>{
	
}
