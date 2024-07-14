package persistence;

import response.GetPersonResponse;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository {

    public static List<GetPersonResponse> personList = new ArrayList<>(List.of(new GetPersonResponse(1,"Felipe", 44),
            new GetPersonResponse(2,"Carlos",23)));


    public static GetPersonResponse getPerson(int id) {
        for (GetPersonResponse person: personList){
            if(person.getId() == id) return person;
        }
        return null;
    }
}
