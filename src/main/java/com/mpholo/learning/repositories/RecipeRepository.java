package com.mpholo.learning.repositories;

import com.mpholo.learning.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {

}
