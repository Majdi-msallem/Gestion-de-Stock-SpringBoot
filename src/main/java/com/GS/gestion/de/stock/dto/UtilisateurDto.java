package com.GS.gestion.de.stock.dto;

import com.GS.gestion.de.stock.model.Adresse;
import com.GS.gestion.de.stock.model.Entreprise;
import com.GS.gestion.de.stock.model.Roles;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.List;


@Data
@Builder
public class UtilisateurDto {

    private Integer id;

    private String nom;

    private String prenom;

    private String email;

    private String dateDeNaissance;

    private String motDePasse;

    private AdresseDto adresse;

    private String photo;

    private EntrepriseDto entreprise;

    private List<RolesDto> roles ;
}
