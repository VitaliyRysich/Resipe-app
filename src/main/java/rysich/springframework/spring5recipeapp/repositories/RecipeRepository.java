package rysich.springframework.spring5recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import rysich.springframework.spring5recipeapp.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
