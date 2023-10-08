package edu.alisson.api.domain.model.enums;

public enum FamiliaIntelEnum {
    CELERON("Celeron"),
    PENTIUM("Pentium"),
    INTEL_CORE_I3("Intel Core i3"),
    INTEL_CORE_I5("Intel Core i5"),
    INTEL_CORE_I7("Intel Core i7"),
    INTEL_CORE_I9("Intel Core i9"),
    ;

    private String familiaDescricao;

    FamiliaIntelEnum(String familiaDescricao) {
        this.familiaDescricao = familiaDescricao;
    }

    public String getFamiliaDescricao() {
        return familiaDescricao;
    }
}
