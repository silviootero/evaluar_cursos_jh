package com.udea.repository;

import com.udea.domain.EnrollCourse;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the EnrollCourse entity.
 */
@SuppressWarnings("unused")
@Repository
public interface EnrollCourseRepository extends JpaRepository<EnrollCourse, Long> {}
