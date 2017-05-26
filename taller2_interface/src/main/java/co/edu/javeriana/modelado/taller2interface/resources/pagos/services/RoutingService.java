package co.edu.javeriana.modelado.taller2interface.resources.pagos.services;

import co.edu.javeriana.modelado.taller2interface.resources.pagos.entity.Service;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class RoutingService {

    
    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://taller2:9901/servicios";

    public RoutingService() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("enrutador");
    }

    public Service getService_XML(int serviceId) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}", new Object[]{serviceId}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(Service.class);
    }

    public Service getService_JSON(int serviceId) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}", new Object[]{serviceId}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(Service.class);
    }

    public void close() {
        client.close();
    }
    
    
}
