package com.GS.gestion.de.stock.repository;

import com.GS.gestion.de.stock.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
}
