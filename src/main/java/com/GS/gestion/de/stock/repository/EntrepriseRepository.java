package com.GS.gestion.de.stock.repository;

import com.GS.gestion.de.stock.model.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntrepriseRepository extends JpaRepository<Entreprise, Integer> {
}
