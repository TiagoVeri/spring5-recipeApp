//package guru.assignment.recipe.controllers;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import guru.assignment.recipe.service.RecipeService;
//
//@Controller
//public class CategoryController {
//	
//	private final RecipeService recipeService;
//
//	public CategoryController(RecipeService recipeService) {
//		this.recipeService = recipeService;
//	}
//	
//	@RequestMapping("/recipe/show/{id}")
//	public String showById(@PathVariable String id, Model model) {
//		
//		model.addAttribute("recipe", recipeService.findById(new Long(id)));
//		
//		return "recipe/show";
//	}
//
//}
