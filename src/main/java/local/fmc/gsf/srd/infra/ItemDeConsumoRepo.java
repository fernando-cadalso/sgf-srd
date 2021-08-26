package local.fmc.gsf.srd.infra;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import local.fmc.gsf.srd.dominio.ItemDeConsumo;

public interface ItemDeConsumoRepo extends JpaRepository<ItemDeConsumo, Integer>{

}
