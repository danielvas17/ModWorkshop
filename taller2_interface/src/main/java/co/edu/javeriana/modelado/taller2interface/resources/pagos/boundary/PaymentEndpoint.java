package co.edu.javeriana.modelado.taller2interface.resources.pagos.boundary;


import co.edu.javeriana.modelado.taller2interface.resources.pagos.entity.Response;
import co.edu.javeriana.modelado.taller2interface.resources.pagos.entity.Service;
import co.edu.javeriana.modelado.taller2interface.resources.pagos.services.RoutingService;
import co.edu.javeriana.modelado.taller2interface.resources.pagos.services.RoutingSessionBean;
import co.edu.javeriana.modelado.taller2interface.resources.pagos.services.RoutingSessionBeanLocal;
import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


@Path("pagos")
public class PaymentEndpoint {
    
    @Inject
    RoutingSessionBeanLocal routingService;

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response getPago() {
            RoutingService router = new RoutingService();
            Service service = router.getService_JSON(1);
            router.close();
//        Service service = routingService.getService(1);
        return new Response(200, "codigo" + service);
    }

    @POST
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response doPago() {
        // pago
        return new Response(200, "codigo");
    }

    @DELETE
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response compensatePago() {
        // compensar
        return new Response(200, "codigo");
    }
}