package local.fmc.gsf.srd.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
