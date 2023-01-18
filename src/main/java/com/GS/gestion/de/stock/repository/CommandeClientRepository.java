package com.GS.gestion.de.stock.repository;

import com.GS.gestion.de.stock.model.CommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeClientRepository extends JpaRepository<CommandeClient, Integer> {
}
