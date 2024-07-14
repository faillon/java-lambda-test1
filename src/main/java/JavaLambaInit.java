import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import persistence.PersonRepository;
import request.GetPersonRequest;
import response.GetPersonResponse;

public class JavaLambaInit implements RequestHandler<GetPersonRequest, GetPersonResponse> {
    @Override
    public GetPersonResponse handleRequest(GetPersonRequest getPersonRequest, Context context) {
        return PersonRepository.getPerson(getPersonRequest.getId());
    }
}
