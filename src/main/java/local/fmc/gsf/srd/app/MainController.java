package local.fmc.gsf.srd.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import local.fmc.gsf.srd.dominio.Dispensa;
import local.fmc.gsf.srd.dominio.DispensaBuilder;
import local.fmc.gsf.srd.dominio.ItemDeConsumo;
import local.fmc.gsf.srd.dominio.ItemBuilder;
import local.fmc.gsf.srd.infra.DispensaRepo;
import local.fmc.gsf.srd.infra.ItemDeConsumoRepo;

@Controller
@RequestMapping(path = "/")
public class MainController {
	
	@GetMapping
	public String home() {
		return "home";
	}
	
	@GetMapping("/menu-cadastro")
	public String menuCadastro() {
		return "/menu-cadastro";
	}
}
