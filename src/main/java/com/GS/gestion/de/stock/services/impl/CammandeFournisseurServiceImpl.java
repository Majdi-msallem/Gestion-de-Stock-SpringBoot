package com.GS.gestion.de.stock.services.impl;

import com.GS.gestion.de.stock.repository.ArticleRepository;
import com.GS.gestion.de.stock.repository.CommandeFournisseurRepository;
import com.GS.gestion.de.stock.repository.FournisseurRepository;
import com.GS.gestion.de.stock.repository.LigneCommandeFournisseurRepository;
import com.GS.gestion.de.stock.services.MvStkService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CammandeFournisseurServiceImpl {

    private CommandeFournisseurRepository commandeFournisseurRepository;
    private LigneCommandeFournisseurRepository ligneCommandeFournisseurRepository;
    private FournisseurRepository fournisseurRepository;
    private ArticleRepository articleRepository;
    private MvStkService mvtStkService;

    @Autowired
    public CammandeFournisseurServiceImpl(CommandeFournisseurRepository commandeFournisseurRepository,
                                          FournisseurRepository fournisseurRepository, ArticleRepository articleRepository,
                                          LigneCommandeFournisseurRepository ligneCommandeFournisseurRepository, MvStkService mvtStkService) {
        this.commandeFournisseurRepository = commandeFournisseurRepository;
        this.ligneCommandeFournisseurRepository = ligneCommandeFournisseurRepository;
        this.fournisseurRepository = fournisseurRepository;
        this.articleRepository = articleRepository;
        this.mvtStkService = mvtStkService;
    }
}
