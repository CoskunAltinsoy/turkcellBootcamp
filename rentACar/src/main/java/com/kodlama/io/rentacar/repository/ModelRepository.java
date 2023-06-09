package com.kodlama.io.rentacar.repository;

import com.kodlama.io.rentacar.entities.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends JpaRepository<Model, Integer> {
    boolean existsByNameIgnoreCase(String name);
}
