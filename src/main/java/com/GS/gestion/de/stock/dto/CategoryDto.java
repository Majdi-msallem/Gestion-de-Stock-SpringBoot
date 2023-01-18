package com.GS.gestion.de.stock.dto;

import com.GS.gestion.de.stock.model.Category;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class CategoryDto {

    private Integer id;

    private String code;

    private String designation;

    @JsonIgnore
    private List<ArticleDto> articles;

    public  CategoryDto fromEntity(Category category){
        if(category == null){
            return null;
            //ToDo throw an exception
        }
        //Category -> CategoryDto
        return CategoryDto.builder()
                .id(category.getId())
                .code(category.getCode())
                .designation(category.getDesignation())
                .build();
    }

    public Category toEntity(CategoryDto categoryDto){
        if(categoryDto == null){
            return null;
            //ToDo throw an exception
        }
        //Category -> CategoryDto
        return Category.builder()
                .code(categoryDto.getCode())
                .designation(categoryDto.getDesignation())
                .build();
    }


}
