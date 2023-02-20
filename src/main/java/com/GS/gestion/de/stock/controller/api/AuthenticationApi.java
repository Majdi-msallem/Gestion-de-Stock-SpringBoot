package com.GS.gestion.de.stock.controller.api;

import com.GS.gestion.de.stock.dto.auth.AuthenticationRequest;
import com.GS.gestion.de.stock.dto.auth.AuthenticationResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import static com.GS.gestion.de.stock.utils.Constants.AUTHENTICATION_ENDPOINT;

public interface AuthenticationApi {
    @PostMapping(AUTHENTICATION_ENDPOINT + "/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request);
}
