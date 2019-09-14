package br.com.programandonaraca.converterlocaldate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.programandonaraca.converterlocaldate.model.Pessoa;

@Controller
public class PageController {

	@GetMapping({"/", ""})
	public String index() {
		return "index";
	}
	
	@PostMapping({"/gravar-adados/", "/gravar-dados"})
	public String receberDados(@RequestParam("nome") String nome, @RequestParam("idade") String idade, RedirectAttributes model) {
		
		model.addFlashAttribute("nome", nome);
		model.addFlashAttribute("idade", idade);
		
		return "redirect:/";
	}
	
	@PostMapping({"/gravar-adados-pessoa/", "/gravar-dados-pessoa"})
	public String receberDados(Pessoa pessoa, RedirectAttributes model) {
		
		model.addFlashAttribute("nome", pessoa.getNome());
		model.addFlashAttribute("idade", pessoa.getIdade());
		model.addFlashAttribute("dataNascimento", pessoa.getNascimento());
		model.addFlashAttribute("pessoa", pessoa);
		
		
		return "redirect:/";
	}
	
}
