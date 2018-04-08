package refugeescode.at.Dutchman.model;


import org.springframework.stereotype.Component;

@Component
public class Treasure {

    private String request;

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }
}
