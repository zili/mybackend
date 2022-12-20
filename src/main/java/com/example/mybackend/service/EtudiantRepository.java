package com.example.mybackend.service;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<EtudiantEntity, Integer> {
}