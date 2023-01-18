package com.GS.gestion.de.stock.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder

public class LigneVentDto {

    private Integer id;

    private VentesDto ventes;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;
}
