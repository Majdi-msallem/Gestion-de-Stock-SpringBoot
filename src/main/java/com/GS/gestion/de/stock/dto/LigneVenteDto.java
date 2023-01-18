package com.GS.gestion.de.stock.dto;

import com.GS.gestion.de.stock.model.LigneVente;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class LigneVenteDto {

    private Integer id;

    private VentesDto vente;

    private ArticleDto article;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

    private Integer idEntreprise;

    public static LigneVenteDto fromEntity(LigneVente ligneVente) {
        if (ligneVente == null) {
            return null;
        }

        return LigneVenteDto.builder()
                .id(ligneVente.getId())
                .vente(VentesDto.fromEntity(ligneVente.getVente()))
                .article(ArticleDto.fromEntity(ligneVente.getArticle()))
                .quantite(ligneVente.getQuantite())
                .prixUnitaire(ligneVente.getPrixUnitaire())
                .idEntreprise(ligneVente.getIdEntreprise())
                .build();
    }

    public static LigneVente toEntity(LigneVenteDto ligneVentedto) {
        if (ligneVentedto == null) {
            return null;
        }
        LigneVente ligneVente = new LigneVente();
        ligneVente.setId(ligneVentedto.getId());
        ligneVente.setVente(VentesDto.toEntity(ligneVentedto.getVente()));
        ligneVente.setArticle(ArticleDto.toEntity(ligneVentedto.getArticle()));
        ligneVente.setQuantite(ligneVentedto.getQuantite());
        ligneVente.setPrixUnitaire(ligneVentedto.getPrixUnitaire());
        ligneVente.setIdEntreprise(ligneVentedto.getIdEntreprise());
        return ligneVente;
    }

}
