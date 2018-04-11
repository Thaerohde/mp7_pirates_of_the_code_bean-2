package refugeescode.at.jack_sparrow.initialise;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import refugeescode.at.jack_sparrow.model.Treasure;

@Configuration
public class JackSparrowStarter {

    @Value("${TiaDalma.DutchmanLocation}")
    private String dutchmanUrl;

    @Bean
    public ApplicationRunner startApplication(RestTemplate restTemplate) {
        return args -> {
            ResponseEntity<String> dutchmanEntity = restTemplate.getForEntity(dutchmanUrl, String.class);
            String dutchmanPlace = dutchmanEntity.getBody();
            ResponseEntity<Treasure> messageEntity = restTemplate.getForEntity(dutchmanPlace, Treasure.class);
            Treasure treasure = messageEntity.getBody();
            System.out.println(treasure.getMessage());
        };
    }
}




