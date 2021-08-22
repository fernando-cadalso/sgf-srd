package local.fmc.gsf.srd.infra;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import local.fmc.gsf.srd.dominio.Dispensa;

@Repository
public interface DispensaRepo extends CrudRepository<Dispensa, Integer>{

	Dispensa findByNomeLike(String nome);
}
