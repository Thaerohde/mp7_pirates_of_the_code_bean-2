package refugeescode.at.Dutchman.model;


import org.springframework.stereotype.Component;

@Component
public class Treasure {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}