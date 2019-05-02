package guru.assignment.recipe.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import guru.assignment.recipe.domain.Recipe;
import guru.assignment.recipe.repositories.RecipeRepository;

public class RecipeServiceImplTest {
	
	RecipeServiceImpl recipeService;
	
	@Mock
	RecipeRepository recipeRepository;

	@Before
	public void setUp() throws Exception{
		MockitoAnnotations.initMocks(this);
		
		recipeService = new RecipeServiceImpl(recipeRepository);
	}
	
	@Test
	public void testGetRecipe() throws Exception{
		
		Recipe recipe = new Recipe();
		HashSet recipesData = new HashSet();
		recipesData.add(recipe);
		
	
		when(recipeRepository.findAll()).thenReturn(recipesData);
		
		Set<Recipe> recipes = recipeService.getRecipe();
		
		assertEquals(recipes.size(), 1);
		
//		testa se o findAll é chamado apenas 1 vez, não 2 ou 0, mas 1.
		verify(recipeRepository, times(1)).findAll();
	}

}