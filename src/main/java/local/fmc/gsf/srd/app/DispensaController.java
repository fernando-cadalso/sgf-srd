package local.fmc.gsf.srd.app;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import local.fmc.gsf.srd.dominio.Dispensa;
import local.fmc.gsf.srd.infra.DispensaCRUD;

@Controller
@RequestMapping("/dispensa")
public class DispensaController {

	private final DispensaCRUD dispensaCRUD;
	
	public DispensaController(DispensaCRUD dispensaCRUD) {
		this.dispensaCRUD = dispensaCRUD;
	}

	@GetMapping
	public String listarDispensas(Model atributoRequest) {
		List<Dispensa> dispensas = dispensaCRUD.recuperaTodos();
		/*
		 * Adiciona a lista de dispensa na requisição
		 * como um atributo do cabeçalho HTTP.
		 */
		atributoRequest.addAttribute("listaDeDispensas", dispensas);
		return "dispensa/listar";
	}
	@GetMapping("/form-nova")
	public String novaDispensa() {
		return "dispensa/form-nova";
	}
	
	@PostMapping("/salvar")
	public String salvar(@Valid RealizaDispensa requisicao, BindingResult resultadoValidacao) {
		if(resultadoValidacao.hasErrors()) {
			return "dispensa/form-nova";
		}
		Dispensa novaDispensa = requisicao.toDispensa();
		dispensaCRUD.criar(novaDispensa);
		return "redirect:/dispensa";
	}
}
