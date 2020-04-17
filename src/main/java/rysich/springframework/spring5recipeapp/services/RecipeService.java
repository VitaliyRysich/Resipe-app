package rysich.springframework.spring5recipeapp.services;

import org.springframework.stereotype.Service;
import rysich.springframework.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(Long l);
}
