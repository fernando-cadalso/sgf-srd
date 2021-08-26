package local.fmc.gsf.srd.app;

import java.time.LocalDateTime;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import local.fmc.gsf.srd.dominio.Dispensa;
import local.fmc.gsf.srd.dominio.ItemDeConsumo;
import local.fmc.gsf.srd.dominio.ListaModelo;
import local.fmc.gsf.srd.infra.DispensaRepo;
import local.fmc.gsf.srd.infra.ItemDeConsumoRepo;
import local.fmc.gsf.srd.infra.ListaModeloRepo;

@Controller
@RequestMapping(path = "/item")
public class ItemDeConsumoController {

	@Autowired
	private ItemDeConsumoRepo itemRepo;
	
	@Autowired
	private ListaModeloRepo listaModeloRepo;
	
	@Autowired
	private DispensaRepo dispensaRepo;

	@GetMapping("/form-nova")
	public String novaLista(GravarLista requisicao) {
		return "item/form-nova";
	}
	
	@GetMapping("/form-novo")
	public String novoItem(GravarItem requisicao, Model listaDeDispensas, Model listaModelo) {
	
		Iterable<Dispensa> dispensas = dispensaRepo.findAll();
		listaDeDispensas.addAttribute("listaDeDispensas", dispensas);
		
		
		Iterable<ListaModelo> listasModelo = listaModeloRepo.findAll();
		listaModelo.addAttribute("listasModelo", listasModelo);
		return "item/form-novo";
	}
	
	@PostMapping("/gravar")
	public String gravarItem(@Valid GravarItem requisicao, BindingResult resultadoValidacao) {
		/*
		 * Verifica o resultado do processo de validação dos campos do formulário.
		 */
		if(resultadoValidacao.hasErrors()) {
			
			System.out.println(String.valueOf(LocalDateTime.now()).concat("  ").concat(String.valueOf(resultadoValidacao.getFieldError())));
			return "item/form-novo";
		}
		
		ItemDeConsumo novoItem = requisicao.toItemDeConsumo(dispensaRepo, listaModeloRepo);
		itemRepo.save(novoItem);

		
		return "item/form-novo";
	}
	
	@PostMapping("/gravar-lista")
	public String gravarLista(@Valid GravarLista requisicao, BindingResult resultadoValidacao) {
		
		/*
		 * Valida o processo de verificação dos atributos preenchidos
		 * e redireciona para o formulário para correção.
		 */
		if (resultadoValidacao.hasErrors()){
			System.out.println(String.valueOf(LocalDateTime.now()).concat("  ").concat(String.valueOf(resultadoValidacao.getFieldError())));
			return "item/form-nova";
		}
		ListaModelo novaLista = requisicao.toListaModelo();
		
		listaModeloRepo.save(novaLista);
		
		return "redirect:/item/form-nova";
	}

	@GetMapping(path = "/itens")
	public @ResponseBody Iterable<ItemDeConsumo> listarItens() {
		return itemRepo.findAll();
	}
}
