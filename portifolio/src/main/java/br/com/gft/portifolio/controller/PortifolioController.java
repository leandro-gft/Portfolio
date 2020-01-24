package br.com.gft.portifolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
	

@Controller
public class PortifolioController {
	
	@RequestMapping("/home")
		public String getHome() {
		return "home";
	}
	
	@RequestMapping("/contato")
	public String getContato() {
	return "contato";
}
	
	@RequestMapping("/projetos")
	public String getProjetos() {
	return "projetos";
}
	
	@RequestMapping("/skills")
	public String getSkills() {
	return "skills";
}
	
	@RequestMapping("/education")
	public String getEducation() {
	return "education";
}
	
	
	@RequestMapping("/about")
	public String getAbout() {
	return "about";
}
	
	
	
}
