package com.GS.gestion.de.stock.repository;

import com.GS.gestion.de.stock.model.MvStk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MvStkRepository extends JpaRepository<MvStk, Integer> {
}
