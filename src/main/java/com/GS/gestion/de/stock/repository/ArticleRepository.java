package com.GS.gestion.de.stock.repository;

import com.GS.gestion.de.stock.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
}
