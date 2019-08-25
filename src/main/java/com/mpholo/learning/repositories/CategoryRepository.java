package com.mpholo.learning.repositories;

import com.mpholo.learning.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
