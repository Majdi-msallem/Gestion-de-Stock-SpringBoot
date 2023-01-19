package com.GS.gestion.de.stock.services.impl;


import com.GS.gestion.de.stock.repository.ArticleRepository;
import com.GS.gestion.de.stock.repository.LigneCommandeClientRepository;
import com.GS.gestion.de.stock.repository.LigneCommandeFournisseurRepository;
import com.GS.gestion.de.stock.repository.LigneVenteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ArticleServiceImpl {

    private ArticleRepository articleRepository;
    private LigneVenteRepository venteRepository;
    private LigneCommandeFournisseurRepository commandeFournisseurRepository;
    private LigneCommandeClientRepository commandeClientRepository;

    @Autowired
    public ArticleServiceImpl(
            ArticleRepository articleRepository,
            LigneVenteRepository venteRepository, LigneCommandeFournisseurRepository commandeFournisseurRepository,
            LigneCommandeClientRepository commandeClientRepository) {
        this.articleRepository = articleRepository;
        this.venteRepository = venteRepository;
        this.commandeFournisseurRepository = commandeFournisseurRepository;
        this.commandeClientRepository = commandeClientRepository;
    }
}
