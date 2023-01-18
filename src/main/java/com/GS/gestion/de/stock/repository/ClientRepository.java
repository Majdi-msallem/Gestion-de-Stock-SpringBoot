package com.GS.gestion.de.stock.repository;

import com.GS.gestion.de.stock.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository  extends JpaRepository<Client, Integer> {
}
