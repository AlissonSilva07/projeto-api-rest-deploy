package edu.alisson.api.controller;

import edu.alisson.api.domain.model.Workstation;
import edu.alisson.api.service.WorkstationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/workstation")
@CrossOrigin(origins = "*")
public class UserController {
    private final WorkstationService workstationService;

    public UserController(WorkstationService workstationService) {
        this.workstationService = workstationService;
    }

    @GetMapping
    public ResponseEntity<List<Workstation>> procurarTodos() {
        var workstations = workstationService.buscarTodos();
        return ResponseEntity.ok(workstations);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Workstation> procurarPorId(@PathVariable Long id) {
        var workstation = workstationService.buscarPorId(id);
        return ResponseEntity.ok(workstation);
    }

    @PostMapping
    public ResponseEntity<Workstation> criar(@RequestBody Workstation workstationParaCriar) {
        var workstationCreated = workstationService.criar(workstationParaCriar);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(workstationCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(workstationCreated);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Workstation> atualizar(@PathVariable Long id, @RequestBody Workstation workstation) {
        workstationService.atualizar(id, workstation);
        return ResponseEntity.ok(workstation);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        workstationService.deletar(id);
        return ResponseEntity.ok().build();
    }
}
