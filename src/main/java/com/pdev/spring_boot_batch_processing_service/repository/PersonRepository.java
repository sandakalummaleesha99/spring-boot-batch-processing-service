package com.pdev.spring_boot_batch_processing_service.repository;

import com.pdev.spring_boot_batch_processing_service.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
