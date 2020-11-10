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
	
	@PostMapping("/reviewconfirmation")
	public String reviewconfirmation(@RequestParam String name, @RequestParam(required=false) String ranking, @RequestParam String feedback, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("ranking", ranking);
		model.addAttribute("feedback", feedback);
		return "reviewconfirmation";
	}
	
	@GetMapping("/custom")
	public String custom() {
		return "custom";
	}
	
	@PostMapping("/customconfirmation")
	public String customconfirmation(@RequestParam String size, @RequestParam Double toppings, @RequestParam(required=false) boolean gf, @RequestParam String special, Model model) {
		model.addAttribute("size", size);
		model.addAttribute("toppings", toppings);
		model.addAttribute("gf", gf);
		model.addAttribute("special", special);
		
		
		double price=0;
		
		if ("small".equals(size)) {
			price+=7.0 + (toppings*0.5);
		} 
		else if ("medium".equals(size)) {	
			price+=10.0 + (toppings*1.0);
		}
		else if ("large".equals(size)) {	
			price+=12.0 + (toppings*1.25);
		}
		
		if (gf) {
			price+=2.0;
		}
		
		model.addAttribute("price", price);
		
		return "customconfirmation";
	}
	
	
	
}
