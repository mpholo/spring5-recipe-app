package com.mpholo.learning.controllers;

import com.mpholo.learning.domain.Category;
import com.mpholo.learning.domain.Recipe;
import com.mpholo.learning.domain.UnitOfMeasure;
import com.mpholo.learning.repositories.CategoryRepository;
import com.mpholo.learning.repositories.UnitOfMeasureRepository;
import com.mpholo.learning.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.Optional;
import java.util.Set;

@Slf4j
@Controller
public class IndexController {


    private RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        log.debug("I'm in the indecController");
        this.recipeService = recipeService;
    }

    @RequestMapping({"/","/index",""})
    public String getIndexPage(Model model) {
       log.debug("Getting Index page");

        Set<Recipe> recipes = recipeService.getAll();
        model.addAttribute("recipes",recipes);

        return "index";
    }
}
