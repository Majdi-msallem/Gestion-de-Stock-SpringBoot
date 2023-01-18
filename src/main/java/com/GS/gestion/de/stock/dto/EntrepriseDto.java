package com.GS.gestion.de.stock.dto;

import com.GS.gestion.de.stock.model.Adresse;
import com.GS.gestion.de.stock.model.Utilisateur;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.util.List;


@Data
@Builder
public class EntrepriseDto {

    private Integer id;

    private String nom ;

    private String description ;

    private AdresseDto adresse ;

    private String codeFiscal ;

    private String photo ;

    private String email ;

    private String numTel ;

    private String steWeb ;

    private List<UtilisateurDto> utilisateurs;
}
