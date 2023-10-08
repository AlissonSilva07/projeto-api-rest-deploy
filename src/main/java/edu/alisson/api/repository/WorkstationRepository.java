package edu.alisson.api.repository;

import edu.alisson.api.domain.model.Workstation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkstationRepository extends JpaRepository<Workstation, Long> {
}
