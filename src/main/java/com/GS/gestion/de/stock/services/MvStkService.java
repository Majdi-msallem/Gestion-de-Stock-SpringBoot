package com.GS.gestion.de.stock.services;

import com.GS.gestion.de.stock.dto.MvStkDto;

import java.math.BigDecimal;
import java.util.List;

public interface MvStkService {

    BigDecimal stockReelArticle(Integer idArticle);

    List<MvStkDto> mvtStkArticle(Integer idArticle);

    MvStkDto entreeStock(MvStkDto dto);

    MvStkDto sortieStock(MvStkDto dto);

    MvStkDto correctionStockPos(MvStkDto dto);

    MvStkDto correctionStockNeg(MvStkDto dto);
}
