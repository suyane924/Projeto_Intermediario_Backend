package satc.backend.ProjetoIntermediarioBE;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ajuda")
public class ajuda {

    @GetMapping
    public String obterAjuda() {
        return "{\"estudante\": \"Suyane\", \"projeto\": \"Projeto Intermediário\"}";
    }

}