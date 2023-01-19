package com.GS.gestion.de.stock.services;

import com.GS.gestion.de.stock.dto.ArticleDto;
import com.GS.gestion.de.stock.dto.LigneCommandeClientDto;
import com.GS.gestion.de.stock.dto.LigneCommandeFournisseurDto;
import com.GS.gestion.de.stock.dto.LigneVenteDto;

import java.util.List;

public interface ArticleService {
    ArticleDto save(ArticleDto dto);

    ArticleDto findById(Integer id);

    ArticleDto findByCodeArticle(String codeArticle);

    List<ArticleDto> findAll();

    List<LigneVenteDto> findHistoriqueVentes(Integer idArticle);

    List<LigneCommandeClientDto> findHistoriaueCommandeClient(Integer idArticle);

    List<LigneCommandeFournisseurDto> findHistoriqueCommandeFournisseur(Integer idArticle);

    List<ArticleDto> findAllArticleByIdCategory(Integer idCategory);

    void delete(Integer id);
}
