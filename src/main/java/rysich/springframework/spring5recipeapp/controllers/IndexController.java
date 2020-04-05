package rysich.springframework.spring5recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import rysich.springframework.spring5recipeapp.domain.Category;
import rysich.springframework.spring5recipeapp.domain.UnitOfMeasure;
import rysich.springframework.spring5recipeapp.repositories.CategoryRepository;
import rysich.springframework.spring5recipeapp.repositories.UnitOfMeasureRepository;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categotyRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categotyRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categotyRepository = categotyRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional = categotyRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Cat Id is: " + categoryOptional.get().getId());
        System.out.println("UOM Id is: " + unitOfMeasure.get().getId());

        return "index";
    }


}
