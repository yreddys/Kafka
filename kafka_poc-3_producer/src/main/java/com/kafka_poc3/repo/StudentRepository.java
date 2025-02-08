package com.kafka_poc3.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kafka_poc3.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
