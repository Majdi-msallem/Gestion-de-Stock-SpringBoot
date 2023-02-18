package com.GS.gestion.de.stock.controller.api;


import com.GS.gestion.de.stock.dto.MvStkDto;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.math.BigDecimal;
import java.util.List;

import static com.GS.gestion.de.stock.utils.Constants.APP_ROOT;

@Api("mvtstk")
public interface MvStkApi {

    @GetMapping(APP_ROOT + "/mvtstk/stockreel/{idArticle}")
    BigDecimal stockReelArticle(@PathVariable("idArticle") Integer idArticle);

    @GetMapping(APP_ROOT + "/mvtstk/filter/article/{idArticle}")
    List<MvStkDto> mvtStkArticle(@PathVariable("idArticle") Integer idArticle);

    @PostMapping(APP_ROOT + "/mvtstk/entree")
    MvStkDto entreeStock(@RequestBody MvStkDto dto);

    @PostMapping(APP_ROOT + "/mvtstk/sortie")
    MvStkDto sortieStock(@RequestBody MvStkDto dto);

    @PostMapping(APP_ROOT + "/mvtstk/correctionpos")
    MvStkDto correctionStockPos(@RequestBody MvStkDto dto);

    @PostMapping(APP_ROOT + "/mvtstk/correctionneg")
    MvStkDto correctionStockNeg(@RequestBody MvStkDto dto);
}
