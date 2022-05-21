package com.rhael.triagemspring.repository;

import com.rhael.triagemspring.model.Processo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessoRepository extends JpaRepository<Processo, Long> {
    
}
