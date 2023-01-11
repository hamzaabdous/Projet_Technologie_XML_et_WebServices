package WS;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "ReleveWS")
public class ReleveService {
    @WebMethod(operationName = "Releve")
    public Releve getReleve(){
        Operations listOperations = new Operations(List.of(
                new Operation("test",new Date(),122.8,"cccccc"),
                new Operation("test1",new Date(),122.9,"cccccc")
        ),new Date());
        Releve releve = new Releve(new Date(), (float) (Math.random()*9888),1111111, listOperations);
        return releve;
    }

}
