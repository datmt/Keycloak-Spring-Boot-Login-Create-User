package com.datmt.keycloak.springbootauth.http.requests;

import lombok.Getter;

@Getter
public class LoginRequest {

    String username;
    String password;
}
