package com.GS.gestion.de.stock.dto;


import com.GS.gestion.de.stock.model.Adresse;
import com.GS.gestion.de.stock.model.Client;
import com.GS.gestion.de.stock.model.CommandeClient;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ClientDto {

    private Integer id;

    private String nom;

    private String prenom;

    private AdresseDto adresse;

    private String photo;

    private String mail;

    private String numTel;

    @JsonIgnore
    private List<CommandeClientDto> commandelient;


    public Client toEntity(ClientDto clientDto){
     return   Client.builder().build();
    }
}
