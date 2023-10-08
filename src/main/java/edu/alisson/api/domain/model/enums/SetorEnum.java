package edu.alisson.api.domain.model.enums;

public enum SetorEnum {
    DEFAULT("Default"),
    ADP("ADP"),
    ATENDIMENTO("ATENDIMENTO"),
    CAIXA("CAIXA"),
    CERTIDOES("CERTIDÕES"),
    CONFERENCIA("CONFERÊNCIA"),
    GDO("GDO"),
    HOMEOFFICE("HOME-OFFICE"),
    IMPRESSAO("IMPRESSÃO"),
    PENDENCIA("PENDÊNCIA"),
    QUALIDADE("QUALIDADE"),
    RESERVA("RESERVA"),
    SECRETARIA("SECRETARIA"),
    SENHAS("SENHAS"),
    TELEFONE("TELEFONE"),
    TI("TI");

    private String descricaoSetor;

    SetorEnum(String descricaoSetor) {
        this.descricaoSetor = descricaoSetor;
    }

    public String getDescricao() {
        return descricaoSetor;
    }
}
