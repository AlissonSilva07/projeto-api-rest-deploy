package edu.alisson.api.domain.model;

import edu.alisson.api.domain.model.enums.SetorEnum;
import jakarta.persistence.*;

@Entity(name = "tb_workstation")
public class Workstation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_workstation")
    private Long id;
    private String titulo;
    private String descricao;
    @Column(unique = true)
    private String patrimonio;
    @Enumerated(EnumType.STRING)
    private SetorEnum setor;
    @OneToOne(cascade = CascadeType.ALL)
    private Specs specs;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(String patrimonio) {
        this.patrimonio = patrimonio;
    }

    public String getSetor() {
        return setor.getDescricao();
    }

    public void setSetor(SetorEnum setor) {
        this.setor = setor;
    }

    public Specs getSpecs() {
        return specs;
    }

    public void setSpecs(Specs specs) {
        this.specs = specs;
    }
}
