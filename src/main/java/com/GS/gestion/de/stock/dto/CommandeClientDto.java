package com.GS.gestion.de.stock.dto;

import com.GS.gestion.de.stock.model.Client;
import com.GS.gestion.de.stock.model.LigneCommandeClient;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class CommandeClientDto {

    private Integer id;

    private String code;

    private Instant dateCommande;

    private ClientDto client ;

    private List<LigneCommandeClientDto> ligneCommandeClientList;
}
