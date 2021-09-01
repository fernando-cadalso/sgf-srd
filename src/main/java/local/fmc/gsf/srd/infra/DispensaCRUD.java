package local.fmc.gsf.srd.infra;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import local.fmc.gsf.srd.dominio.Dispensa;

@Service
public class DispensaCRUD {

	@Autowired
	private DispensaRepo dispensaRepo;

	public List<Dispensa> recuperaTodos() {
		return dispensaRepo.findAll();
	}

	public void criar(Dispensa novaDispensa) {
		dispensaRepo.save(novaDispensa);
	}

}
