package co.edu.javeriana.aes.modyval.router.taller2router.boundary;


import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/router")
public class RouterEndpoint {

	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response doGet() {
		return Response.ok("Hello from WildFly Swarm!").build();
	}
}