package edu.alisson.api.service.impl;

import edu.alisson.api.domain.model.Workstation;
import edu.alisson.api.repository.WorkstationRepository;
import edu.alisson.api.service.WorkstationService;
import org.springframework.stereotype.Service;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class WorkstationServiceImpl implements WorkstationService {

    private final WorkstationRepository workstationRepository;

    public WorkstationServiceImpl(WorkstationRepository workstationRepository) {
        this.workstationRepository = workstationRepository;
    }

    @Override
    public List<Workstation> buscarTodos() {
        return workstationRepository.findAll();
    }

    @Override
    public Workstation buscarPorId(Long id) {
        return workstationRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Workstation criar(Workstation workstationParaCriar) {
        if (workstationParaCriar.getId() != null && workstationRepository.existsById(workstationParaCriar.getId())) {
            throw new IllegalArgumentException("Esse ID já existe.");
        }
        return workstationRepository.save(workstationParaCriar);
    }

    @Override
    public void atualizar(Long id, Workstation workstation) {
        Optional<Workstation> workstationBD = workstationRepository.findById(id);
        if (workstationBD.isPresent()) {
            workstationRepository.save(workstation);
        }
    }

    @Override
    public void deletar(Long id) {
        workstationRepository.deleteById(id);
    }
}
