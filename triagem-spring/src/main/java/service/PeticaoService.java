package service;

import org.springframework.stereotype.Service;
import model.Peticao;
import repository.PeticaoRepository;
import service.generic.AbstractService;

@Service
public class PeticaoService extends AbstractService<Peticao, PeticaoRepository> {
    public PeticaoService(PeticaoRepository repository) {
        super(repository);
    }
}