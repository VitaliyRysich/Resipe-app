package rysich.springframework.spring5recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import rysich.springframework.spring5recipeapp.domain.Category;

public interface CategotyRepository extends CrudRepository<Category, Long> {
}
