package com.GS.gestion.de.stock.services;

import com.GS.gestion.de.stock.dto.ChangerMotDePasseUtilisateurDto;
import com.GS.gestion.de.stock.dto.UtilisateurDto;

import java.util.List;

public interface UtilisateurService {


    UtilisateurDto save(UtilisateurDto dto);

    UtilisateurDto findById(Integer id);

    List<UtilisateurDto> findAll();

    void delete(Integer id);

    UtilisateurDto findByEmail(String email);

    UtilisateurDto changerMotDePasse(ChangerMotDePasseUtilisateurDto dto);

}
