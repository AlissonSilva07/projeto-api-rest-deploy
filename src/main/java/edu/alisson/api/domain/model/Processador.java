package edu.alisson.api.domain.model;

import edu.alisson.api.domain.model.enums.FamiliaIntelEnum;
import edu.alisson.api.domain.model.enums.PlataformaEnum;
import jakarta.persistence.*;

@Entity(name = "tb_processador")
public class Processador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_processador")
    private Long id;
    private PlataformaEnum plataforma;
    private FamiliaIntelEnum familia;
    private String modelo;

    public PlataformaEnum getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(PlataformaEnum plataforma) {
        this.plataforma = plataforma;
    }

    public FamiliaIntelEnum getFamilia() {
        return familia;
    }

    public void setFamilia(FamiliaIntelEnum familia) {
        this.familia = familia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
