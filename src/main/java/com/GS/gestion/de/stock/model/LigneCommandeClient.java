package com.GS.gestion.de.stock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name= "lignecommande")
public class LigneCommandeClient extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name= "idarticle")
    private Article article;

    @ManyToOne
    @JoinColumn(name = "idcomma,declient")
    private CommandeClient commandeClient;
}
