package com.example.warhammerBack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.warhammerBack.model.entity.Castas;

public interface CastasRepository extends JpaRepository<Castas, Long> {
    
}
