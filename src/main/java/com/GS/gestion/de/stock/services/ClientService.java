package com.GS.gestion.de.stock.services;

import com.GS.gestion.de.stock.dto.ClientDto;

import java.util.List;

public interface ClientService {
    ClientDto save(ClientDto dto);

    ClientDto findById(Integer id);

    List<ClientDto> findAll();

    void delete(Integer id);
}
