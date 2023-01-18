package com.GS.gestion.de.stock.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
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



}
