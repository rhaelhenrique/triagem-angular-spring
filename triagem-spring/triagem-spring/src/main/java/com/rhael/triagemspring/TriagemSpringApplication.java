package com.rhael.triagemspring;

import com.rhael.triagemspring.model.Processo;
import com.rhael.triagemspring.repository.ProcessoRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TriagemSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TriagemSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDataBase(ProcessoRepository processoRepository) {
		return args -> {
			processoRepository.deleteAll();

			Processo p = new Processo();
			p.setAutor("Rhael Henrique Rodrigues");
			p.setGratuita("Sim");
			p.setValor("R$ 1.000,00");

			processoRepository.save(p);
		};
	}
}
