package guru.assignment.recipe.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import guru.assignment.recipe.domain.Recipe;
import guru.assignment.recipe.repositories.RecipeRepository;

@Service
public class RecipeServiceImpl implements RecipeService {


	private final RecipeRepository recipeRepository;

	public RecipeServiceImpl(RecipeRepository recipeRepository) {
		this.recipeRepository = recipeRepository;
	}

	@Override
	public Set<Recipe> getRecipe() {
		Set<Recipe> recipeSet = new HashSet<>();
		
		recipeRepository.findAll().iterator().forEachRemaining(recipeSet :: add);
		return recipeSet;
	}





}
