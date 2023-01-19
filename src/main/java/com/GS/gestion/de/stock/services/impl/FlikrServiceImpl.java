package com.GS.gestion.de.stock.services.impl;

import com.GS.gestion.de.stock.services.FlickrService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.InputStream;

@Service
@Slf4j
public class FlikrServiceImpl implements FlickrService {
    @Override
    public String savePhoto(InputStream photo, String title) {
        return null;
    }
}
