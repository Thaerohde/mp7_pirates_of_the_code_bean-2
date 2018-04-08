package refugeescode.at.Dutchman.dutchmanEndpoint;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import refugeescode.at.Dutchman.model.Treasure;

@RestController
@RequestMapping
public class DutchmanEndpoint {
    @GetMapping("/deadmanchest")
    public Treasure sendTheMessage(Treasure treasure) {
        treasure.setRequest("found the treasure!");
        return treasure;
    }
}
