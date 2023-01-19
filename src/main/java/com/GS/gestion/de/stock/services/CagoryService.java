package com.GS.gestion.de.stock.services;

import com.GS.gestion.de.stock.dto.CategoryDto;

import java.util.List;

public interface CagoryService {
    CategoryDto save(CategoryDto dto);

    CategoryDto findById(Integer id);

    CategoryDto findByCode(String code);

    List<CategoryDto> findAll();

    void delete(Integer id);
}
