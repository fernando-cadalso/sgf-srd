package local.fmc.gsf.srd.infra;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import local.fmc.gsf.srd.dominio.Dispensa;

@Repository
public interface DispensaRepo extends JpaRepository<Dispensa, Integer>{

}
