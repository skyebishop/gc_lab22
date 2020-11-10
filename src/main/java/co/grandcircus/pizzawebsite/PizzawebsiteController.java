package co.grandcircus.pizzawebsite;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PizzawebsiteController {
 
	@GetMapping("/homepage")
	public String homepage() {
		return "homepage";
	}
	
	@GetMapping("/specialty")
	public String specialty(String name, Double price, Model model ) {
		model.addAttribute("name", name);
		model.addAttribute("price", price);
		return "specialty";
	}
	@GetMapping("/review")
	public String review() {
		return "review";
	}
	
	@PostMapping("/confirmation")
	public String confirmation(@RequestParam String name, @RequestParam(required=false) String ranking, @RequestParam String feedback, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("ranking", ranking);
		model.addAttribute("feedback", feedback);
		return "confirmation";
	}
	
	
	
}
