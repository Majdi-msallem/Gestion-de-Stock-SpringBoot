package com.GS.gestion.de.stock.services.impl;

import com.GS.gestion.de.stock.repository.ArticleRepository;
import com.GS.gestion.de.stock.repository.LigneVenteRepository;
import com.GS.gestion.de.stock.repository.VentesRepository;
import com.GS.gestion.de.stock.services.MvStkService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class VentesServiceImpl {

    private ArticleRepository articleRepository;
    private VentesRepository ventesRepository;
    private LigneVenteRepository ligneVenteRepository;
    private MvStkService mvtStkService;

    @Autowired
    public VentesServiceImpl(ArticleRepository articleRepository, VentesRepository ventesRepository,
                             LigneVenteRepository ligneVenteRepository, MvStkService mvtStkService) {
        this.articleRepository = articleRepository;
        this.ventesRepository = ventesRepository;
        this.ligneVenteRepository = ligneVenteRepository;
        this.mvtStkService = mvtStkService;
    }
}
