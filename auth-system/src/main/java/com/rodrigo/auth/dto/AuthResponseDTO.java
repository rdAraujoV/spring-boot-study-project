package com.rodrigo.auth.dto;

public class AuthResponseDTO {
    private String token;

    public AuthResponseDTO() {
    }

    public AuthResponseDTO(String token) {
        this.token = token;
    }

    // getter e setter
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}