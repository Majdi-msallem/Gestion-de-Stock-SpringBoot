package com.GS.gestion.de.stock.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name= "mvstk")
public class MvStk extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name= "idarticle")
    private Article article;

    @Column(name = "datemvt")
    private Instant dateMvt;

    @Column(name = "quantite")
    private BigDecimal quantite;

    @Column(name = "typemv")
    private TypeMvStk typeMvStk;

    @Column(name = "identreprise")
    private Integer idEntreprise;

    @Column(name = "sourcemvt")
    @Enumerated(EnumType.STRING)
    private SourceMvtStk sourceMvt;
}
