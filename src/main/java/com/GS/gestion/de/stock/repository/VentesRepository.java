package com.GS.gestion.de.stock.repository;

import com.GS.gestion.de.stock.model.Ventes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentesRepository extends JpaRepository<Ventes, Integer> {
}
