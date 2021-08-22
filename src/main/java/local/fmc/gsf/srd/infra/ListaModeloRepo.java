package local.fmc.gsf.srd.infra;

import org.springframework.data.repository.CrudRepository;

import local.fmc.gsf.srd.dominio.ListaModelo;

public interface ListaModeloRepo extends CrudRepository<ListaModelo, Integer>{
	
	ListaModelo findByNomeLike(String nome);

}
