package com.GS.gestion.de.stock.repository;

import com.GS.gestion.de.stock.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepositroy extends JpaRepository<Article, Integer> {
}
