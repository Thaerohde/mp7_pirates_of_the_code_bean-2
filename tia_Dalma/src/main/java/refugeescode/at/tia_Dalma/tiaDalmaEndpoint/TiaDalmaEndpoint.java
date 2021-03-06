package refugeescode.at.tia_Dalma.tiaDalmaEndpoint;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TiaDalmaEndpoint {


    @Value("${dutchman.location}")
    private String dutchmanUrl;

    @GetMapping("/dutchman")
    public String getDutchmanUrl(){
        return dutchmanUrl;
    }

}
