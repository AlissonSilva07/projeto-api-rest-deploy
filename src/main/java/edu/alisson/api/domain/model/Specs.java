package edu.alisson.api.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_specs")
public class Specs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_spec")
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    private Processador processador;
    private String memoriaRam;
    private String armazenamento;

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }
}
