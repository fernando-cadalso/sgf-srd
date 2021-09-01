package local.fmc.gsf.srd.infra;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import local.fmc.gsf.srd.dominio.ListaModelo;
@Repository
public interface ListaModeloRepo extends JpaRepository<ListaModelo, Integer>{
	
}
