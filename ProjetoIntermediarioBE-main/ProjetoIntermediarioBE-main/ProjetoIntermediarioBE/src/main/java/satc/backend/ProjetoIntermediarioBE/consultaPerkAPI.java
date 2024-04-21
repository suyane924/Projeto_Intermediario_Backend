package satc.backend.ProjetoIntermediarioBE;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("consultarPerk")
public class consultaPerkAPI {
    
    @GetMapping("{name}")
    public perkDescricaoDTO consultaPerk (@PathVariable("name") String name) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<perkDescricaoDTO> resp = 
            restTemplate
                .getForEntity("https://dbd.tricky.lol/api/perks", perkDescricaoDTO.class);
        return resp.getBody();
    }

    
}


