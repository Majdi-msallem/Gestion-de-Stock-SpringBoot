package com.GS.gestion.de.stock.dto;

import com.GS.gestion.de.stock.model.TypeMvStk;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder

public class MvStkDto {

    private Integer id;

    private ArticleDto article;

    private Instant dateMvt;

    private BigDecimal quantite;

    private TypeMvStk typeMvStk;
}
