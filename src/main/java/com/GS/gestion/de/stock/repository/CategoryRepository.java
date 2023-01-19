package com.GS.gestion.de.stock.repository;

import com.GS.gestion.de.stock.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    Optional<Category> findCategoryByCode(String code);

}
