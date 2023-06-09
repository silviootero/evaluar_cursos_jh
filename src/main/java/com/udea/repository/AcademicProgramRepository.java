package com.udea.repository;

import com.udea.domain.AcademicProgram;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the AcademicProgram entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AcademicProgramRepository extends JpaRepository<AcademicProgram, Long> {}
