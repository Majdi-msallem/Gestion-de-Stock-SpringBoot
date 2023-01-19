package com.GS.gestion.de.stock.services.impl;

import com.GS.gestion.de.stock.dto.MvStkDto;
import com.GS.gestion.de.stock.repository.MvStkRepository;
import com.GS.gestion.de.stock.services.ArticleService;
import com.GS.gestion.de.stock.services.MvStkService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@Slf4j
public class MvStkServiceImpl implements MvStkService {

    private MvStkRepository repository;
    private ArticleService articleService;

    @Autowired
    public MvStkServiceImpl(MvStkRepository repository, ArticleService articleService) {
        this.repository = repository;
        this.articleService = articleService;
    }

    @Override
    public BigDecimal stockReelArticle(Integer idArticle) {
        return null;
    }

    @Override
    public List<MvStkDto> mvtStkArticle(Integer idArticle) {
        return null;
    }

    @Override
    public MvStkDto entreeStock(MvStkDto dto) {
        return null;
    }

    @Override
    public MvStkDto sortieStock(MvStkDto dto) {
        return null;
    }

    @Override
    public MvStkDto correctionStockPos(MvStkDto dto) {
        return null;
    }

    @Override
    public MvStkDto correctionStockNeg(MvStkDto dto) {
        return null;
    }
}
