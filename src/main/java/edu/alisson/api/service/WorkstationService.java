package edu.alisson.api.service;

import edu.alisson.api.domain.model.Workstation;

public interface WorkstationService {
    Workstation buscarPorId(Long id);
    Workstation criar(Workstation workstationParaCriar);
}
