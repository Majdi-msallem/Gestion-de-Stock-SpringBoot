package com.GS.gestion.de.stock.services.impl;

import com.GS.gestion.de.stock.repository.ArticleRepository;
import com.GS.gestion.de.stock.repository.ClientRepository;
import com.GS.gestion.de.stock.repository.CommandeClientRepository;
import com.GS.gestion.de.stock.repository.LigneCommandeClientRepository;
import com.GS.gestion.de.stock.services.MvStkService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CammandeClientServiceImpl {

    private CommandeClientRepository commandeClientRepository;
    private LigneCommandeClientRepository ligneCommandeClientRepository;
    private ClientRepository clientRepository;
    private ArticleRepository articleRepository;
    private MvStkService mvStkService;

    @Autowired
    public CammandeClientServiceImpl(CommandeClientRepository commandeClientRepository,
                                     ClientRepository clientRepository, ArticleRepository articleRepository, LigneCommandeClientRepository ligneCommandeClientRepository,
                                     MvStkService mvStkService) {
        this.commandeClientRepository = commandeClientRepository;
        this.ligneCommandeClientRepository = ligneCommandeClientRepository;
        this.clientRepository = clientRepository;
        this.articleRepository = articleRepository;
        this.mvStkService = mvStkService;
    }
}
