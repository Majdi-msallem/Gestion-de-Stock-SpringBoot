package com.GS.gestion.de.stock.repository;

import com.GS.gestion.de.stock.model.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FournisseurRepository extends JpaRepository<Fournisseur, Integer> {
}
