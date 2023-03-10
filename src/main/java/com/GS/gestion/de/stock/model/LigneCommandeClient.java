package com.GS.gestion.de.stock.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

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
    @JoinColumn(name = "idcommandeclient")
    private CommandeClient commandeClient;

    @Column(name ="quantite")
    private BigDecimal quantite;

    @Column(name = "identreprise")
    private Integer idEntreprise;

    @Column(name= "prixunitaire")
    private BigDecimal prixUnitaire;
}
