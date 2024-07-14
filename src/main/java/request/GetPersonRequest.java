package request;

public class GetPersonRequest {

    private int id;

    public GetPersonRequest(){

    }

    public GetPersonRequest(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
