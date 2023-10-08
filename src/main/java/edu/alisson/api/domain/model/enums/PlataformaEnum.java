package edu.alisson.api.domain.model.enums;

import java.security.PublicKey;

public enum PlataformaEnum {
    INTEL("Intel"),
    AMD("AMD");

    private String plataformaDescricao;

    PlataformaEnum(String plataformaDescricao) {
        this.plataformaDescricao = plataformaDescricao;
    }

    public String getPlataformaDescricao() {
        return plataformaDescricao;
    }
}
