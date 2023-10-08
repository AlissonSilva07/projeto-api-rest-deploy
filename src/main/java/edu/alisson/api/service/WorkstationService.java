package edu.alisson.api.service;

import edu.alisson.api.domain.model.Workstation;

import java.util.List;

public interface WorkstationService {
    List<Workstation> buscarTodos();
    Workstation buscarPorId(Long id);
    Workstation criar(Workstation workstationParaCriar);
    void atualizar(Long id, Workstation workstation);
    void deletar(Long id);
}
