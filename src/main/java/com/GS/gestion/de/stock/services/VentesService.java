package com.GS.gestion.de.stock.services;

import com.GS.gestion.de.stock.dto.ArticleDto;

import java.util.List;

public interface VentesService {
    ArticleDto save(ArticleDto dto);

    ArticleDto findById(Integer id);

    ArticleDto findByCodeArticle(String codeArticle);

    List<ArticleDto> findAll();
    void delete(Integer id);

}
