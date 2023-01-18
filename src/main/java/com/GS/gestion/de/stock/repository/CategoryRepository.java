package com.GS.gestion.de.stock.repository;

import com.GS.gestion.de.stock.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
