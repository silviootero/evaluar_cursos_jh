package com.udea.repository;

import com.udea.domain.EvaluationCourse;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the EvaluationCourse entity.
 */
@SuppressWarnings("unused")
@Repository
public interface EvaluationCourseRepository extends JpaRepository<EvaluationCourse, Long> {}
