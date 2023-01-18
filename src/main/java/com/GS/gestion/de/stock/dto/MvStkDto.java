package com.GS.gestion.de.stock.dto;

import com.GS.gestion.de.stock.model.MvStk;
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

    private TypeMvStk typeMvt;

    private Integer idEntreprise;


    public static MvStkDto fromEntity(MvStk mvtStk) {
        if (mvtStk == null) {
            return null;
        }

        return MvStkDto.builder()
                .id(mvtStk.getId())
                .dateMvt(mvtStk.getDateMvt())
                .quantite(mvtStk.getQuantite())
                .article(ArticleDto.fromEntity(mvtStk.getArticle()))
                .typeMvt(mvtStk.getTypeMvStk())
                .idEntreprise(mvtStk.getIdEntreprise())
                .build();
    }

    public static MvStk toEntity(MvStkDto mvStkDtodto) {
        if (mvStkDtodto == null) {
            return null;
        }

        MvStk mvtStk = new MvStk();
        mvtStk.setId(mvStkDtodto.getId());
        mvtStk.setDateMvt(mvStkDtodto.getDateMvt());
        mvtStk.setQuantite(mvStkDtodto.getQuantite());
        mvtStk.setArticle(ArticleDto.toEntity(mvStkDtodto.getArticle()));
        mvtStk.setTypeMvStk(mvStkDtodto.getTypeMvt());
        mvtStk.setIdEntreprise(mvStkDtodto.getIdEntreprise());
        return mvtStk;
    }
}
