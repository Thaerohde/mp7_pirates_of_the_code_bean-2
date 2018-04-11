package refugeescode.at.Dutchman.dutchmanEndpoint;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import refugeescode.at.Dutchman.model.Treasure;

@RequestMapping
@RestController
public class DutchmanEndpoint {

    @GetMapping("/deadmanchest")
    public Treasure sendTheMessage(Treasure treasure) {
        treasure.setMessage("found the treasure!");
        return treasure;
    }

}