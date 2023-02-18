package com.GS.gestion.de.stock.controller;

import com.GS.gestion.de.stock.controller.api.MvStkApi;
import com.GS.gestion.de.stock.dto.MvStkDto;
import com.GS.gestion.de.stock.services.MvStkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class MvStkController implements MvStkApi {
    private MvStkService service;

    @Autowired
    public MvStkController(MvStkService service) {
        this.service = service;
    }

    @Override
    public BigDecimal stockReelArticle(Integer idArticle) {
        return service.stockReelArticle(idArticle);
    }

    @Override
    public List<MvStkDto> mvtStkArticle(Integer idArticle) {
        return service.mvtStkArticle(idArticle);
    }

    @Override
    public MvStkDto entreeStock(MvStkDto dto) {
        return service.entreeStock(dto);
    }

    @Override
    public MvStkDto sortieStock(MvStkDto dto) {
        return service.sortieStock(dto);
    }

    @Override
    public MvStkDto correctionStockPos(MvStkDto dto) {
        return service.correctionStockPos(dto);
    }

    @Override
    public MvStkDto correctionStockNeg(MvStkDto dto) {
        return service.correctionStockNeg(dto);
    }
}
