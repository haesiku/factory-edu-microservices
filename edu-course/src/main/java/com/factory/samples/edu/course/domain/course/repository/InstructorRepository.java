package com.factory.samples.edu.course.domain.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.factory.samples.edu.course.domain.course.entity.Instructor;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long> {

}
