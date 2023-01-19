package com.GS.gestion.de.stock.services;

import com.GS.gestion.de.stock.dto.ArticleDto;
import com.GS.gestion.de.stock.dto.VentesDto;

import java.util.List;

public interface VentesService {
    VentesDto save(VentesDto dto);

    VentesDto findById(Integer id);

    VentesDto findByCode(String code);

    List<VentesDto> findAll();

    void delete(Integer id);

}
