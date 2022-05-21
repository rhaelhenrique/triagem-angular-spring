package com.rhael.triagemspring.controller;

import java.util.List;

import com.rhael.triagemspring.model.Processo;
import com.rhael.triagemspring.repository.ProcessoRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/processos")
@AllArgsConstructor
public class ProcessoController {

    private ProcessoRepository processoRepository;

    @GetMapping
    public List<Processo> list() {
        return processoRepository.findAll();
    }
}