package it.fucarino.bestofyear.restcontroller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerName {

	@GetMapping("/bestyear")
	public String daiNome(@RequestParam(name =  "name")String nome, Model model) {
		model.addAttribute("name", nome);
		return "best";
	}

}
