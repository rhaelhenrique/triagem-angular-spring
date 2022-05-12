package controller;

import org.springframework.web.bind.annotation.*;
import controller.generic.AbstractController;
import model.Analise;
import service.AnaliseService;


@RestController
@RequestMapping("/peticao")
public class AnaliseController extends AbstractController<Analise, AnaliseService> {
    public AnaliseController(AnaliseService service){
        super(service);
    }
}