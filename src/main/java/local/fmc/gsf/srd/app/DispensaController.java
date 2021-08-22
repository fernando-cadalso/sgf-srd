package local.fmc.gsf.srd.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import local.fmc.gsf.srd.dominio.Dispensa;
import local.fmc.gsf.srd.infra.DispensaRepo;

@Controller
@RequestMapping("/dispensa")
public class DispensaController {

	@Autowired
	private DispensaRepo dispensaRepo;
	
	@GetMapping("/form-nova")
	public String novaDispensa() {
		return "dispensa/form-nova";
	}
	
	@GetMapping("/listar")
	public String listarDispensas(Model atributoRequest) {
		Iterable<Dispensa> dispensas = dispensaRepo.findAll();
		/*
		 * Adiciona a lista de dispensa na requisição
		 * como um atributo do cabeçalho HTTP.
		 */
		atributoRequest.addAttribute("listaDeDispensas", dispensas);
		return "dispensa/listar";
	}
}
