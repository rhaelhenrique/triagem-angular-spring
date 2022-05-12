package controller;

import org.springframework.web.bind.annotation.*;
import controller.generic.AbstractController;
import model.Peticao;
import service.PeticaoService;


@RestController
@RequestMapping("/peticao")
public class PeticaoController extends AbstractController<Peticao, PeticaoService> {
    public PeticaoController(PeticaoService service){
        super(service);
    }
}