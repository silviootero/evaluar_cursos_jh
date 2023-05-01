package com.udea.repository;

import com.udea.domain.EvaluationProfesor;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the EvaluationProfesor entity.
 */
@SuppressWarnings("unused")
@Repository
public interface EvaluationProfesorRepository extends JpaRepository<EvaluationProfesor, Long> {}
