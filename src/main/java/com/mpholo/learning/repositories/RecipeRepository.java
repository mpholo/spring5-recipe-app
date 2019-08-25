package com.mpholo.learning.repositories;

import com.mpholo.learning.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
