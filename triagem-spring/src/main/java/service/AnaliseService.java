package service;

import org.springframework.stereotype.Service;
import model.Analise;
import repository.AnaliseRepository;
import service.generic.AbstractService;

@Service
public class AnaliseService extends AbstractService<Analise, AnaliseRepository> {
    public AnaliseService(AnaliseRepository repository) {
        super(repository);
    }
}