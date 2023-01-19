package com.GS.gestion.de.stock.services.impl;

import com.GS.gestion.de.stock.repository.MvStkRepository;
import com.GS.gestion.de.stock.services.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MvStkServiceImpl {

    private MvStkRepository repository;
    private ArticleService articleService;

    @Autowired
    public MvStkServiceImpl(MvStkRepository repository, ArticleService articleService) {
        this.repository = repository;
        this.articleService = articleService;
    }
}
