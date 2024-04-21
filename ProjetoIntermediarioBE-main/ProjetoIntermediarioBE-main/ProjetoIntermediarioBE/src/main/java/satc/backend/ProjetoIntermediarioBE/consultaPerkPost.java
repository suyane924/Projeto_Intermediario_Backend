package satc.backend.ProjetoIntermediarioBE;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("consultarPerk")
public class consultaPerkPost {

    @PostMapping
    public perkDescricaoDTO consultarPerkPorNome(@RequestBody String name) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<perkDescricaoDTO> resp =
            restTemplate
                .postForEntity("https://dbd.tricky.lol/api/perks", name, perkDescricaoDTO.class);
        return resp.getBody();
    }

}
